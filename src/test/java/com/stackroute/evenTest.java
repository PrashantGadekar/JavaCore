package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class evenTest {
    private static EvenNumTest even;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        even = new EvenNumTest();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        even = null;
    }

    @Test
    public void testIsEven(){
        assertEquals("Error in code, cannot check palindrome",true, even.isEven(16) );
        assertEquals("Error in code, cannot check palindrome", false, even.isEven(19));
        assertEquals("Check your code mate, what have you done", true, even.isEven(454));
    }
}
