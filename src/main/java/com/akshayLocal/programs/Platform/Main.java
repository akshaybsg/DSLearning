package com.akshayLocal.programs.Platform;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String srgs[]) {
        Test1();
        getDetails();
        String s1="abc";
        String s2=s1;
        s1 +="d";
        System.out.println(s1 + " "  +s2 + " " + (s1==s2));
    }

    public static void getDetails()
    {
        Map<String,Integer> map = new HashMap<>();
        String a = "abc";
        String b = new String( "abc");
        map.put(a,10);
        map.put(b,20);
        map.put(new String("abc"),30);
        System.out.println(map.get("abc"));

    }
    public static void Test1()
    {
        int x=10;
        int y=2;
        try
        {
            for(int z =2 ; z>=0;z--)
            {
                int ans =x/z;
                System.out.print(ans + " ");
            }
        }
        catch (Exception e1)
        {
            System.out.println("E1");
        }
       /* catch (ArithmeticException e2)
        {
            System.out.println("E2");
        }*/

    }

}
