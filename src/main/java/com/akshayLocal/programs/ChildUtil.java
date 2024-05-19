package com.akshayLocal.programs;

import com.akshayLocal.programs.Platform.ParentUtil;

public class ChildUtil extends ParentUtil {

    public static void main(String args[])
    {
        new ChildUtil().callStuff();
    }
    void callStuff()
    {
        System.out.println("this" + this.doStuff());
        ParentUtil p = new ParentUtil();
        //System.out.println("parent" + p.doStuff);
    }
}
