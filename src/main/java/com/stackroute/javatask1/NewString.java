package com.stackroute.javatask1;
//program to create a new String object with the contents of a character array.
public class NewString {
    public String newStringObject(char arr[]){
        // Create a String containig the contents of arr_char
        String str=new String("");
        str=str.copyValueOf(arr);
        return str;
    }
}
