package com.akshayLocal.programs.Platform;

public class Person implements Comparable{
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        //return 0;
        return o.hashCode();
    }
}
