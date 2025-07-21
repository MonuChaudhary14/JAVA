package Thread;

/*
class SharedResource {
    public void method1() {
        synchronized (this) {
            System.out.println("Executing method1");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println("Executing method2");
        }
    }
}
 If one thread enters method1(), another thread cannot enter method2() because both use this.


 */

public class Synchronized_Block {


    public static void main(String[] args) {

    Bracketss b = new Bracketss();
    Bracketss b2 = new Bracketss();

    new Thread(new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            for(int i = 0; i < 5; i++){
                try{
                    b.generate();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time : " + (endTime - startTime));
        }
    }).start();

    new Thread(new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            for(int i = 0; i < 5; i++){
                try{
                    b2.generate();
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time : " + (endTime - startTime));
        }
    }).start();

    new Thread(new Runnable() {   // Due to this second object which is also accessing the same method there is some problem in the output
        public void run(){

            long startTime = System.currentTimeMillis();
            for(int i = 0; i < 5; i++){
                try{
                    b2.generate();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time : " + (endTime - startTime));

        }
    }).start();




    }


}

class Bracketss{

    final private Object lock = "Lock";
    private Object lock1 = new Object();  // This will also work as a lock
    // If we use multiple object which are using the same method then 'this' and 'lock' method can fail then in this we have to use static synchronisation

    public void generate() throws InterruptedException {
        synchronized (lock){    // We can also use 'this' in the place of lock
            for (int i = 1; i <= 20; i++) {
                Thread.sleep(5);

                if (i <= 10) {
                    System.out.print('{');
                } else {
                    System.out.print('}');
                }
        for(int j = 0; j <  10; j++){
            Thread.sleep(10);
        }
            }
        }
        System.out.println();


    }
}




/*
A synchronized block in Java allows you to synchronize only a specific section of code inside a method, rather than the entire method. This provides finer control over synchronization, improving performance by allowing other non-synchronized parts of the method to run concurrently.

Syntax

synchronized (lockObject) {
    // Critical section - only one thread at a time can execute this block
}
lockObject can be:

this (for instance methods)

A static object (for class-wide synchronization)

A specific object that multiple threads share

Example 1: Synchronizing on this (Instance Lock)
java
Copy
Edit
class SharedResource {
    void display(String message) {
        synchronized (this) { // Synchronized block
            for (int i = 0; i < 3; i++) {
                System.out.print("[ " + message + " ] ");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String message;

    MyThread(SharedResource res, String msg) {
        this.resource = res;
        this.message = msg;
    }

    public void run() {
        resource.display(message);
    }
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        MyThread t1 = new MyThread(resource, "Hello");
        MyThread t2 = new MyThread(resource, "World");

        t1.start();
        t2.start();
    }
}
Output (One thread executes at a time)
css
Copy
Edit
[ Hello ] [ Hello ] [ Hello ]
[ World ] [ World ] [ World ]
The entire method isn't locked, only the block inside synchronized (this).

Other non-synchronized code inside the method can execute without waiting.

Example 2: Synchronizing on a Custom Object
Instead of locking this, you can use a custom lock object to prevent unnecessary locking of the entire instance.

java
Copy
Edit
class SharedResource {
    private final Object lock = new Object(); // Custom lock object

    void display(String message) {
        synchronized (lock) { // Synchronizing only this block
            for (int i = 0; i < 3; i++) {
                System.out.print("[ " + message + " ] ");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }
}
Using a separate lock object (lock) prevents potential deadlocks caused by synchronizing on this.

Example 3: Synchronizing Static Block (Class-Level Lock)
If you need class-level synchronization, use a static object or the class itself.

java
Copy
Edit
class Shared {
    private static final Object classLock = new Object(); // Static lock object

    void display(String message) {
        synchronized (classLock) { // Lock is at class level
            for (int i = 0; i < 3; i++) {
                System.out.print("[ " + message + " ] ");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }
}
This ensures that only one thread per class can enter the block at a time, regardless of instances.

Key Differences: Synchronized Method vs Synchronized Block
Feature	Synchronized Method	Synchronized Block
Scope	Entire method	Only a specific block inside a method
Lock on	this (for instance methods) or class (for static methods)	A specific object (can be this or a custom object)
Performance	Less efficient (locks entire method)	More efficient (locks only critical section)
Flexibility	No fine-grained control	Allows different sections to have different locks
 */
