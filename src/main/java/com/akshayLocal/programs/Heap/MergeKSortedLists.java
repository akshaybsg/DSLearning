package com.akshayLocal.programs.Heap;

import java.util.*;

// 10,22,28,35,40
//6,11,15,18
//3,9,21,36
//1,2,3,4,5,6


public class MergeKSortedLists {

    public static void main (String args[]) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{10, 22, 28, 35, 40}));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{6,11,15,18}));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{3,9,21,36}));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5,6}));

        List<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);

        System.out.println(mergeKSortedLists(lists));
        System.out.println(mergeKSortedListsUsingSort(lists));
    }

    static class Pair implements Comparable<Pair>{
        int value;
        int listIndex;
        int dataIndex;

        public Pair(int value, int listIndex, int dataIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.dataIndex = dataIndex;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
        }
    }

    private static List<Integer> mergeKSortedLists(List<ArrayList<Integer>> lists) {
        List<Integer> mergedSortedList = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0 ; i < lists.size(); i++) {
           pq.add(new Pair(lists.get(i).get(0),i,0));
        }

        while(pq.size() > 0) {

            Pair removedPair = pq.remove();
            mergedSortedList.add(removedPair.value);

            // that list has still value and run through that list
            if((removedPair.dataIndex + 1) < (lists.get(removedPair.listIndex).size())) {
                int value = lists.get(removedPair.listIndex).get(removedPair.dataIndex + 1);
                pq.add(new Pair(value,removedPair.listIndex,removedPair.dataIndex + 1));
            }
        }

        return mergedSortedList;
    }

    private static List<Integer> mergeKSortedListsUsingSort(List<ArrayList<Integer>> lists) {
        List<Integer> mergedSortedList = new ArrayList<>();
        for(int i = 0 ; i < lists.size(); i++) {
            for(int j = 0 ; j < lists.get(i).size(); j++) {
                mergedSortedList.add(lists.get(i).get(j));
            }
        }
        Collections.sort(mergedSortedList);
        return mergedSortedList;
    }

}
