package com.akshayLocal.programs.SearchingAlgo;

//https://www.scaler.com/topics/course/dsa-interviews-java/video/546/
public class FirstAndLastIndex {

    public static void main(String args[]) {

        int[] arr = {1,3,3,4,4,4,5,5,5,5,5,7,7,7,7,7,7,7,9,9,46};
        System.out.println(getFirstPosition(arr,5));
        System.out.println(getLastPosition(arr,5));
    }

    public static int getFirstPosition(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;

        int first = -1;

        while(left <= right) {
            int mid = (left + right)/2;

          if(arr[mid] == target) {
              first = mid;
              right = mid - 1;

          } else if (arr[mid] < target) {
              left = mid + 1;
          } else {
              right = mid - 1;
          }

        }
        return first;

    }

    public static int getLastPosition(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;
        int last = -1;

        while(left <= right) {
            int mid = (left + right)/2;

            if(arr[mid] == target) {
                last = mid;
                left = mid + 1;

            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return last;

    }
}
