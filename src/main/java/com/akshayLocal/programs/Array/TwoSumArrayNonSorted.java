package com.akshayLocal.programs.Array;

import java.util.HashMap;

public class TwoSumArrayNonSorted {

    public static void main(String srgs[]) {
        int[] intArr = new int[]{5 ,6 ,2 , 7,3 ,9 ,1 };
        int target = 10;
        int[] arr = twosumArr(intArr,target);
        int[] arrpair = twosumArrPair(intArr,target);
        System.out.println(arr[0] + " , " + arr[1]);
        System.out.println(arrpair[0] + " , " + arrpair[1]);

    }

//TIme complexity O(n)
    //Return indices of pairs
    public static int[] twosumArr(int[] intArr, int target)
    {
        if(intArr.length==0)
            return new int[0];

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] sol = new int[2];
        for(int i=0;i<intArr.length;i++)
        {
            if(hmap.containsKey(target - intArr[i]))
            {
                sol[0] = hmap.get(target-intArr[i]);
                sol[1] = i;
                return sol;
            }
            hmap.put(intArr[i],i);
        }
        return sol;
    }
    //Return pairs
    public static int[] twosumArrPair(int[] intArr, int target)
    {
        if(intArr.length==0)
            return new int[0];

        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] sol = new int[2];
        for(int i=0;i<intArr.length;i++)
        {
            int secondELe = target - intArr[i];
            if(hmap.containsKey(secondELe))
            {
                sol[0] = secondELe;
                sol[1] = intArr[i];
                return sol;
            }
            hmap.put(intArr[i],i);
        }
        return sol;
    }
}
