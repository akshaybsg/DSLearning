package com.akshayLocal.DSA.programs.Platform;

public class A {

    static String staticOBJ = "test";

    void x()
    {
        System.out.println("class A method");
        System.out.println(staticOBJ);
        staticOBJ = "newTestA";
        System.out.println(staticOBJ);
    }

    void dishaTest()
    {
        System.out.println("class A method");
    }

    public static void staticTestMethod()
    {

        System.out.println("class A staticTestMethod(");
    }
}
