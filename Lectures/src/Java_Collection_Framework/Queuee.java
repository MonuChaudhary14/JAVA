package Java_Collection_Framework;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;   // Blocking Queue are the part of java.util.concurrent package
import java.util.concurrent.LinkedBlockingQueue;

public class Queuee {

    // Queue is an interface in which follow First in First Out.
    // As it is an interface we cannot directly make objets of it

    public static void main(String[] args) throws InterruptedException /* take function throw Interrupted Exception */ {

        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);

        qu.remove();
        qu.remove();
        qu.remove();
        qu.remove();
//        qu.remove(); // This will show error in case of Linked List

       Queue<Integer> q  = new LinkedBlockingQueue<Integer/*Optional*/>();   //Search about these
       q.add(5);
       q.add(6);
       q.add(7);
       q.add(8);
//       q.add(null);   We cannot add a null value in any blocking deque

        System.out.println(q);

        ArrayBlockingQueue<Integer>/*Queue*/ queue = new ArrayBlockingQueue<Integer>(05);
        // If we make it by queue then we cannot access the put and take element which are thread safe
        try{
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);  // After finding an Exception rest of the code will not work
            queue.remove();
            queue.add(7);
            queue.put(45);   // blocks if the queue is full

        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(queue);

        queue.poll();   // It returns null when there is no value and do not show any exception
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue.take());
        System.out.println(queue.poll());  // It returns the removed the valued
        try {
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            System.out.println(queue.element());  // This returns the first element of the queue , it throws an exception if the queue is empty
            System.out.println(queue.peek());    // Peek return null if the queue is empty
            queue.offer(4);
            queue.offer(5);
            queue.offer(6);  // Offer return true(success) and false(fails) so it does not show any exception
            queue.remove();
            queue.offer(7);
        }
        catch(Exception e){
            System.out.println("Error in Offer");
        }
        System.out.println(queue);


        Queue<Integer> q1 = new PriorityQueue<>();

        q1.offer(2);
        q1.offer(5);
        q1.offer(1);
        q1.offer(4);
        q1.offer(3);

        System.out.println(q1);

        q1.poll();
        q1.poll();

        System.out.println(q1.peek());

        System.out.println(q1);


    }

}
