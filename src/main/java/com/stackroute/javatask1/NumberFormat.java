package com.stackroute.javatask1;
//program for number format
import java.util.Scanner;

public class NumberFormat {

    public String numberFormatting(int number){

            char[] num = String.format("%03d",number).toCharArray();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < num[0] - '0'; i++) {
                result.append("H");
            }

            for (int i = 0; i < num[1] - '0'; i++) {
                result.append("T");
            }

            for (int i = 0; i < num[2] - '0'; i++) {
                result.append(i + 1);
            }
            return result.toString();
        }
}

