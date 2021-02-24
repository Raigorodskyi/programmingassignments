/*
 *MIT License

Copyright (c) [2020] [Igor Raigorodskyi]

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
/**
 *
 * @author Igor Raigorodskyi
 */
public class Prog2Assign03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] numss = {{1, 2, 4, 15}, {111, 2, 33, 44, 55, 5}};
        double[][] numss2 = {{1, -12, 13, -14, 100, 1223}, {111, 2, 33, 44, 55, 5} ,{1.11, 4.7, 3.33}};
        Task1 task1 = new Task1();
        //System.out.println(Arrays.deepToString(task1.add(numss, numss2)));
        //System.out.println(Arrays.deepToString(task1.deleteRow(numss2, 3)));
        //System.out.println(Arrays.deepToString(task1.appendArray(numss, numss2)));
        System.out.println(Arrays.deepToString(task1.expendArray(numss, numss2)));
    }
    
}
