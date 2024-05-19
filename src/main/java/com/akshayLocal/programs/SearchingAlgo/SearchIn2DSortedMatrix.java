package com.akshayLocal.programs.SearchingAlgo;



// Always remember to start from 1st row and rightmost.
public class SearchIn2DSortedMatrix {

    public static void main(String args[]) {



        int[][] arr = { {1,4,6,8,10},
                        {2,7,9,12,15},
                        {3,11,20,22,24},
                        {5,16,25,30,40} };
        int target = 6;
        System.out.println(getTargetBruteForce(arr,target));
        System.out.println(getTargetBinarySearch(arr,target));
        System.out.println(getTargetUsingBinarySearch(arr,target));
    }

    public static int getTargetBruteForce(int[][] arr,int target) {
        int ele = -1;
        for(int i=0; i < arr[0].length -1;i++) {
            for(int j=0; j < arr.length -1 ; j++)
            {
                if(arr[i][j] == target) {
                    return arr[i][j];
                }
            }
        }
        return ele;
    }

    public static int getTargetBinarySearch(int[][] arr,int target) {
        int ele = -1;
        int left = 0 , right = 0;

        while((left < arr[0].length -1) || (right < arr.length -1)) {
            if(arr[left][right] == target) {
                return arr[left][right];
            } else if(arr[left][right] < target) {
                if(left == 0 && (right != arr[left].length - 1)) {
                    right = arr[left].length - 1;
                } else {
                    left = left + 1;
                }

            } else {
                    right = right - 1;
            }

        }
        System.out.println(left + " _ " + right);

        return ele;
    }


    public static int getTargetUsingBinarySearch(int[][] arr,int target) {
        int ele = -1;
        int i = 0 , j = arr.length-1;

        while((i < arr.length) && (j >= 0)) {

            if(arr[i][j] == target) {
                return arr[i][j];
            } else if(arr[i][j] < target) {
                i ++;
            } else {
                j--;
            }

        }
        System.out.println(i + " _ " + j);

        return ele;
    }
}
