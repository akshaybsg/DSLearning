package com.akshayLocal.programs.Platform;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("run");
        throw new RuntimeException("problem");
    }

    public static void main(String args[])
    {
        Thread t = new Thread(new Thread2());
        t.start();
        System.out.println("End of method");
    }
}
