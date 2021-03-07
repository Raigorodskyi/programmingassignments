/*
 * MIT License

Copyright (c) [2021] [Igor Raigorodskyi]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package prog2assign03;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Igor Raigorodskyi
 */
public class Animal {
    private String name;
    private String gender;
    private int age;
    private String type;
    private static ArrayList<String> legalTypes = new ArrayList(Arrays.asList(new String[] {"Cat", "Dog", "Monkey"}));
    
    
    public Animal() {
        this.name = null;
        this.gender = null;
        this.age = 0;
        this.type = null;
    }
    
    public Animal(String name, String gender, int age, String type) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.type = type;
    }
    
    public Animal(Animal animal) {
        this.age = animal.age;
        this.gender = animal.gender;
        this.name = animal.name;
        this.type = animal.type;
    }
    
    public boolean isTypeValid(String type) {
        for (String legalType : legalTypes) {
            if (legalType.equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean equals(Animal animal) {
        return this.age == animal.age && this.gender.equalsIgnoreCase(animal.gender) &&
                this.name.equalsIgnoreCase(animal.name) && this.type.equals(animal.type);
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-7s: %s\n", "Name", this.name);
        str += String.format("%-7s: %s\n", "Gender", this.gender);
        str += String.format("%-7s: %s\n", "Age", this.age);
        str += String.format("%-7s: %s\n", "Type", this.type);
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (isTypeValid(type)) {
        this.type = type;   
        }
    }

    public ArrayList<String> getLegalTypes() {
        return legalTypes;
    }

    public void setLegalTypes(ArrayList<String> legalTypes) {
        Animal.legalTypes = legalTypes;
    }    
}
