package com.akshayLocal.programs.Array;

public class HighestContigousSum {

    public static void main(String args[])
    {
        int[] arr = {13,44,10,90,23,56};
        int sum = arr[0] + arr[1];
        int j=0;

        for(int i=0;i<arr.length-1;i++)
        {
            if(sum<(arr[i] + arr[i+1]))
            {
                j=i;
                sum=arr[i] + arr[i+1];
            }
        }
    System.out.println("arr[" + j + "] + arr[" + (j+1) + "] = " + sum);

    }
}
