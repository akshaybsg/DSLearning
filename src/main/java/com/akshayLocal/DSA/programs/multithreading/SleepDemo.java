package com.akshayLocal.DSA.programs.multithreading;


// Prints 0,1,2,3,4 in any sequence for the threads
public class SleepDemo implements Runnable {
    Thread t;
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    Thread.currentThread().getName() + "  "
                            + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(10);
            }

            catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new SleepDemo());
        Thread t2 = new Thread(new SleepDemo());
        // call run() function
        t.start();
        // call run() function
        t2.start();
    }
}