package com.akshayLocal.programs.Array;

import java.util.HashMap;

public class TwoSumArraySorted {

    public static void main(String srgs[]) {
        int[] intArr = new int[]{3 ,5 ,6 , 7,8 ,9 ,12 };
        int target = 9;
        int[] arr = twosumArr(intArr,target);
        int[] arrpair = twosumArrPair(intArr,target);
        System.out.println(arr[0] + " , " + arr[1]);
        System.out.println(arrpair[0] + " , " + arrpair[1]);

    }

    //TIme complexity O(nlogn)
    //Return indices of pairs
    public static int[] twosumArr(int[] intArr, int target)
    {
        int[] sol = new int[2];
        if(intArr.length==0)
            return new int[0];

        int left =0 , right =intArr.length -1;
        while(left <right) {
            if((intArr[left]+intArr[right]) == target) {
                sol[0] = left;
                sol[1] = right;
                return sol;
            } else if((intArr[left]+intArr[right]) < target) {
                left ++ ;
            } else {
                right -- ;
            }
        }

        return sol;
    }
    //Return pairs
    public static int[] twosumArrPair(int[] intArr, int target)
    {
        int[] sol = new int[2];
        if(intArr.length==0)
            return new int[0];

        int left =0 , right =intArr.length -1;
        while(left <right) {
            if((intArr[left]+intArr[right]) == target) {
                sol[0] = intArr[left];
                sol[1] = intArr[right];
                return sol;
            } else if((intArr[left]+intArr[right]) < target) {
                left ++ ;
            } else {
                right -- ;
            }
        }

        return sol;
    }
}
