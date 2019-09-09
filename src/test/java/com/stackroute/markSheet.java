package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class markSheet {
    private static markgrade mak;

    @BeforeClass
    public static void setup(){
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        mak = new markgrade();
    }

    @AfterClass
    public static void teardown(){
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        mak = null;
    }

    int[] g1 = {12,14,15,19};
    int[] g2 = {99,67,89,95,56};
    int[] g3 = {45,78,33,90,67,94,58};

    @Test
    public void testIsMax(){

        assertEquals("Error in code, cannot check palindrome",19, mak.max(g1) );
        assertEquals("Error in code, cannot check palindrome", 99, mak.max(g2));
        assertEquals("Check your code mate, what have you done", 94, mak.max(g3));
    }

    @Test
    public void testIsMin(){

        assertEquals("Error in code, cannot check palindrome",12, mak.min(g1) );
        assertEquals("Error in code, cannot check palindrome", 56, mak.min(g2));
        assertEquals("Check your code mate, what have you done", 33, mak.min(g3));
    }

    @Test
    public void testIsAvg(){

        assertEquals("Error in code, cannot check palindrome",15.0,  mak.avg(g1),mak.avg(g1)/100.0 );
        assertEquals("Error in code, cannot check palindrome", 81.0, mak.avg(g2),0.1);
        assertEquals("Check your code mate, what have you done", 66.0, mak.avg(g3),mak.avg(g3)/100.0);
    }

}
