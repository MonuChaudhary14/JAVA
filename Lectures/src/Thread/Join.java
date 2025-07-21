package Thread;

// The last thread terminated is the 'main' thread

public class Join {

    public static int counter1 = 0;
    public static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {

       Thread thread1 = new Thread(new Runnable(){

            public void run(){

                for(int i = 0; i < 1000; i++){
                    try{
                        Thread.sleep(1);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                        return ;
                    }
                    counter1++;
                }

            }

        });


       Thread thread2 = new Thread(new Runnable(){

            public void run(){

                for(int i = 0; i < 1000; i++){
                    try{
                        Thread.sleep(1);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                        return ;
                    }
                    counter2++;
                }

            }

        });



       thread1.start();
       thread2.start();
//     Thread.sleep(1);    If we use this then we are wasting time because we do not know how much time will it take counter to reach 1000
//     thread1.join();     Main thread waits for thread1 to finish



       Thread thread3 = new Thread(new Runnable(){

           public void run(){
               try {
                   thread1.join();  // If we comment this , then the value of counter1 does not get updated
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Thread 1 joined");
               try {
                   thread2.join(500);   // We can also give time for a thread to wait
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("Thread 2 joined");
               System.out.println("The value of counter 1 is " + counter1);
               System.out.println("The value of counter 2 is " + counter2);

           }
       });

       thread3.start();

        System.out.println("Main thread "+ Thread.currentThread().getName());
        // The main thread waits for other threat to complete
        // thread3 waits for threat1 to complete and thread2 to complete

    }
}

/*
The join() method in Java allows one thread to wait for another thread to finish execution before proceeding. It is commonly used to synchronize multiple threads.

How join() Works
When thread.join() is called, the current thread pauses execution until the specified thread finishes running.

It helps ensure that a thread completes its task before moving to the next step.

Example 1: Basic join() Usage
In this example, Thread A and Thread B start execution, but main waits for them to finish before continuing.

class Task extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Task();
        Thread t2 = new Task();

        t1.start();
        t2.start();

        try {
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads finished. Main thread continues...");
    }
}
Output (Order May Vary)
mathematica
Copy
Edit
Thread-0 - 1
Thread-1 - 1
Thread-0 - 2
Thread-1 - 2
Thread-0 - 3
Thread-1 - 3
Thread-0 - 4
Thread-1 - 4
Thread-0 - 5
Thread-1 - 5
Both threads finished. Main thread continues...
✅ Ensures that main waits for both threads to finish before proceeding.

Example 2: join() with Timeout
You can specify a timeout for join(), so the main thread does not wait indefinitely.

class Task extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);  // Simulate long-running task
            System.out.println(Thread.currentThread().getName() + " finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class JoinTimeoutExample {
    public static void main(String[] args) {
        Thread t1 = new Task();
        t1.start();

        try {
            t1.join(1000);  // Wait for at most 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues...");
    }
}
Output
cpp
Copy
Edit
Main thread continues...
Thread-0 finished.
✅ Main thread waits 1 second, then continues execution even if t1 is not done.

Key Differences: join() vs sleep()
Feature	join()	sleep()
Pauses which thread?	Current thread until another thread finishes	Current thread for a fixed time
Releases CPU?	✅ Yes	✅ Yes
Needs to be called on?	Another thread (thread.join())	Itself (Thread.sleep())
Interruptible?	✅ Yes (Throws InterruptedException)	✅ Yes (Throws InterruptedException)
When to Use join()?
✔️ When you need to wait for another thread to finish before proceeding.
✔️ To ensure sequential execution of multiple threads.
✔️ For coordinating dependent tasks in multithreading.
 */
