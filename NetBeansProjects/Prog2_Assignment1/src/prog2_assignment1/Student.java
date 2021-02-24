/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_assignment1;
import java.util.Random;

/**
 *
 * @author Igor Raigorodskyi
 */
public class Student {
    private String fName;
    private String lName;
    private int age;
    private Address addr;
    private String email;
    
    public Student() {
        this.fName = null;
        this.lName = null;
        this.age = 0;
        this.addr = null;
        this.email = null;
    }

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public Student(String fName, String lName, int age, Address addr) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.addr = addr;
    }
    
    public Student(Student student) {
        this.fName = student.fName;
        this.lName = student.lName;
        this.age = student.age;
        this.addr = student.addr;
    }
    
    public String generateEmail() {
         Random rand = new Random();
         int num = rand.nextInt(10000);
        return lName.toLowerCase() + (fName.charAt(0) + "").toLowerCase() + 
                String.format("%04d", num) +
                "@vaniercollege.qc.ca";
    }
    
    public static String toTitleCase(String str) {
        String strToTitle = "";
        for (int i = 0; i < str.length(); i++) {
            String currentChar = str.charAt(i) + "";
            if (i == 0) {
                strToTitle += currentChar.toUpperCase();
            }
            else if (str.charAt(i - 1) == ' ') {
                strToTitle += currentChar.toUpperCase();
            }
            else {
                strToTitle += currentChar.toLowerCase();
            }
        }
        return strToTitle;
    }
    
    public boolean equals(Student student) {
        return this.fName.equals(student.fName) && this.lName.equals(student.lName) &&
                this.addr.equals(student.addr) && this.age == student.age;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-10s: %s %s\n", "Name", toTitleCase(this.fName), 
                toTitleCase(this.lName));
        str += String.format("%-10s: %d\n", "Age", this.age);
        str += "Address   :\n";
        str += addr.toString();
        str += String.format("%-10s: %s\n", "Email", generateEmail());
        
        return str;
    }

    public Address getAddr() {
        return addr;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getfName() {
        return toTitleCase(fName);
    }

    public String getlName() {
        return toTitleCase(fName);
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setfName(String fName) {
        this.fName = toTitleCase(fName);
    }

    public void setlName(String lName) {
        this.lName = toTitleCase(lName);
    }
}
