package com.akshayLocal.programs.Multithreading;

public class JoinDemo implements Runnable {
    Thread t;
    public void run()
    {
        for (int i = 0; i < 4; i++) {

            synchronized(Thread.class) {
                System.out.println(Thread.currentThread().getName() + "  " + i);
            }
            try {
                // thread to sleep for 1000 milliseconds
                //Thread.currentThread().join();
            }

            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new JoinDemo());
        Thread t2 = new Thread(new JoinDemo());
        // call run() function
        t.start();
        // call run() function
        t2.start();
        t.join();
        t2.join();

    }
}