package com.akshayLocal.DSA.programs.recursionBacktracking;

import java.util.ArrayList;

public class Permutations {

    public static void main(String args[]) {
        int[] arr = {1,2,3};
        printPermutations(arr);
    }

    public static void printPermutations(int[] arr) {
        printPerm(arr,0,new boolean[arr.length],new ArrayList<>());
    }

    public static void printPerm(int[] arr, int position, boolean[] selected, ArrayList<Integer> permutationsList) {

        if(position == arr.length) {
            System.out.println(permutationsList);
            return;
        }
        for(int i=0; i < arr.length;i++) {

            if(selected[i] == false) {

                selected[i] = true;
                permutationsList.add(arr[i]);
                printPerm(arr,position+1,selected,permutationsList);
                selected[i] = false;
                permutationsList.remove(permutationsList.size() -1);
            }
        }
    }
}
