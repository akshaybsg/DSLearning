package com.akshayLocal.programs.Platform;

public class Problems {

    String str = "a";

    void A()
    {
        try
        {
            str +="b";
            B();
        }
        catch (Exception e)
        {
            str += "c";
        }
    }
    void B() throws Exception
    {
        try
        {
            str +="d";
            C();
        }
        catch (Exception e)
        {
            throw new Exception();
        }
        finally {
            str += "e";
        }
        str +="f";
    }
    void C() throws Exception
    {
        throw new Exception();
    }
    void display()
    {
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Problems object = new Problems();
        object.A();
        object.display();
    }
}
