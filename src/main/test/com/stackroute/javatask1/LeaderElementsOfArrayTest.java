package com.stackroute.javatask1;

import org.junit.*;

import static org.junit.Assert.*;

public class LeaderElementsOfArrayTest {

    public static LeaderElementsOfArray leaderelementsofarray;

    @BeforeClass
    public static void setUp()
    {
        leaderelementsofarray = new LeaderElementsOfArray();
    }

    @AfterClass
    public static void tearDown()
    {
        leaderelementsofarray = null;
    }

    @Test
    public void shouldReturnLeaderElementsOfArray()
    {
        StringBuffer result=leaderelementsofarray.printLeaders(new int[] {2,14,5,3,4});

        assertEquals(new StringBuffer("4 5 14").toString(),result.toString());

    }

    @Test
    public void shouldNotReturnLeaderElementsOfArray()
    {
        StringBuffer result=leaderelementsofarray.printLeaders(new int[] {2,14,5,3,4});

        assertNotEquals(new StringBuffer("4 6 14").toString(),result.toString());

    }


}