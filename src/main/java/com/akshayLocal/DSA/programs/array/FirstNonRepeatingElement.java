package com.akshayLocal.DSA.programs.array;

import java.util.LinkedHashMap;

public class FirstNonRepeatingElement {

    public static void main(String srgs[]) {
        Integer arr[] = {10, 5, 3, 4, 3, 5, 6 , 10 , 1};
        System.out.println(firstNonRepeatigELementwithMap(arr));
    }
    public static Integer firstNonRepeatigELementwithMap(Integer[] intArr)
    {
        LinkedHashMap<Integer,Integer> hMap = new LinkedHashMap<>();
        for(int i=0;i<intArr.length;i++)
        {
            if(hMap.keySet().contains(intArr[i]))
            {
                hMap.put(intArr[i],hMap.getOrDefault(intArr[i],1)+1);
            }
            else
                hMap.put(intArr[i],1);
        }
        for (int i = 0; i < intArr.length; i++)
        {
            if (hMap.get(intArr[i]) == 1)
                return intArr[i];
        }

    return -1;
    }
}
