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
public class Student {
    private String name;
    private String gender;
    private String email;
    private Course course1;
    private Course course2;
    private Course course3;
    
    /**
     * Default constructor
     */
    private Student(){
        this.course1 = null;
        this.course2 = null;
        this.course3 = null;
    }
    
    /**
     * Constructor with name, gender and email
     * @param name name of the student
     * @param gender gender of the student
     * @param email email of the student
     */
    private Student(String name, String gender, String email){
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    
    /**
     * Constructor with all data members
     * @param name name of the student
     * @param gender gender of the student
     * @param email email of the student
     * @param course1 course 1 of the student
     * @param course2 course 2 of the student
     * @param course3 course 3 of the student
     */
    private Student(String name, String gender, String email, Course course1, 
            Course course2, Course course3){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }
    
    /**
     * Copy constructor
     * @param student another constructor
     */
    private Student(Student student){
        this.name = student.name;
        this.gender = student.gender;
        this.email = student.email;
        this.course1 = student.course1;
        this.course2 = student.course2;
        this.course3 = student.course3;
    }
    
    /**
     * Check how many courses student passed
     * @return number of passed courses
     */
    public int calcPassedCourseNum(){
        int passedCoursesNum = 0;
        if (course1.isPassed()){
            passedCoursesNum++;
        }
        if (course2.isPassed()) {
            passedCoursesNum++;
        }
        if (course3.isPassed()) {
            passedCoursesNum++;
        }
        return passedCoursesNum;
    }
    
    /**
     * Calculate the credits of the passed courses
     * @return the total credit
     */
    public double calcTotalCredit(){
        int totalCredit = 0;
        if (course1.isPassed()) {
            totalCredit += course1.getCredit();
        }
        if (course2.isPassed()) {
            totalCredit += course2.getCredit();
        }
        if (course3.isPassed()) {
            totalCredit += course3.getCredit();
        }
        return totalCredit;
    }
    
    /**
     * Checks if the email is valid
     * @return if the email is valid
     */
    public boolean isEmailValid(){
        return email.contains("@.") && email.lastIndexOf('.')<email.indexOf('@')+1 &&
                email.length() <= 320 && email.charAt(0)!= '@' && 
                email.charAt(email.length()-1)!='.';
    }
    
    /**
     * Comparing all data members
     * @param student another constructor
     * @return if all data members are the same
     */
    public boolean equals(Student student){
        return this.name == student.name && this.gender == student.gender && 
                this.email == student.email && this.course1 == student.course1 &&
                this.course2 == student.course2 && this.course3 == student.course3;
    }
    
    /**
     * Generates string to represent all data members
     * @return string representing all data members
     */
    @Override
    public String toString(){
        String str = "";
        
        str += String.format("%-25s: %s\n", "Name", name);
        str += String.format("%-25s: %s\n", "Gender", gender);
        str += String.format("%-25s: %s\n", "Email", email);
        str += String.format("s\n", " ");
        str += String.format("%-15s %-30s %-12s %s\n", "Course", "Name", "Credit", "Score");
        str += "----------------------------------------------------\n";
        str += String.format("%-15s: %-30s %-12s %s\n", "Course 1", course1.getCourseName(),
                course1.getCredit(), course1.calcFinalScore());
        str += String.format("%-15s: %-30s %-12s %s\n", "Course 2", course2.getCourseName(),
                course2.getCredit(), course2.calcFinalScore());
        str += String.format("%-15s: %-30s %-12s %s\n", "Course 3", course3.getCourseName(),
                course3.getCredit(), course3.calcFinalScore());
        str += String.format("%-20s: %d","Passed Courses", calcPassedCourseNum());
        str += String.format("%-20s: %.1f", "Total Credits", calcTotalCredit());
        
        return str;
    }

    public Course getCourse1() {
        return course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
