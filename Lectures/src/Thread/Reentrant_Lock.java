package Thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant_Lock {

    public static int counter = 0;

    static Lock lock = new ReentrantLock();
//    private final ReentrantLock lock = new ReentrantLock();    //we can also use this

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {

            public void run(){                // If an Exception occurs, and we did not use unlock in finally(the program can run without any try and catch block) it will be locked permanently because it does not reach to unlock statement
                    lock.lock();
                try {   // If there is an exception then finally block will perform the work and open the lock
                    for (int i = 0; i < 10000; i++){
                        counter++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            public void run(){
                    lock.lock();
                try{
                    for (int i = 0; i < 10000; i++) {
                        counter++;
                    }
                }finally {
                    lock.unlock();
                }

            }

        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("The value of the counter is "+ counter);



    }


}

/*A ReentrantLock in Java is part of the java.util.concurrent.locks package and provides a more advanced alternative to the traditional synchronized keyword.
It allows for more flexibility when working with multiple threads, supporting features like fairness policies, interruptible locks, and the ability to try acquiring a lock without blocking.

Key Features of ReentrantLock
Reentrancy: The same thread can acquire the lock multiple times without causing a deadlock.

Explicit Locking & Unlocking: Unlike synchronized, you must explicitly call lock() and unlock(), increasing flexibility.

Fairness: Can be configured to ensure the longest-waiting thread gets the lock first.

Interruptibility: Threads waiting for the lock can be interrupted.

Try Locking: Can attempt to acquire the lock without blocking.

Basic Usage of ReentrantLock

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    public void accessResource() {
        lock.lock(); // Acquire the lock
        try {
            System.out.println(Thread.currentThread().getName() + " is accessing the resource");
            Thread.sleep(1000); // Simulating work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Always release the lock in a finally block
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            resource.accessResource();
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
Output (varies due to threading)
csharp
Copy
Edit
Thread-1 is accessing the resource
Thread-2 is accessing the resource
Each thread acquires and releases the lock properly.

Reentrant Behavior
A thread can acquire the same lock multiple times without blocking itself.

java
Copy
Edit
import java.util.concurrent.locks.ReentrantLock;

class ReentrantExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered outerMethod");
            innerMethod(); // Calling another method that also locks
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered innerMethod");
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantTest {
    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        new Thread(example::outerMethod, "Thread-1").start();
    }
}
The same thread can acquire the lock multiple times.

TryLock Example
You can use tryLock() to avoid blocking indefinitely.

java
Copy
Edit
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {
    private final ReentrantLock lock = new ReentrantLock();

    public void access() {
        if (lock.tryLock()) { // Try acquiring lock
            try {
                System.out.println(Thread.currentThread().getName() + " acquired the lock.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock.");
        }
    }

    public static void main(String[] args) {
        TryLockExample example = new TryLockExample();

        Runnable task = example::access;
        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();
    }
}
If a thread cannot acquire the lock, it does not block and continues execution.

Fair Lock
By default, ReentrantLock is non-fair, meaning any thread can acquire the lock without considering waiting time. You can enforce fairness by using:

java
Copy
Edit
ReentrantLock lock = new ReentrantLock(true); // Fair lock
This ensures the longest-waiting thread gets the lock first.

When to Use ReentrantLock Over Synchronized?
Feature	synchronized	ReentrantLock
Explicit Locking	No	Yes
Try Lock	No	Yes (tryLock())
Interruptibility	No	Yes (lockInterruptibly())
Fairness Policy	No	Yes (new ReentrantLock(true))
Condition Variables	No	Yes (newCondition())
Use ReentrantLock when you need more control over synchronization, such as fair ordering, trying without blocking, or interruptible locks.

Conclusion
ReentrantLock provides more control compared to synchronized.

Must manually acquire (lock()) and release (unlock()) the lock.

Supports fairness, tryLock(), and interruptibility.

Use it when synchronized is too restrictive for your needs.

 */
