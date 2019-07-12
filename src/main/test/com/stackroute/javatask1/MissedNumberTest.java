package com.stackroute.javatask1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissedNumberTest {
        public static MissedNumber  missedNumber;

        @BeforeClass
        public static void setUp() {
            missedNumber = new MissedNumber();
        }

        @AfterClass
        public static void tearDown() {
            missedNumber = null;
        }

        @Test
        public void shouldReturnMissedNUmberInTheArray() {
            int result = missedNumber.getMissingNumber(new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50});
            assertEquals(10, result);
        }
        @Test
        public void shouldotReturnMissedNUmberInTheArray() {
        int result = missedNumber.getMissingNumber(new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50});
        assertNotEquals(1, result);
        }


     /* @Test
      public void shouldReturnMissedNUmberInTheArray() {
          int result = missedNumber.getMissingNumber();
          assertEquals(4, result);

    }*/
}