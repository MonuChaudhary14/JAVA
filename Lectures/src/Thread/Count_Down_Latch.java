package Thread;

import java.util.concurrent.CountDownLatch;

public class Count_Down_Latch {

    public static void main(String[] args)throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(5);

        Threads thread1 = new Threads(latch);  // We are using same latch for 5 times
        Threads thread2 = new Threads(latch);
        Threads thread3 = new Threads(latch);
        Threads thread4 = new Threads(latch);
        Threads thread5 = new Threads(latch);

        thread1.start();   // If we call an extra countDown latch then there will not be any issue
        thread2.start();    // But if the no of countDown are less than the latch then the awaits method will not be released then the method will continuously run
        thread3.start();
        thread4.start();
        thread5.start();

        latch.await();   // The application will not stop

        System.out.println("Main Thread "+ Thread.currentThread().getName());



    }
}

class Threads extends Thread{

    private CountDownLatch latch;

    public Threads(CountDownLatch latch) {
        this.latch = latch;
    }



    public void run(){

        System.out.println("Started Thread" + Thread.currentThread().getName());
        System.out.println("Ended Thread" + Thread.currentThread().getName());
        System.out.println("********");
        latch.countDown();  // This method will release the countdown and when the countdown reaches to zero awaits is opened

    }

}


/*
A CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes. It is useful for ensuring that a task does not proceed until other required tasks finish.

How Does CountDownLatch Work? 🤔
Initialize the latch with a count (number of tasks to wait for).

Each thread calls countDown() when it completes its task.

The waiting thread calls await(), which blocks execution until the count reaches zero.

Once count reaches zero, the waiting thread proceeds.

Example: Waiting for Multiple Threads to Finish
java
Copy
Edit
import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");
        try {
            Thread.sleep(2000); // Simulating work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
        latch.countDown(); // Decrements latch count
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3); // Waiting for 3 tasks

        new Worker(latch, "Worker-1").start();
        new Worker(latch, "Worker-2").start();
        new Worker(latch, "Worker-3").start();

        latch.await(); // Main thread waits for workers to complete
        System.out.println("All workers finished. Main thread proceeding.");
    }
}
Output (Order may vary)
css
Copy
Edit
Worker-1 started.
Worker-2 started.
Worker-3 started.
Worker-1 finished.
Worker-2 finished.
Worker-3 finished.
All workers finished. Main thread proceeding.
✅ The main thread waits until all workers complete their tasks before continuing.

Use Cases of CountDownLatch
✔ Waiting for multiple threads to complete before proceeding (e.g., loading resources in a game).
✔ Ensuring a service starts only after dependent components initialize.
✔ Testing concurrency by making threads wait before proceeding together.
 */