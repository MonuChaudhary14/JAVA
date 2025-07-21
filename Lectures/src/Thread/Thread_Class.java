package Thread;

import static java.lang.Thread.sleep;
import java.lang.Thread;

public class Thread_Class {

    public static void main(String[] args) throws InterruptedException {

    MyCounter counter = new MyCounter(1);   // Here we have created a thread from the class which extends the Thread Class

    long startTime = System.currentTimeMillis();   // The total time calculation only reflects how long the main thread was alive, not the actual thread execution time.

    counter.start();

    System.out.println("********");

    MyCounter counter2 = new MyCounter(2);

    counter2.start();
    sleep(6000);    // In this main thread sleeps for 6 seconds so that the other threads can execute their task

    long endTime = System.currentTimeMillis();

    System.out.println("Total time:"+ (endTime - startTime));
    }
}

class MyCounter extends Thread {
    //    Thread class is implementing Runnable interface
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe() throws InterruptedException {

        for (int i = 1; i <= 10; i++) {
            sleep(500);
            System.out.println("The thread number is " + threadNo + " and the iteration is " + i);
        }
    }

    @Override
    public void run() /*throws InterruptedException  --> We cannot do this to remove Exception because we are overriding the run method of Runnable which is implemented by Thread*/ {
        try {   // This will be performed by the thread when it is started
            countMe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

    /*
    The InterruptedException is thrown when a thread that is sleeping, waiting, or otherwise paused is interrupted by another thread.
     */

    /*
    In Java, the run() method of the Thread class or Runnable interface does not allow declaring throws InterruptedException.
    This is because the run() method in Runnable and Thread has a fixed signature:
    public void run() {
        // Cannot declare "throws InterruptedException"
    }
    */

