package com.akshayLocal.DSA.programs.Platform;

public class WaysToTotal {
    static int count=0;
    public static int ways(int total, int k) {

        partition(total, k);
        return count;

    }
    public static void partition(int total,int max)
    {
        if(total==0)
        {
            count++;
            return;
        }
        for(int i = Math.min(max,total);i>=1;i--)
        {
            ways(total-i,i);
        }

    }
}
