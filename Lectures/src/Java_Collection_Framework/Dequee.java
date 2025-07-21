package Java_Collection_Framework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Dequee {
    public static void main(String[] args) {

        Deque<Integer> q  = new LinkedBlockingDeque<>(45/*optional to give */);   // Array Blocking Queue
        q.offer(5);
        q.offer(6);
        q.addFirst(5);
        q.addFirst(6);
        q.addFirst(7);
        q.removeLast();
        q.removeFirst();
        q.addLast(8);
//       q.add(null);   We cannot add a null value in any blocking deque

        System.out.println(q);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(5);
        deque.offer(6);
        deque.offerFirst(4);
        deque.addFirst(5);
        deque.addLast(7);
        deque.removeLast();
        deque.removeFirst();

    }

}

/*
A Queue in Java is a collection that follows the FIFO (First In, First Out) principle. It is part of the Java Collections Framework (JCF) and is implemented by the Queue interface, which extends Collection.

Key Characteristics of Queue
FIFO Order – Elements are processed in the order they were added.

Allows Duplicates – Unlike a Set, a Queue allows duplicate elements.

Null Handling – Some implementations allow null, but others like PriorityQueue do not.

Blocking vs Non-blocking Queues – Some queues (like LinkedList) are non-blocking, while BlockingQueue implementations (like ArrayBlockingQueue) can handle concurrent operations safely.

Types of Queue Implementations
Java provides several implementations of the Queue interface:

1. LinkedList (Queue Implementation)
Implements Queue and Deque.

Allows null values.

Performance: O(1) for insertions and deletions.

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println(queue.poll()); // Output: Apple (removes first element)
        System.out.println(queue); // Output: [Banana, Cherry]
    }
}
2. PriorityQueue (Elements Sorted in Natural Order)
Does not allow null values.

Elements are sorted based on natural ordering or a custom comparator.

Not thread-safe.

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println(queue.poll()); // Output: 10 (smallest element first)
    }
}
3. ArrayDeque (More Efficient than LinkedList)
Does not allow null values.

Faster than LinkedList for add/remove operations.

import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Dog");
        queue.offer("Cat");
        queue.offer("Rabbit");

        System.out.println(queue.poll()); // Output: Dog
    }
}
4. BlockingQueue (Thread-Safe for Concurrency)
Used for multi-threading.

Methods like put() and take() block if the queue is full or empty.

Example using ArrayBlockingQueue

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        queue.put(1);
        queue.put(2);
        queue.put(3);

        System.out.println(queue.take()); // Removes and returns 1
    }
}
Queue Interface Methods
The Queue interface provides various methods for element operations.

1. Adding Elements
Method	Description
boolean add(E e)	Adds an element, throws an exception if full.
boolean offer(E e)	Adds an element, returns false if full.

Queue<Integer> queue = new LinkedList<>();
queue.add(10);  // Throws exception if full
queue.offer(20); // Returns false if full
2. Removing Elements
Method	Description
E remove()	Removes and returns the head, throws exception if empty.
E poll()	Removes and returns the head, returns null if empty.

Queue<String> queue = new LinkedList<>();
queue.add("Apple");
queue.add("Banana");

System.out.println(queue.remove()); // Output: Apple
System.out.println(queue.poll());   // Output: Banana
System.out.println(queue.poll());   // Output: null (queue is empty)
3. Accessing the Front Element
Method	Description
E element()	Retrieves the head without removing, throws exception if empty.
E peek()	Retrieves the head without removing, returns null if empty.

Queue<Integer> queue = new LinkedList<>();
queue.add(50);
queue.add(60);

System.out.println(queue.peek());    // Output: 50
System.out.println(queue.element()); // Output: 50
4. Checking Queue Size
Method	Description
int size()	Returns the number of elements in the queue.
boolean isEmpty()	Checks if the queue is empty.

Queue<Integer> queue = new LinkedList<>();
queue.add(1);
queue.add(2);

System.out.println(queue.size());    // Output: 2
System.out.println(queue.isEmpty()); // Output: false
Queue vs Deque
While Queue follows FIFO, Deque (Double-Ended Queue) allows insertion/removal at both ends.

Feature	Queue	Deque
Order	FIFO	Can be FIFO or LIFO
Insert from Both Ends	No	Yes
Remove from Both Ends	No	Yes

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");

        System.out.println(deque.removeFirst()); // Output: A
        System.out.println(deque.removeLast());  // Output: B
    }
}
Choosing the Right Queue Implementation
Implementation	Use Case
LinkedList	Simple queue operations with null allowed.
PriorityQueue	Need elements sorted in natural/custom order.
ArrayDeque	Faster than LinkedList, no null values.
ArrayBlockingQueue	Thread-safe queue with fixed size.
 */
