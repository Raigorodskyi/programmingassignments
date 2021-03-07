/*
 *MIT License

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
/**
 *
 * @author Igor Raigorodskyi
 */
public class Prog2Assign03 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        double[][] numss = {{34, 33, 45, 155}, {11, 32, 53, 24}, {12, 14, 15, 54}};
        double[][] numss2 = {{1, -12, 13, -14, 100, 1223}, {111, 2, 33, 44, 55, 5} ,{1.11, 4.7, 3.33}, {23456, 654, 5}};
        Task1 task1 = new Task1();
//        System.out.println(Arrays.deepToString(task1.add(numss, numss2)));
//        System.out.println(Arrays.deepToString(task1.deleteRow(numss2, 3)));
//        System.out.println(Arrays.deepToString(task1.transposeMatrix(numss)));
//        System.out.println(Arrays.deepToString(task1.appendArray(numss, numss2)));
//        System.out.println(Arrays.deepToString(task1.expendArray(numss, numss2)));
//        System.out.println(Arrays.toString(task1.minOfCol(numss)));
//        System.out.println(Arrays.toString(task1.minOfRow(numss)));
//        System.out.println(task1.min(numss));


        Animal animal = new Animal("Olga", "male", 6, "Dog");
        Animal animal2 = new Animal("Oleg", "female", 12, "cat");
        Animal animal3 = new Animal("Olga", "male", 8, "cat");
        Animal animal4 = new Animal("Olga", "male", 10, "dog");
        Animal animal10 = new Animal("Olga", "male", 11, "dog");
        Animal animal11 = new Animal("Olga", "male", 10, "dog");
        Animal animal12 = new Animal("Olga", "male", 10, "dog");
        Animal animal5 = new Animal("Olga", "female", 12, "cat");
        Animal animal6 = new Animal("Olga", "female", 1, "dog");
        Animal animal7 = new Animal("Olga", "male", 2, "cat");
        Animal animal8 = new Animal("Olga", "male", 12, "monkey");
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Animal[] {animal, animal2, animal3,
                animal4, animal5, animal6, animal7, animal8, animal10, animal11, animal12}));
//        System.out.println(animal.getAge());
//        System.out.println(animal.toString());
//        System.out.println(animal.getLegalTypes());
        Zoo zoo = new Zoo(animals);
//        zoo.updateValidTypes();
//        System.out.println(animal.getLegalTypes());
//        System.out.println(zoo.getOldestAge("cat"));
        zoo.removeOldest("cat");
        System.out.println(zoo.getOldestAge("cat"));
        System.out.println(zoo.toString());
        //System.out.println(zoo.countAnimals("dog"));
    }
    
}
