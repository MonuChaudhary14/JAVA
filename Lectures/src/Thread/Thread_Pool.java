package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Thread_Pool {

    public static void main(String[] args) {

    ExecutorService executor = Executors.newFixedThreadPool(6);

    SomeThread thread1 = new SomeThread("Thread1");
    SomeThread thread2 = new SomeThread("Thread2");
    SomeThread thread3 = new SomeThread("Thread3");
    SomeThread thread4 = new SomeThread("Thread4");
    SomeThread thread5 = new SomeThread("Thread5");
    SomeThread thread6 = new SomeThread("Thread6");
    SomeThread thread7 = new SomeThread("Thread7");
    SomeThread thread8 = new SomeThread("Thread8");
    SomeThread thread9 = new SomeThread("Thread9");
    SomeThread thread10 = new SomeThread("Thread10");
    SomeThread thread11 = new SomeThread("Thread11");
    SomeThread thread12 = new SomeThread("Thread12");

    executor.execute(thread1);
    executor.execute(thread2);
    executor.execute(thread3);
    executor.execute(thread4);
    executor.execute(thread5);
    executor.execute(thread6);
    executor.execute(thread7);
    executor.execute(thread8);
    executor.execute(thread9);
    executor.execute(thread10);
    executor.execute(thread11);
    executor.execute(thread12);


    executor.shutdown();  // This occurs when all the threads are executed
        // This is mandatory to shut down the thread otherwise it can keep the program running


    }

}

class SomeThread extends Thread {
    private String name;

    public SomeThread(String name) {
        super(name);   // When we pass this then the thread is provided with this name
        this.name = name;
    }

    public void run(){

        System.out.println("Started Thread: " + name);

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended Thread: " + name);
    }
}

/*
A Thread Pool is a collection of pre-initialized threads that can be reused to perform multiple tasks, instead of creating new threads every time.
 It improves performance by reducing the overhead of thread creation and destruction.

Why Use a Thread Pool?
✅ Reduces resource consumption – Reuses existing threads.
✅ Improves performance – Avoids the overhead of creating/destroying threads.
✅ Manages concurrency – Controls the number of active threads.
✅ Prevents excessive thread creation – Avoids system overload.

Creating a Thread Pool using Executors
Java provides the ExecutorService framework for managing thread pools.

Example 1: Fixed Thread Pool

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);  // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " completed.");
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 threads

        for (int i = 1; i <= 5; i++) {
            executor.execute(new Task(i));  // Submit tasks to the pool
        }

        executor.shutdown();  // Gracefully shutdown the pool after execution
    }
}
Output (Order May Vary)
arduino
Copy
Edit
Task 1 is running on pool-1-thread-1
Task 2 is running on pool-1-thread-2
Task 3 is running on pool-1-thread-3
Task 1 completed.
Task 4 is running on pool-1-thread-1
Task 2 completed.
Task 5 is running on pool-1-thread-2
Task 3 completed.
Task 4 completed.
Task 5 completed.
✅ Reuses 3 threads for 5 tasks, reducing overhead.

Types of Thread Pools in Java
Thread Pool Type	Method	Description
Fixed Thread Pool	Executors.newFixedThreadPool(n)	Creates a pool with a fixed number of threads.
Cached Thread Pool	Executors.newCachedThreadPool()	Creates threads as needed and reuses old ones.
Single Thread Executor	Executors.newSingleThreadExecutor()	Uses a single thread for task execution.
Scheduled Thread Pool	Executors.newScheduledThreadPool(n)	Executes tasks with a delay or periodically.


Example 2: Cached Thread Pool
Cached thread pools dynamically create new threads when needed but reuse idle ones.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
✅ Creates new threads as needed and reuses old ones.

Example 3: Scheduled Thread Pool
Used for delayed and periodic task execution.

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task = () -> System.out.println("Task executed at: " + System.currentTimeMillis());

        scheduler.scheduleAtFixedRate(task, 2, 3, TimeUnit.SECONDS); // Run every 3 sec after 2 sec delay
    }
}
✅ Runs tasks periodically using scheduleAtFixedRate().

When to Use Thread Pools?
✔ Handling multiple short-lived tasks efficiently.
✔ Reducing overhead of creating new threads.
✔ Executing tasks periodically or after delays.
✔ Limiting the number of concurrent threads in the system.
 */
