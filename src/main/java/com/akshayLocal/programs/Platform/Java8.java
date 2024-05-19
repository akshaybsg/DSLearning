package com.akshayLocal.programs.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Java8 {

    public static void main(String args[])
    {
        System.out.println('j' + 'a');
        Stream words = Stream.of("one","two","three");
        /*int len = words.mapToInt(String::length).reduce(0,(len1,len2)-> len1 + len2);
        System.out.println(len);*/
        List<A> list = new ArrayList<A>();
        list.add(new B());
        list.add(new C());

        for(A a:list)
        {
            a.x();
            //a.y();
        }
    }
}
