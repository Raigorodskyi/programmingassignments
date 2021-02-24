/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1review;

/**
 *
 * @author 2003i
 */
public class Student {
    private String fName;
    private String lName;
    private int age;
    private String gender;
    
    public Student() {
        this.fName = null;
        this.lName = null;
        this.age = 0;
        this.gender = null;
    }
    
    public Student(String fName, String lName, int age, String gender){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }
    
    public Student(Student student){
        this.fName = student.fName;
        this.lName = student.lName;
        this.age = student.age;
        this.gender = student.gender;
    }
    
    
    @Override
    public String toString(){
    String str = "";
    str += String.format("s-15s: %s %s", "Name", fName, lName);
    str += String.format("s-15s: %s", "Age", age);
    str += String.format("s-15s:, %s", "Gender", gender);
    return str;
    }
    
    public boolean equals(Student student){
        return this.age == student.age && this.fName.equals(student.fName) && 
                this.lName.equals(student.lName) && this.gender.equals(student.lName);
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
     
}
