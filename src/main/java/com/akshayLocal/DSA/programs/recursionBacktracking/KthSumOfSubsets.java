package com.akshayLocal.DSA.programs.recursionBacktracking;

import java.util.ArrayList;

// int[] arr = {10,20,30,40}
public class KthSumOfSubsets {

    public static void main(String srgs[]) {
        int[] intarr = {10,20,30,40};
        int[] intarr2 = {3, 9, -2, 4 ,1 , -7, 2 , 6};
        int k = 40;
        int k2 = 8;
        printSubsetsSumK(intarr,0,k,new ArrayList<>());
        printSubsetsSumK(intarr2,0,k2,new ArrayList<>());
    }

    public static void printSubsetsSumK(int[] intarr, int position, int target, ArrayList<Integer> ans) {

            if(position == intarr.length) {
                if(target == 0) {
                    System.out.println(ans);
                }
                return;
            }

        // accept ith number
        ans.add(intarr[position]);
        printSubsetsSumK(intarr,position + 1, target - intarr[position],ans);
        ans.remove(ans.size() -1);

        // reject ith number
        printSubsetsSumK(intarr,position + 1,target, ans);
    }
}
