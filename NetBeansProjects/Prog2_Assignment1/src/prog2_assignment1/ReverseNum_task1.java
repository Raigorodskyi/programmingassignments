/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_assignment1;

/**
 *
 * @author Igor Raigorodskyi
 */
public class ReverseNum_task1 {
    public static void main(String[] args) {
    }
    
    public static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {            
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }
}
