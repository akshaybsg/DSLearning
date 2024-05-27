package com.akshayLocal.DSA.programs.Platform;

import java.util.*;

public class Demo {

    static int staticT = 10;

    public static void main(String args[])
    {

        //Class.forName("org.json.simple.JSONArray");
        //Class.forName("oracle.jdbc.driver.OracleDriver");

        System.out.println(A.staticOBJ);
        System.out.println(B.staticOBJ);
      /*  List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(sum(l));*/
        A a1 = new A();
        A a2 = new B();
        B b1 = new B();

        a1.x();
        a2.x();
        b1.x();


        System.out.println(a1.staticOBJ);
        System.out.println(b1.staticOBJ);

        B b = new B();
        C c = new C();

       /* System.out.println(b instanceof B);
        System.out.println(b instanceof A);
        System.out.pri ntln(b instanceof C);
        System.out.println((b instanceof B) && !(b instanceof A));
        System.out.println((b instanceof B) && !(b instanceof C));

        b.dishaTest();
        c.dishaTest();

        Person p1 = new Person("ABC");
        Person p2 = new Person("BCD");
        Person p3 = new Person("DEF");
        Person p4 = new Person("ABC");
        Person p5 = new Person("JKL");
        Set<Person> t = new HashSet<>();
        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);

        System.out.println(t.size());

        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        System.out.println(treeSet.size());*/

        A.staticTestMethod();
        B.staticTestMethod();

        a1.staticTestMethod();
        a2.staticTestMethod();
        b.staticTestMethod();

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.staticT = 20;

    }
    public static int sum(List<Integer> intlist)
    {
        int sum = 0;
        for(int i : intlist)
        {
            sum +=i;
        }

        return sum;


    }
}
