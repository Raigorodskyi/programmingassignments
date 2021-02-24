/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unluckyrobot;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Igor Raigorodskyi
 */
public class UnluckyRobot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalScore = 300;
        int itrCount = 0;
        int reward;
        int x = 0;
        int y = 0; 
        char direction;
        // the do loop would repeat the same piece of the code untill the gameOver
        //condition is false
        do {            
            //display info would show the current position of the robot, score 
            //and number of iterations
            displayInfo(x, y, itrCount, totalScore);
            //the char direction would store the direction that user inputs
            direction = inputDirection();
            paymentRules(totalScore, direction);
            if (direction == 'd') {
                y--;}
            if (direction == 'u') {
                y++;}
            if (direction == 'l') {
                x--;}
            if (direction == 'r') {
                x++;}
            reward = reward();
            if (direction == 'u' && reward<0){
                reward = punishOrMercy(direction, reward);}
            if (doesExceed(x, y, direction) == true) {
                totalScore -= 2000;
                if (x == -1) {
                    x = 0;}
                if (x == 5){
                    x = 4;}
                if (y == -1){
                    y = 0;}
                if (y == 5) {
                    y = 4;}
                System.out.println("Exceed boundary, -2000 damage applied");
            }
            totalScore += paymentRules(totalScore, direction);
            
            totalScore += reward;
            itrCount ++;
        } while (isGameOver(x, y, totalScore, itrCount)!=true);
        if (isGameOver(x, y, totalScore, itrCount)==true) {
            evaluation(totalScore);
        }
    }
    /**
     * 
     * @param x is the current location of the robot on the x axe
     * @param y is the current location of the robot on the y axe
     * @param itrCount is the number of iterations made by the robot
     * @param totalScore is the current score of the robot
     */
    public static void displayInfo(int x, int y, int itrCount, int totalScore){
        if (itrCount == 0){
            System.out.printf("%s%s%d, %s%d%s %s: %d %s: %d\n", "For point (", "X=", x,
                    "Y=", y, ")", "at iteration", itrCount, "the total score is", totalScore);}
        else{
            System.out.printf("\n%s%s%d, %s%d%s %s: %d %s: %d\n", "For point (", "X=", x,
                    "Y=", y, ")", "at iteration", itrCount, "the total score is", totalScore);}
    }
    /**
     * The function asks the user the direction the robot would go
     * @return char direction (up, down, left, or right)
     */
    public static char inputDirection(){
        Scanner console = new Scanner(System.in);
        System.out.print("Please input a valid direction: ");
        char direction = console.nextLine().charAt(0); 
        return direction;
    }
    /**
     * 
     * @param x checks the current robot's location on the x axe
     * @param y checks the current robot's location on the y axe
     * @param direction indicates where the robot would move
     * @return true if the robots exceeds the grid and false if it is not
     */
    public static boolean doesExceed(int x, int y , char direction){
        return x>4 || x<0 || y>4 || y<0;
    }
    /**
     * The function would play the role of a dice and depending of the dice
     * it would either give the robot a reward, or a punishment
     * @return reward (positive number) or punishment (negative number)
     */
    public static int reward(){
        Random rand = new Random();
            int dice = rand.nextInt(6) + 1;
        switch(dice){
            case 1:
                System.out.println("Dice: " + dice + ", reward: -100");
                return -100;
            case 2:
                System.out.println("Dice: " + dice + ", reward: -200");
                return -200;
            case 3:
                System.out.println("Dice: " + dice + ", reward: -300");
                return -300;
            case 4:
                System.out.println("Dice: " + dice + ", reward: 300");
                return 300;
            case 5:
                System.out.println("Dice: " + dice + ", reward: 400");
                return 400;
            default:
                System.out.println("Dice: " + dice + ", reward: 600");
                return 600;
        }
                
    }
    /**
     * If the reward is a negative number, there is a chance that this will not 
     * be applied to the score if the robot moves up. This function would play 
     * a role of a coin. If it's tail, the negative reward would be removed.
     * In other case, it would be applied.
     * @param direction checks where the user wants the robot to go
     * @param reward checks if the reward is negative
     * @return punishment or mercy
     */
    public static int punishOrMercy(char direction, int reward){
        if (reward<0 && direction == 'u') {
            Random random = new Random();
                int coin = random.nextInt(2);
            if (coin == 0) {
                System.out.print("Coin: tail | Mercy, the negative reward is removed.\n");
                return 0;} 
            else{
                System.out.print("Coin: head | No mercy, the negative rewarded is applied.\n");
                return reward;
                }
        }
        return 0;
    }
    /**
     * This function would bring the name in title case if user haven't input it
     * like that already
     * @param str user's name
     * @return user's name in title case
     */
    public static String toTitleCase(String str){
        str = str.toLowerCase();
        String fName = str.substring(0, str.indexOf(" "));
        String lName = str.substring(str.indexOf(" ")+1);  
        String fLetfName = fName.charAt(0) + "";
        String fLetlName = lName.charAt(0) + "";
        return fLetfName.toUpperCase() + str.substring(1, str.indexOf(" ")) + " " +
                fLetlName.toUpperCase() + str.substring(str.indexOf(" ") + 2);
    }
    /**
     * This function would check if the user would win or lose the game
     * @param totalScore helps to check if the user has won or has lost the game
     */
    public static void evaluation(int totalScore) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name (only two words): ");
        String name = console.nextLine();
        if (totalScore>=2000){
            System.out.println("Victory, " + toTitleCase(name) + 
                    ", your score is " + totalScore);}
        else{
            System.out.println("Mission is failed, " + toTitleCase(name) + ", your score is "
                    + totalScore);}
    }
    /**
     * 
     * @param x checks the current robot's location on the x axe
     * @param y checks the current robot's location on the y axe
     * @param totalScore checks robot's score
     * @param itrCount checks the number of iterations the robot had made
     * @return true or false
     */
    public static boolean isGameOver(int x, int y, int totalScore, int itrCount){
        if (x==4 && y==4 || x==4 && y==0) {
            return true;}
        if (totalScore>2000 || totalScore<-1000) {
            return true;}
        if (itrCount > 20){
            return true;}
        return false;
    }
    /**
     * 
     * @param totalScore checks the current score of the robot
     * @param direction check th direction put by the user
     * @return the payment that the robot should do for a move
     */
    public static int paymentRules(int totalScore, char direction){
        switch (direction){
            case 'd':
            case 'r':
            case 'l':
                return -50;
            default:
                return -10;
        }
    }
}
