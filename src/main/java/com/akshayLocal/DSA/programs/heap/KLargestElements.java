package com.akshayLocal.DSA.programs.heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String args[]) {

        int[] arr = {10,1,4,7,2,13,3};
        int k = 3;
        PriorityQueue priorityQueue1 = k_largest_elements(arr,k);

        Iterator<Integer> itr = priorityQueue1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


        PriorityQueue priorityQueue2 = kth_largest_element(arr,k);
        System.out.println(priorityQueue2.peek());
    }

    public static PriorityQueue k_largest_elements(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0;
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        while (i < arr.length) {
            if(arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
            i++;
        }
         return pq;
    }

    public static PriorityQueue kth_largest_element(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0;
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        while (i < arr.length) {
            if(arr[i] > pq.peek()) {
                pq.remove();
                pq.add(arr[i]);
            }
            i++;
        }
        return pq;
    }

}
