package com.stackroute.javatask1;
public class LeaderElementsOfArray {

    public StringBuffer printLeaders(int arr[]) {

        /* Rightmost element is always leader */

        int max_from_right = arr[arr.length-1];

        //int[] result= new int[arr.length];

        //result[0] = max_from_right;

        StringBuffer result= new StringBuffer("");

        result.append(max_from_right);

       // int count=1;

        for (int i = arr.length-2; i >= 0; i--) {

            if (max_from_right < arr[i]) {

                max_from_right = arr[i];

                //result[count]=max_from_right;
                result.append(" "+max_from_right);

                //count++;
            }
        }
        return result;
    }
}