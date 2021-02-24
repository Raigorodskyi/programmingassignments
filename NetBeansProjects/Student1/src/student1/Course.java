/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student1;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Course {
    private String courseName;
    private double credit;
    private double assignmentScore;
    private double examScore;
    
    /**
     * Default constructor
     */
    public Course(){
        this.courseName = null;
        this.credit = 0;
        this.assignmentScore = 0;
        this.examScore = 0;
    }
    
    /**
     * Constructor with courseName and credit
     * @param courseName is the name of the course
     * @param credit is the credit of the course
     */
    public Course(String courseName, double credit){
        this.courseName = courseName;
        this.credit = credit;
    }
    
    /**
     * Constructor with all data members
     * @param courseName name of the course
     * @param credit credit of the course
     * @param assignmentScore the score for the assignment
     * @param examScore the score for the exam
     */
    public Course(String courseName, double credit, double assignmentScore,
            double examScore){
        this.courseName = courseName;
        this.credit = credit;
        this.assignmentScore = assignmentScore;
        this.examScore = examScore;
    }
    
    /**
     * Copy constructor
     * @param course another constructor
     */
    public Course(Course course){
        this.courseName = course.courseName;
        this.credit = course.credit;
        this.assignmentScore = course.assignmentScore;
        this.examScore = course.examScore;
    }
    
    /**
     * Method that calculates the final score
     * @return final score
     */
    public double calcFinalScore(){
        return assignmentScore * 0.4 + examScore * 0.6;
    }
    
    /**
     * Checks if the final score passes the course
     * @return if final score equals or is greater than 60
     */
    public boolean isPassed(){
        return calcFinalScore()>=60;
    }
    
    /**
     * Compare all data members
     * @param course another constructor course
     * @return if all data members are the same
     */
    public boolean equals(Course course){
        return this.courseName == course.courseName && this.credit == course.credit &&
                this.assignmentScore == course.assignmentScore && 
                this.examScore == course.examScore;
    }
    
    /**
     * To generate a string to represent all data members
     * @return a string to represent all data members
     */
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-17s: %s\n", "Course Name", courseName);
        str += String.format("%-17s: %.1f\n", "Credit", credit);
        str += String.format("%-17s: %.1f\n", "Exam Score", examScore);
        str += String.format("%-17s: %.1f\n", "Assignment Score", assignmentScore);
        str += String.format("%-17s: %.1f\n", "Final Score", calcFinalScore());
        
        return str;
    }

    
    public Object clone(Course course) throws CloneNotSupportedException {
        return course.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getAssignmentScore() {
        return assignmentScore;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredit() {
        return credit;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }
}
