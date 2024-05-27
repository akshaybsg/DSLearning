package com.akshayLocal.DSA.programs.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> pqSmaller = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> pqGreater = new PriorityQueue<>();

    public static void main(String args[]) {

        MedianFinder mf = new MedianFinder();
        mf.add(1);
        mf.add(2);
        mf.add(16);
        mf.add(3);
        System.out.println(mf.findMedian());
        mf.add(9);
        System.out.println(mf.findMedian());
        mf.add(6);
        mf.add(4);
        System.out.println(mf.remove());
        System.out.println(mf.findMedian());
    }

    public MedianFinder() {

    }

    public void add(Integer n) {

        if(pqSmaller.size()==0) {
            pqSmaller.add(n);
            return;
        }
        if(n > pqSmaller.peek()) {

            pqGreater.add(n);
            if((pqGreater.size() - pqSmaller.size()) > 1) {
                int ele = pqGreater.remove();
                pqSmaller.add(ele);
            }
        } else {
            pqSmaller.add(n);
        }
    }

    public int remove() {
        if((pqGreater.size() - pqSmaller.size()) < 1) {
            return pqSmaller.remove();
        } else {
            return pqGreater.remove();
        }
    }

    public int findMedian() {
        if((pqGreater.size() - pqSmaller.size()) < 1) {
            return pqSmaller.peek();
        } else {
            return pqGreater.peek();
        }
    }
}
