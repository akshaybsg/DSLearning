package com.akshayLocal.DSA.programs.Platform;

public class Test {

    public static void main(String args[])
    {

        A[] arrA;
        B[] arrB;
        arrA = new A[10];
        arrB= new B[20];
        arrA= arrB;
        arrB=(B[])arrA;
        arrA= new A[10];
        arrB= (B[])arrA;

    }
}
