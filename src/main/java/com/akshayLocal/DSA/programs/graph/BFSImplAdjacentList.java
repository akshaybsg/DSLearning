package com.akshayLocal.DSA.programs.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BFSImplAdjacentList {

    public static void main(String args[]) {

        Scanner scn = new Scanner();
        int n = scn.nextInt(); // nodes or vertices
        int e = scn.nextInt(); // edges

        List<List<Integer>> graph = createAdjacencyList(n, e, scn);
        traversalBFS(n,e);
    }

    static List<List<Integer>>  createAdjacencyList((int n , int e, Scanner scn) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0 ;i < n ; i++) {
            List<Integer> nbrLists = new ArrayList<>();
            for(int nbr : nbrLists) {

            }
            graph.add(nbrLists);
        }
        return graph;
    }

    static void traversalBFS(int n , int e) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0 ;i < n ; i++) {
            int nbr = 0;
            graph.get(n).add(nbr);
        }

    }
}
