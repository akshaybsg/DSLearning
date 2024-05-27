package com.akshayLocal.DSA.programs.array;

public class SmallestNumberProductN {

    public static void main(String args[]) {
        System.out.println(getSmallestNumberWhoseProductIsN(100));
        System.out.println(getSmallestNumberWhoseProductIsN(81000));
        System.out.println(getSmallestNumberWhoseProductIsN(17));
        System.out.println(getSmallestNumberWhoseProductIsN(517));

    }

    static int getSmallestNumberWhoseProductIsN(int n) {
        String ans = "";
        for( int div = 9 ; div > 1; div --) {
            while (n % div == 0 ) {

                n = n/div;
                ans = div + ans;
            }
        }
        if(n!=1) {
            return -1;
        }
        else
            return Integer.parseInt(ans);
    }
}
