package com.akshayLocal.programs.Array;

public class WaysToSum {


    public static void main(String args[])
    {
        // 1 1 1 1 1 1 1 1
        // 1 1 1 1 1 1 2
        //1 1 1 1 2 2
        //1 1 2 2 2
        //2 2 2 2
        System.out.println(ways(8,2));
    }
    static int count =0;
    public static int ways(int total, int k)
    {

        partition(total, k, " ");
        return count;


    }
    public static void partition(int n , int max , String prefix)
    {
        System.out.println(prefix);
        if(n==0)
        {
            count++;
            return;
        }
        for(int i=Math.min(max,n);i>=1;i--)
        {
            partition(n-i, i, prefix + " " + i);

        }

    }

}

