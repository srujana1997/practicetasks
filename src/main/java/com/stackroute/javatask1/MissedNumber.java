package com.stackroute.javatask1;
//program for missing number
public class MissedNumber {
    // Function to get the missing number
    public int getMissingNumber(int arr[])
    {
        /*int arr1[]=new int[]{1,2,3,5};
        int n=4;
        int t=(n+1)*(n+2)/2;
        for (int i = 0; i <arr1.length; i++) {
            t -= arr1[i];
        }
        return t;*/

        int n=49;
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i <n; i++) {
            total -= arr[i];
        }
        return total;
    }
}
