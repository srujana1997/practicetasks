package com.stackroute.javatask1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArmstrongNumbersTest {

    public static ArmstrongNumbers armstrongnumbers;

    @BeforeClass
    public static void setUp()
    {
        armstrongnumbers = new ArmstrongNumbers();
    }

    @AfterClass
    public static void tearDown()
    {
        armstrongnumbers = null;
    }

    @Test
    public void shouldReturnArmstrongNumbersInBetween1And500()
    {
        String result=armstrongnumbers.checkigForArmstrongNumber();

        assertEquals("1 153 370 371 407",result);

    }

    @Test
    public void shouldNotReturnArmstrongNumbersInBetween1And500()
    {
        String result=armstrongnumbers.checkigForArmstrongNumber();

        assertNotEquals("1 15 33 70 371 407",result);

    }

}