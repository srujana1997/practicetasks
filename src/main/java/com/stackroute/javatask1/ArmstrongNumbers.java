package com.stackroute.javatask1;
//printing all Armstrong numbers between 1 to 500
public class ArmstrongNumbers {
    public String checkigForArmstrongNumber()
    {
        int n, remainder, sum = 0;

       // int[] result=new int[];

        StringBuffer result= new StringBuffer("");

        for(int i = 1; i <= 500; i++)
        {
            n = i;
            while(n > 0)
            {
                remainder = n % 10;
                sum = sum + (remainder * remainder * remainder);
                n = n / 10;
            }
            if(sum == i)
            {
                //result[i]=i;
                result.append(i+" ");

            }
            sum = 0;
        }
        return result.toString().trim();
    }

}
