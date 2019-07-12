package com.stackroute.javatask1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberFormatTest {
    public static NumberFormat numberformat;
    @BeforeClass
    public static void setUp()
    {
        numberformat = new NumberFormat();
    }

    @AfterClass
    public static void tearDown()
    {
        numberformat = null;
    }

    @Test
    public void shouldReturnRequiredFormat()
    {
        String result=numberformat.numberFormatting(234);
        assertEquals("HHTTT1234",result);
    }
    @Test
    public void shouldNotReturnRequiredFormat()
    {
        String result=numberformat.numberFormatting(234);
        assertNotEquals("HHTT134",result);
    }


}