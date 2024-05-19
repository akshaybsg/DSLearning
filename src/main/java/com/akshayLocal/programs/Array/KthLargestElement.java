package com.akshayLocal.programs.Array;

import com.akshayLocal.programs.Heap.KLargestElements;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {

    public static void main(String args[])
    {
        //using priority queue
        int[] intArr = {10,1,4,7,2,13,3};
        int k = 3;
        System.out.println(KLargestElements.kth_largest_element(intArr,k).peek());
        System.out.println(intArr[kthLargestEle(intArr,k)]);

    }
    public static int kthLargestEle(int[] intArr , int k)
    {
        Arrays.sort(intArr);
        int targetIndex = intArr.length-k;
        return targetIndex;
    }
    public static int kthLargestEleDec(Integer[] intArr , int k)
    {
        Arrays.sort(intArr, Collections.reverseOrder());
        return intArr[k-1];
    }
    public static int largestEle(int[] intArr)
    {
        int fmax = intArr[0];
        int smax = intArr[0];

        for(int i=0;i<intArr.length;i++)
        {
            if(intArr[i]>fmax)
            {
                smax = fmax;
                fmax= intArr[i];
            }
            else if(intArr[i]>smax)
            {
                smax= intArr[i];
            }
        }
        return fmax;
    }
    public static int largestEleBy(int[] intArr)
    {
        int fmax = intArr[0];
        int smax = intArr[0];
        for(int i=0;i<intArr.length;i++)
        {
           fmax = Math.max(fmax,intArr[i]);
        }
        for(int i=0;i<intArr.length;i++)
        {
            if(intArr[i]!=fmax)
            {
                smax = Math.max(smax,intArr[i]);
            }
        }
        return fmax;
    }

}
