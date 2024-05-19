package com.akshayLocal.programs.Array;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String srgs[]) {
        Integer arr[] = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatigELementwithSet(arr));
    }

    public static Integer firstRepeatigELementwithSet(Integer[] intArr)
    {
        int sol =0;
        //Initialize index of first repeating element
        int min=-1;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i=intArr.length-1;i>=0;i--)
        {
            if(hSet.contains(intArr[i]))
            {
                //sol = intArr[i];
                min = i;
            }
            hSet.add(intArr[i]);
        }
        return min;
    }
    public static Integer firstRepeatigELementwithArray(Integer[] intArr) {
        int sol =0;

        return sol;
    }
}
