package Thread;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Thread_Class_By_Runnable {

    public static void main(String[] args){

        Thread thread1 = new Thread(new Mycounter(1));
        Thread thread2 = new Thread(new Mycounter(2));

        thread1.start();
        thread2.start();


    }
}

class Mycounter implements Runnable {

    private int threadNo;

    public Mycounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The thread number is " + threadNo + " the iteration is " + i);
        }

    }
}
