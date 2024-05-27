package com.akshayLocal.DSA.programs.SearchingAlgo;

import static com.akshayLocal.DSA.programs.SearchingAlgo.FindMinInSortedRotated.getMinimumInSortedRotatedArr;

public class SearchInSortedRotated {

    public static void main(String args[]) {



        int[] arr = {18,19,20,21,22,23,5,6,7,9,12,15};
        int minElementIndex = getMinimumInSortedRotatedArr(arr);
        System.out.println(getElement(arr,6,minElementIndex));
        System.out.println(getElement(arr,22,minElementIndex));
        System.out.println(getElement(arr,10,minElementIndex));

    }

    public static int getElement(int[] arr , int target, int minElementIndex) {
            int ele = binarySearch(arr,0, minElementIndex-1,target);
            if(ele == -1) {
                ele = binarySearch(arr,minElementIndex, arr.length-1,target);
            }
            return ele;
    }

    public static int binarySearch(int[] arr, int left , int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
