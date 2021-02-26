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
import java.util.Arrays;
import java.util.ArrayList;
import prog2assign03.Animal;
/**
 *
 * @author Igor Raigorodskyi
 */
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>(); 
    // creating an abstract new Animal to use it in the methods
    Animal animal = new Animal();

    public Zoo() {
        animals = null;
    }
    
    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
    public Zoo(Zoo zoo) {
        this.animals = zoo.animals;
    }
    
    public int countAnimals(String type) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.getType().equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }
    
    public void updateValidTypes() {
        for (int i = 0; i < animal.getLegalTypes().size(); i++) {
            int count = 0;
            for (Animal animal1 : animals) {
                if (animal1.getType().equalsIgnoreCase(animal.getLegalTypes().get(i))) {
                  count++;  
                }
            }
            if (count == 0) {
                animal.getLegalTypes().remove(i);
            }
        }
    }
    
    public boolean isGenderBalanced(String type) {
        // creating an ArrayList with size of the number of the animals of that type
        ArrayList<Animal> animalsOfType = new ArrayList<>(countAnimals(type));
        // adding the animals of that type to the ArrayList
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase(type)) {
                animalsOfType.add(animal1);
            }
        }
        int males = 0;
        int females = 0;
        for (Animal animalOfType : animalsOfType) {
            if (animalOfType.getGender().equalsIgnoreCase("male")) {
                males++;
            } else {
                females++;
            }
        }
        return ((Math.max(females, males) / animalsOfType.size() * 100) - 
                (Math.min(females, males) / animalsOfType.size() * 100)) < 20;
    }
    
    public void removeOldest(String type) {
        // creating an ArrayList with size of the number of the animals of that type
        ArrayList<Animal> animalsOfType = new ArrayList<>(countAnimals(type));
        // adding the animals of that type to the ArrayList
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase(type)) {
                animalsOfType.add(animal1);
            }
        }
        // figuring out what is the oldest age
        int oldestAge = 0;
        for (Animal animalOfType : animalsOfType) {
            if (animalOfType.getAge() > oldestAge) {
                oldestAge = animalOfType.getAge();
            }
        }
        // removing the animals whose age equals the oldest age
        for (int i = 0; i < animalsOfType.size(); i++) {
            if (animalsOfType.get(i).getAge() == oldestAge) {
                animalsOfType.remove(i);
            }
        }
        updateValidTypes();
    }
    
    public boolean equals(Zoo zoo) {
        return this.animals.equals(zoo.animals);
    }
    
    // added the 2 methods to count males and females 
    public int countMales(ArrayList<Animal> animals) {
        int count = 0;
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase("male")) {
                count++;
            }
        }
        return count;
    }
    
    public int countFemales(ArrayList<Animal> animals) {
        int count = 0;
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase("female")) {
                count++;
            }
        }
        return count;
    }
    
    public int countTypeFemales(ArrayList<Animal> animals, String type) {
        // creating an ArrayList with size of the number of the animals of that type
        ArrayList<Animal> animalsOfType = new ArrayList<>(countAnimals(type));
        // adding the animals of that type to the ArrayList
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase(type)) {
                animalsOfType.add(animal1);
            }
        }
        int count = 0;
        for (Animal animalOfType : animalsOfType) {
            if (animalOfType.getType().equalsIgnoreCase("female")) {
                count++;
            }
        }
        return count;
    }
    
    public int countTypeMales(ArrayList<Animal> animals, String type) {
        // creating an ArrayList with size of the number of the animals of that type
        ArrayList<Animal> animalsOfType = new ArrayList<>(countAnimals(type));
        // adding the animals of that type to the ArrayList
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase(type)) {
                animalsOfType.add(animal1);
            }
        }
        int count = 0;
        for (Animal animalOfType : animalsOfType) {
            if (animalOfType.getType().equalsIgnoreCase("male")) {
                count++;
            }
        }
        return count;
    }
    
    public int getOldestAge(String type) {
        // creating an ArrayList with size of the number of the animals of that type
        ArrayList<Animal> animalsOfType = new ArrayList<>(countAnimals(type));
        // adding the animals of that type to the ArrayList
        for (Animal animal1 : animals) {
            if (animal1.getType().equalsIgnoreCase(type)) {
                animalsOfType.add(animal1);
            }
        }
        // figuring out what is the oldest age
        int oldestAge = 0;
        for (Animal animalOfType : animalsOfType) {
            if (animalOfType.getAge() > oldestAge) {
                oldestAge = animalOfType.getAge();
            }
        }
        return oldestAge;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%s %d\n", "Total Number of Animals:", animals.size());
        str += String.format("%s %d\n", "Male:", countMales(animals));
        str += String.format("%s %d\n", "Female:", countFemales(animals));
        
        str += "Dog:\n";
        str += String.format("%-4s%-10s: %d\n", "Number:", countAnimals("Dog"));
        str += String.format("%-4s%-10s: %d\n", "Male:", countTypeMales(animals, "dog"));
        str += String.format("%-4s%-10s: %d\n", "Female:", countTypeMales(animals, "dog"));
        if (isGenderBalanced("Dog")) {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "Yes");
        } else {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "No");
        }
        str += String.format("%-4s%-10s: %d\n", "Oldest Age:", getOldestAge("Dog"));
        
        str += "Cat:\n";
        str += String.format("%-4s%-10s: %d\n", "Number:", countAnimals("Cat"));
        str += String.format("%-4s%-10s: %d\n", "Male:", countTypeMales(animals, "Cat"));
        str += String.format("%-4s%-10s: %d\n", "Female:", countTypeMales(animals, "Cat"));
        if (isGenderBalanced("Cat")) {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "Yes");
        } else {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "No");
        }
        str += String.format("%-4s%-10s: %d\n", "Oldest Age:", getOldestAge("Cat"));
        
        str += "Monkey:\n";
        str += String.format("%-4s%-10s: %d\n", "Number:", countAnimals("Monkey"));
        str += String.format("%-4s%-10s: %d\n", "Male:", countTypeMales(animals, "Monkey"));
        str += String.format("%-4s%-10s: %d\n", "Female:", countTypeMales(animals, "Monkey"));
        if (isGenderBalanced("Monkey")) {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "Yes");
        } else {
            str += String.format("%-4s%-10s: %s\n", "Balanced", "No");
        }
        str += String.format("%-4s%-10s: %d\n", "Oldest Age:", getOldestAge("Monkey"));
        
        return str;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}