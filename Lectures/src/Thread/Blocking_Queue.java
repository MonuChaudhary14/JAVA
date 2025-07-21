package Thread;

import com.sun.tools.javac.Main;

import java.util.concurrent.ArrayBlockingQueue;

public class Blocking_Queue {

    public static int counter = 1;

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Thread thread1 = new Thread(new Producer(queue));

        thread1.start();

        Thread thread2 = new Thread(new Consumer(queue));

        thread2.start();

    }

}

class Producer implements Runnable {

    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run(){

        while(true){
            try {
                Thread.sleep(1000);
                queue.put(Blocking_Queue.counter);
                System.out.println("Value added in queue: "+ Blocking_Queue.counter);
                Blocking_Queue.counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}


class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run(){
        while(true){
            try{
                Thread.sleep(1500);
                queue.take();
                System.out.println("Value taken from queue: "+ Blocking_Queue.counter);
                Blocking_Queue.counter--;
            }
            catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
