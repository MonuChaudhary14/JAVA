package Thread;

public class Interrupt {

    public static int balance = 0;

    synchronized public void withdraw(int amount){

        if(balance <= 0){
            System.out.println("Waiting for amount to be updated after the withdrawal of "+amount);
            try {
                wait();  //it will wait for infinite time   //We can also use wait(time in ms);
            } catch (InterruptedException e) {
                System.out.println("Withdrawal Interrupted");
                return ;   // When there is a catch we should return or throw a new Exception

            }
            // Either surround wait by try and Catch block or throw an Exception
        }
        if((balance - amount) > 0) {
            balance = balance - amount;
        }
        else{
            System.out.println("Balance to low for withdrawal");
            return ;
        }


        System.out.println("The current balance is " + balance);
    }


    public boolean deposit(int amount){

        synchronized (this) {
            if (amount > 0) {
                System.out.println("We are depositing the amount in the bank of " + amount + " to the current balance");

                balance = balance + amount;
                notify();  // It notifies the longest waiting thread
                System.out.println("The amount has been deposited to the current balance");
                return true;
            }
            else{
                System.out.println("Invalid amount entered");
                return false;
            }
        }
    }

    public static void main(String[] args) {

        Interrupt w = new Interrupt();

        Thread thread1 = new Thread(new Runnable() {

            public void run(){

                w.withdraw(10000);
            }

        });
        thread1.setName("Thread 1");



        Thread thread2 = new Thread(new Runnable() {

            public void run(){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(w.deposit(50000)){
                    System.out.println("Transaction completed");
                }
                else{
                    thread1.interrupt();   // When we are using interrupt there should not be an anonymous class
                    // This interrupt method call the try and catch method of the thread1 because of InterruptedException
                }
            }

        });
        thread2.setName("Thread 2");



        thread1.start();
        thread2.start();
    }



}

/*
In Java, the interrupt() method is used to signal a thread to stop execution or handle interruptions gracefully. However, calling interrupt() does not forcefully stop a thread—it only sets the interrupt flag (Thread.interrupted()).

How interrupt() Works
Interrupting a sleeping or waiting thread:

If a thread is in sleep(), wait(), or join(), an InterruptedException is thrown.

Interrupting an active thread:

The thread does not stop immediately; it must check Thread.interrupted() and exit gracefully.

Example 1: Interrupting a Sleeping Thread
If a thread is sleeping (Thread.sleep()), calling interrupt() wakes it up by throwing an InterruptedException.

java
Copy
Edit
class Worker extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000);  // Sleep for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Thread exiting...");
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.start();

        try {
            Thread.sleep(2000);  // Wait for 2 seconds before interrupting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        worker.interrupt();  // Interrupt the sleeping thread
    }
}
Output
mathematica
Copy
Edit
Thread is sleeping...
Thread was interrupted!
Thread exiting...
✅ The interrupt() method causes an InterruptedException, waking up the thread.

Example 2: Interrupting an Active Thread
If a thread is running normally, interrupt() only sets a flag, which must be checked manually.

java
Copy
Edit
class Task extends Thread {
    public void run() {
        while (!Thread.interrupted()) {  // Check interrupt flag
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping!");
                break;  // Exit loop
            }
        }
        System.out.println("Thread stopped.");
    }
}

public class InterruptCheckExample {
    public static void main(String[] args) {
        Task task = new Task();
        task.start();

        try {
            Thread.sleep(3000);  // Wait before interrupting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.interrupt();  // Set the interrupt flag
    }
}
Output
mathematica
Copy
Edit
Thread is running...
Thread is running...
Thread is running...
Thread interrupted while sleeping!
Thread stopped.
✅ The thread exits gracefully when interrupted.

Key Differences: stop() vs interrupt()
Feature	stop() (Deprecated)	interrupt()
Forces thread to stop?	✅ Yes (Unsafe)	❌ No
Throws exception?	❌ No	✅ Yes (if sleeping/waiting)
Recommended?	❌ No	✅ Yes
Releases locks?	❌ No	✅ Yes
When to Use interrupt()?
✔️ To gracefully stop a thread instead of forcefully killing it.
✔️ When a thread is in sleep() or wait(), ensuring it doesn't remain stuck.
✔️ For handling long-running operations that need cancellation.
 */
