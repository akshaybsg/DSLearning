package com.akshayLocal.programs.SearchingAlgo;

public class BinarySearchAlgo {

    public static void main(String args[]) {

        int[] arr = {1,5,6,7 , 9 , 12, 15 , 18 , 25 , 29 , 40 , 42 , 46};
        System.out.println(binarySearch(arr,6));

    }

    public static int binarySearch(int[] arr, int target) {

        int start = arr[0];
        int end = arr[arr.length -1];
        int mid = 0;

        while (start <= end) {

            mid = arr[(start + end)/2];
            if(target <= mid) {
                end = mid;

            }
        }

        return mid;
    }
}
