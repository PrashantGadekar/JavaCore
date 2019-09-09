package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class palindromeTest {
    private static palindrome palim;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        palim = new palindrome();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        palim = null;
    }

    @Test
    public void testIsPalindrome(){
        assertEquals("Error in code, cannot check palindrome",0, palim.isPalindrome("1221") );
        assertEquals("Error in code, cannot check palindrome", 1, palim.isPalindrome("prashant"));
        assertEquals("Check your code mate, what have you done", 0, palim.isPalindrome("nitin"));
    }
}
