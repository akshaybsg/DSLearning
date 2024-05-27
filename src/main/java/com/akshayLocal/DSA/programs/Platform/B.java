package com.akshayLocal.DSA.programs.Platform;

public class B extends A{

    @Override
    public void x() {
        System.out.println("class B method");
        System.out.println(staticOBJ);
        staticOBJ = "newTestB";
        System.out.println(staticOBJ);
    }
    public void y()
    {

    }


    public static void staticTestMethod()  {

        System.out.println("class B staticTestMethod(");
    }
}
