package Thread;

public class Wait_And_Notify {

    public static int balance = 0;

   synchronized public void withdraw(int amount) throws InterruptedException {   // wait be must be inside a synchronized block

    if(balance <= 0){
        System.out.println("Waiting for amount to be updated after the withdrawal of "+amount);
        wait();  //it will wait for infinite time   //We can also use wait(time in ms);
        // Either surround wait by try and Catch block or throw an Exception in the method
    }
    balance = balance - amount;

    System.out.println("The current balance is " + balance);
   }


   public void deposit(int amount){
       Object lock = new Object();
       synchronized (lock){
           System.out.println("We are depositing the amount in the bank of " + amount + " to the current balance");

           balance = balance + amount;
           notify();  // It notifies the longest waiting thread
           // If we use notifyAll then it will release all the waiting threads
           System.out.println("The amount has been deposited to the current balance");
       }
   }

    public static void main(String[] args) {

    Wait_And_Notify w = new Wait_And_Notify();

    Thread thread1 = new Thread(new Runnable() {

        public void run(){
            try{
                w.withdraw(10000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }


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
            w.deposit(50000);
        }

    });
    thread2.setName("Thread 2");



    thread1.start();
    thread2.start();
    }



}

/*
The wait() and notify() methods in Java are used for inter-thread communication, allowing threads to coordinate execution efficiently. These methods are defined in the Object class and must be used inside a synchronized block or method.

How wait() and notify() Work
wait(): Causes the current thread to pause and release the lock, waiting until another thread calls notify().

notify(): Wakes up one waiting thread that is blocked on wait().

notifyAll(): Wakes up all waiting threads blocked on wait().

Important Rules
✔️ Must be used inside a synchronized block (synchronized(this) {} or synchronized(lock) {}).
✔️ wait() releases the lock and allows other threads to acquire it.
✔️ notify() does not release the lock immediately; the notified thread still has to wait for the current thread to finish execution.
✔️ notifyAll() wakes all waiting threads, but only one can acquire the lock at a time.

Example 1: Simple wait() and notify()
In this example, a Producer thread waits until a Consumer thread consumes data.

class SharedResource {
    private boolean available = false;

    public synchronized void produce() throws InterruptedException {
        System.out.println("Producing...");
        available = true;
        notify(); // Notify waiting thread
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); // Wait until notify() is called
        }
        System.out.println("Consuming...");
        available = false;
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                resource.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                resource.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        consumer.start();
        producer.start();
    }
}
Explanation
The Consumer thread starts first and waits because available is false.

The Producer thread waits for 1 second, then produces data and calls notify().

The Consumer thread wakes up and continues execution.

✅ Ensures proper synchronization between producer and consumer.

Example 2: wait() and notify() in a Producer-Consumer Model

class DataBuffer {
    private int data = 0;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // Wait until data is consumed
        }
        data = value;
        System.out.println("Produced: " + data);
        hasData = true;
        notify(); // Notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait(); // Wait until data is available
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // Notify producer
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.produce(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
Output (Approximate)
makefile
Copy
Edit
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
✅ Prevents busy-waiting and ensures proper synchronization.

Key Differences: wait() vs sleep()
Feature	wait()	sleep()
Belongs to	Object class	Thread class
Releases lock?	✅ Yes	❌ No
Needs synchronized block?	✅ Yes	❌ No
Wakes up using?	notify() / notifyAll()	Time expiry or interrupt()
Used for	Inter-thread communication	Delaying execution
When to Use wait() and notify()?
✔️ For thread communication, when one thread depends on another.
✔️ To avoid busy-waiting loops, saving CPU resources.
✔️ When using shared resources where synchronization is required.
 */
