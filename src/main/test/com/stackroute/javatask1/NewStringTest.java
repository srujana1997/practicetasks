package com.stackroute.javatask1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewStringTest {
    public static NewString newString;

    @BeforeClass
    public static void setUp() {
        newString = new NewString();
    }

    @AfterClass
    public static void tearDown() {
        newString = null;
    }

    @Test
    public void shouldReturnStringContentsOfCharArray() {
        String result = newString.newStringObject(new char[] {'s','r','u','j','a','n','a'});
        assertEquals("srujana", result);
    }

    @Test
    public void shouldReturnStringContentsOfCharArray1() {
        String result = newString.newStringObject(new char[] {'s','r','u','j','a','n','a'});
        assertNotEquals("sujana", result);
    }
}
