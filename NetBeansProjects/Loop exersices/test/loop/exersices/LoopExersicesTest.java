/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop.exersices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2003i
 */
//public class LoopExersicesTest {
//    
//    public LoopExersicesTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of main method, of class LoopExersices.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        LoopExersices.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of countDigit method, of class LoopExersices.
//     */
//    @Test
///*    public void testCountDigit() {
//        System.out.println("countDigit");
//        String str = "";
//        int expResult = 0;
//        int result = LoopExersices.countDigit(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of sumRange method, of class LoopExersices.
//     */
//    @Test
//    public void testSumRange() {
//        System.out.println("sumRange");
//        int num1 = 0;
//        int num2 = 0;
//        int expResult = 0;
//        int result = LoopExersices.sumRange(num1, num2);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reverseString method, of class LoopExersices.
//     */
//    @Test
//    public void testReverseString() {
//        System.out.println("reverseString");
//        String str = "";
//        String expResult = "";
//        String result = LoopExersices.reverseString(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeDigits method, of class LoopExersices.
//     */
//    @Test
//    public void testRemoveDigits() {
//        System.out.println("removeDigits");
//        String str = "";
//        String expResult = "";
//        String result = LoopExersices.removeDigits(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isPrime method, of class LoopExersices.
//     */
//    @Test
//    public void testIsPrime() {
//        System.out.println("isPrime");
//        int num = 0;
//        boolean expResult = false;
//        boolean result = LoopExersices.isPrime(num);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of containsVowel method, of class LoopExersices.
//     */
//    @Test
//    public void testContainsVowel() {
//        System.out.println("containsVowel");
//        String str = "";
//        boolean expResult = false;
//        boolean result = LoopExersices.containsVowel(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of strConsonant method, of class LoopExersices.
//     */
//    @Test
//    public void testStrConsonant() {
//        System.out.println("strConsonant");
//        String str = "";
//        String expResult = "";
//        String result = LoopExersices.strConsonant(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reverseString1 method, of class LoopExersices.
//     */
//    @Test
//    public void testReverseString1() {
//        System.out.println("reverseString1");
//        String str = "";
//        String expResult = "";
//        String result = LoopExersices.reverseString1(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reverseNum1 method, of class LoopExersices.
//     */
//    @Test
//    public void testReverseNum1() {
//        System.out.println("reverseNum1");
//        int num = 0;
//        int expResult = 0;
//        int result = LoopExersices.reverseNum1(num);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reverseNum2 method, of class LoopExersices.
//     */
//    @Test
//    public void testReverseNum2() {
//        System.out.println("reverseNum2");
//        int num = 0;
//        int expResult = 0;
//        int result = LoopExersices.reverseNum2(num);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of add method, of class LoopExersices.
//     */
//    @Test
//    public void testAdd() {
//        System.out.println("add");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        double expResult = 0.0;
//        double result = LoopExersices.add(num1, num2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of substract method, of class LoopExersices.
//     */
//    @Test
//    public void testSubstract() {
//        System.out.println("substract");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        double expResult = 0.0;
//        double result = LoopExersices.substract(num1, num2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of divide method, of class LoopExersices.
//     */
//    @Test
//    public void testDivide() {
//        System.out.println("divide");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        double expResult = 0.0;
//        double result = LoopExersices.divide(num1, num2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of multiply method, of class LoopExersices.
//     */
//    @Test
//    public void testMultiply() {
//        System.out.println("multiply");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        double expResult = 0.0;
//        double result = LoopExersices.multiply(num1, num2);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calcResult method, of class LoopExersices.
//     */
//    @Test
//    public void testCalcResult() {
//        System.out.println("calcResult");
//        double num1 = 0.0;
//        double num2 = 0.0;
//        char oper = ' ';
//        double expResult = 0.0;
//        double result = LoopExersices.calcResult(num1, num2, oper);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isOperValid method, of class LoopExersices.
//     */
//    @Test
//    public void testIsOperValid() {
//        System.out.println("isOperValid");
//        char oper = ' ';
//        boolean expResult = false;
//        boolean result = LoopExersices.isOperValid(oper);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeVowel method, of class LoopExersices.
//     */
//    @Test
//    public void testRemoveVowel() {
//        System.out.println("removeVowel");
//        String str = "";
//        String expResult = "";
//        String result = LoopExersices.removeVowel(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printNoThreeGame method, of class LoopExersices.
//     */
//    @Test
//    public void testPrintNoThreeGame() {
//        System.out.println("printNoThreeGame");
//        int num = 0;
//        LoopExersices.printNoThreeGame(num);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printNum method, of class LoopExersices.
//     */
//    @Test
//    public void testPrintNum() {
//        System.out.println("printNum");
//        int bound = 0;
//        int quitNum = 0;
//        LoopExersices.printNum(bound, quitNum);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isPalindrome method, of class LoopExersices.
//     */
//    @Test
//    public void testIsPalindrome() {
//        System.out.println("isPalindrome");
//        String str = "";
//        boolean expResult = false;
//        boolean result = LoopExersices.isPalindrome(str);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }*/
    
//}
