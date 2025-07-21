package Thread;

import static java.lang.Thread.sleep;

public class Dead_Lock {

    public static void main(String[] args) throws InterruptedException {
        String lock1 = "Lock1";
        String lock2 = "Lock2";
//         Object lock = new Object();  we can also use this

     Thread thread1 = new Thread(new Runnable() {
         public void run() {
             synchronized(lock1) {
                 System.out.println("Thread1 is running");
                 try {
                     sleep(10);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 synchronized(lock2) {
                     System.out.println("Thread 1, Lock2");
                 }
             }
         }
     });

     Thread thread2 = new Thread(new Runnable() {
//        Object lock = new Object();
         public void run() {
             synchronized (lock2) {
                 System.out.println("Thread2 is running");
                 synchronized(lock1) {
                     System.out.println("Thread 1, Lock1");
                 }
             }
         }

     });

     thread1.start();
     thread2.start();

     thread1.join();
     thread2.join();

        System.out.println("Main Thread");


    }

}
