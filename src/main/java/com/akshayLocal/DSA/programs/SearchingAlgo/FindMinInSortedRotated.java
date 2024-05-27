package com.akshayLocal.DSA.programs.SearchingAlgo;

// unique elements
public class FindMinInSortedRotated {

    public static void main(String args[]) {



        //int[] arr = {18,19,20,21,22,23,5,6,7,9,12,15};
        //int[] arr = {18,19,20,21,22,5,6,7,9,12,15};
        //int[] arr = {5,6,7,9,12,15,18,19,20,21,22,23};
        int[] arr = {5,6,7,9,12,15,18,19,20,21,22,23,4};
        System.out.println(arr[getMinimumInSortedRotatedArr(arr)]);

    }

    public static int getMinimumInSortedRotatedArr(int[] arr) {
        int min = -1;
        int left = 0, right = arr.length - 1;

        while(left < right) {
            int mid = (left + right) / 2;

            if(arr[mid] < arr[right]) {
                min = mid;
                right = mid;
            } else if(arr[mid] > arr[right]) {
                min = right;
                left = mid+1;
            }

        }

        return min;

    }
}
