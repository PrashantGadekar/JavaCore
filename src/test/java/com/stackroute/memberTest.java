package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class memberTest {
    private static member_variable mem;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        mem = new member_variable();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mem = null;
    }

    @Test
    public void testIsMember(){
        mem.set("Prashant",22,7.11);
        assertEquals("Error in code, cannot check palindrome",new String[]{"Members Name: Prashant", "Members Age: 22","Members Salary: 7.11"}, mem.display() );
        mem.set("Ganesh",20,7.11);
        assertEquals("Error in code, cannot check palindrome",new String[]{"Members Name: Ganesh", "Members Age: 20","Members Salary: 7.11"}, mem.display() );
        mem.set("Dhiraj",23,7.11);
        assertEquals("Error in code, cannot check palindrome",new String[]{"Members Name: Dhiraj", "Members Age: 23","Members Salary: 7.11"}, mem.display() );
    }
}
