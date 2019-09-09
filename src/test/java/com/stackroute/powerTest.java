package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class powerTest {

    private static power pow;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        pow = new power();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        pow = null;
    }

    @Test
    public void testIsPower(){
        assertEquals("Error in code, cannot check palindrome",0, pow.isPower(16) );
        assertEquals("Error in code, cannot check palindrome", 1, pow.isPower(12));
        assertEquals("Check your code mate, what have you done", 0, pow.isPower(1024));
    }
}
