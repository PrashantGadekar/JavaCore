package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private static User use;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        use  = new User();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        use = null;
    }




    @Test
    public void testIsAgeValid(){
        use.setAge(17);
        use.setFirstName("Prashant");
        use.setLastName("Gadekar");
        assertEquals("Error in code, cannot check palindrome",false, use.isValidAge() );
        assertEquals("Error in code, cannot check palindrome", "Prashant Gadekar", use.getFullName());
      //  assertEquals("Check your code mate, what have you done", 0, palim.isPalindrome("nitin"));
    }
}
