package com.akshayLocal.programs.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Using2Queue
{
    static Queue<Integer> q1 ;
    static Queue<Integer> q2 ;

    public Using2Queue(Queue<Integer> q1, Queue<Integer> q2) {
        q1= new LinkedList<>();
        q2= new LinkedList<>();
    }
    public static  void main(String args[])
    {
        Using2Queue stackT = new Using2Queue(q1,q2);
        stackT.push(10);
        stackT.push(30);
        stackT.push(20);
        stackT.pop();

        stackT.push(10);
    }
    public  void push(int data)
    {

    }
    public  int pop()
    {
        int data =0;


        return data;
    }
}
