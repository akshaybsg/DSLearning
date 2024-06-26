package com.akshayLocal.DSA.programs.hashmap;

import java.util.HashMap;

//https://www.youtube.com/watch?v=20v8zSo2v18
public class SubArraySumEqualsK {

    public static void main(String srgs[]) {
       int[] intarr = new int[] { 3, 9, -2, 4 ,1 , -7, 2 , 6};
       //       3 , 9 , -2 , 4, 1 , -7 , 2 , 6
        // 0    3`` 12  10   14  15   8  10   12
        // 1    1```1   1    1    1   1   2  1

        int[] arr = {12,3,4,1,6,9,5};
        //   12  3  4  1  6  9  5
        //0  12  15  19 20 26 35 40
        //1  1   1   1  1  1  2  1

       int k = 10;
       int sum = 15;
       System.out.println("Count of Subarrays , whose sum is k is : " + subArraySum(intarr,k));
       System.out.println("Count of Subarrays , whose sum is k is : " + subArraySum(arr,sum));
    }

    // find all subArrays whose sum is equal to sum

    // We will identify prefix sum and store it in a hashmap
    public static int subArraySum(int[] intarr , int target)
    {
        int count =0;
        if(intarr.length==0)
            return 0;

        HashMap<Integer,Integer> hmap= new HashMap<>();
        hmap.put(0,1);
        int sum =0;
        int remsum =0;
        for(int i=0;i<intarr.length;i++)
        {
            sum += intarr[i];
            remsum = sum - target;
            if(hmap.keySet().contains(remsum))
            {
                System.out.print(intarr[i] + " , ");
                count +=hmap.get(remsum);
            }
            hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        }

        System.out.println();
        return count;
    }
}
