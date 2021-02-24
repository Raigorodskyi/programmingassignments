/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexercise;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author 2003i
 */
public class ArrayListExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // not recommended, has no datatype restriction
        ArrayList al1 = new ArrayList();        //array list of objects
        
        //suggested with datatype restrictions, you can only put class in  <> 
        ArrayList<Integer> al2 = new ArrayList<>();   // capacity = 10 
        ArrayList<Integer> al3 = new ArrayList<>(100);  //capacty = 100  

//        Integer[] nums = {1, 2, 3};
//        ArrayList<Integer> al4 = (ArrayList<Integer>) Arrays.asList(nums);
        
        al2.add(2);
        al2.add(1);
        al2.get(0); // same as nums[0]
        al2.set(0, -1);
        al2.remove((Integer)999);
        // .size() is the same as .length() for String ot as .length for arrays
        System.out.println(al1.size());
        //ArrayList is a class that includes toString() method that can be directly used
        System.out.println(al2);
        
        System.out.println(al2.get(1));
    }
    
}
