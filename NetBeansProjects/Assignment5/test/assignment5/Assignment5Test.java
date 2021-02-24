/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

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
public class Assignment5Test {
    
    public Assignment5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Assignment5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment5.main(args);
    }

    /**
     * Test of generateAlphabetString method, of class Assignment5.
     */
    @Test
    public void testGenerateAlphabetString() {
        System.out.println("generateAlphabetString");
        int num = 3;
        char caseType = 'u';
        String expResult = "ABC";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString2() {
        System.out.println("generateAlphabetString");
        int num = 6;
        char caseType = 'l';
        String expResult = "abcdef";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString3() {
        System.out.println("generateAlphabetString");
        int num = -3;
        char caseType = 'L';
        String expResult = "";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString4() {
        System.out.println("generateAlphabetString");
        int num = 27;
        char caseType = 'U';
        String expResult = "ABCDEFGHIJKLMNOPQRSTUVWXYZA";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString5() {
        System.out.println("generateAlphabetString");
        int num = 4;
        char caseType = 'L';
        String expResult = "abcd";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }
    @Test
    public void testGenerateAlphabetString6() {
        System.out.println("generateAlphabetString");
        int num = 30;
        char caseType = 'u';
        String expResult = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCD";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }

    /**
     * Test of hideCharacter method, of class Assignment5.
     */
    @Test
    public void testHideCharacter() {
        System.out.println("hideCharacter");
        String str = "hello";
        int idx = 3;
        String expResult = "---l-";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }
    @Test
    public void testHideCharacter2() {
        System.out.println("hideCharacter");
        String str = "java";
        int idx = 1;
        String expResult = "-a--";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }
    @Test
    public void testHideCharacter3() {
        System.out.println("hideCharacter");
        String str = "hmmmm";
        int idx = 6;
        String expResult = "hmmmm";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }
    @Test
    public void testHideCharacter4() {
        System.out.println("hideCharacter");
        String str = "hmmmm";
        int idx = -3;
        String expResult = "hmmmm";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }
    @Test
    public void testHideCharacter5() {
        System.out.println("hideCharacter");
        String str = "Shalom";
        int idx = 4;
        String expResult = "----o-";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }
    @Test
    public void testHideCharacter6() {
        System.out.println("hideCharacter");
        String str = "Hello World";
        int idx = 5;
        String expResult = "----- -----";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);
    }

    /**
     * Test of containsIgnoreCase method, of class Assignment5.
     */
    @Test
    public void testContainsIgnoreCase() {
        System.out.println("containsIgnoreCase");
        String str = "hello";
        char c = 'H';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase2() {
        System.out.println("containsIgnoreCase");
        String str = "java";
        char c = '*';
        boolean expResult = false;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase3() {
        System.out.println("containsIgnoreCase");
        String str = "Canada";
        char c = 'l';
        boolean expResult = false;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase4() {
        System.out.println("containsIgnoreCase");
        String str = "Wow!";
        char c = '!';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase5() {
        System.out.println("containsIgnoreCase");
        String str = "Jerusalem";
        char c = 'j';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }
    @Test
    public void testContainsIgnoreCase6() {
        System.out.println("containsIgnoreCase");
        String str = "22 * 4 = 88";
        char c = '8';
        boolean expResult = true;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);
    }

    /**
     * Test of encode method, of class Assignment5.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String strIn = "hello";
        int delta = 1;
        String expResult = "ifmmp";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode2() {
        System.out.println("encode");
        String strIn = "java";
        int delta = -1;
        String expResult = "izuz";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode3() {
        System.out.println("encode");
        String strIn = "hmmm";
        int delta = 3;
        String expResult = "kppp";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode4() {
        System.out.println("encode");
        String strIn = "Yeah!";
        int delta = -2;
        String expResult = "Wcyf!";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode5() {
        System.out.println("encode");
        String strIn = "Azazaz";
        int delta = 1;
        String expResult = "Bababa";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEncode6() {
        System.out.println("encode");
        String strIn = "Zazaza";
        int delta = -2;
        String expResult = "Xyxyxy";
        String result = Assignment5.encode(strIn, delta);
        assertEquals(expResult, result);
    }
    
}
