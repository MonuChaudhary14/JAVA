package Thread;

public class Volatile_Keyword {

    public static void main(String[] args) {

    /*
    The volatile keyword in Java is used to ensure that changes to a variable are always visible to all threads. It prevents caching and reordering optimizations, ensuring consistent and up-to-date values across multiple threads.

Why Use volatile?
By default, Java threads may cache variables locally to improve performance. This means that one thread may not see the latest changes made by another thread. Declaring a variable as volatile ensures that:

Changes are immediately written to main memory (not just thread-local cache).

Other threads always read the latest value from main memory.

Example: Without volatile (Issue)
Let's see a visibility problem that occurs when a variable is not volatile:

class Worker extends Thread {
    private boolean running = true;  // Not volatile

    public void run() {
        while (running) {  // May be cached, causing an infinite loop
            // Thread may never see changes to 'running'
        }
    }

    public void stopRunning() {
        running = false;  // Change might not be visible to 'run' method
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        Thread.sleep(1000);
        worker.stopRunning();  // Thread may not stop if 'running' is cached
        System.out.println("Requested to stop thread.");
    }
}
Issue:
The running variable may be cached by the worker thread.

The stopRunning() method updates running = false, but the worker thread might never see the update, causing an infinite loop.

Fix: Using volatile
By marking running as volatile, we force threads to always read the latest value from main memory.

class Worker extends Thread {
    private volatile boolean running = true;  // Now volatile

    public void run() {
        while (running) {
            // Always reads the latest value of 'running' from main memory
        }
    }

    public void stopRunning() {
        running = false;  // Immediately visible to other threads
    }
}
Now:
✅ The running variable is not cached, ensuring that the thread sees updates immediately.
✅ The worker thread stops correctly when stopRunning() is called.

When to Use volatile?
Use volatile when: ✔️ Multiple threads read and write the same variable
✔️ No compound operations (like x++) are used
✔️ Only a single variable needs to be synchronized

Limitations of volatile
❌ Does not provide atomicity → Use synchronized for operations like counter++.
❌ Cannot be used with compound operations (e.g., x = x + 1 or list.add(value)).
❌ Only works for primitive types and object references (not collections).
     */

    }

}
