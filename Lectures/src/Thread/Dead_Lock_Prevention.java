package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dead_Lock_Prevention {
        static Lock lock1 = new ReentrantLock();
        public static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {

            public void run() {
                boolean flag1 = false;
                boolean flag2 = false;
                while(true){
                    try{
                        flag1 = lock1.tryLock(10 , TimeUnit.MILLISECONDS);
                        flag2 = lock2.tryLock(10 , TimeUnit.MILLISECONDS);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        if(flag1){
                            System.out.println("Thread1, lock1");
                            lock1.unlock();
                            break;
                        }
                        if(flag2){
                            System.out.println("Thread2, lock2");
                            lock2.unlock();
                            break;
                        }
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            //        Object lock = new Object();
            public void run() {
                boolean flag1 = false;
                boolean flag2 = false;
                while(true){
                    try{
                        flag2 = lock2.tryLock(10 , TimeUnit.MILLISECONDS);
                        flag1 = lock1.tryLock(10 , TimeUnit.MILLISECONDS);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }finally {
                        if(flag2){
                            System.out.println("Thread2, lock2");
                            lock2.unlock();
                            break;
                        }
                        if(flag1){
                            System.out.println("Thread1, lock1");
                            lock1.unlock();
                            break;
                        }
                    }
                }
            }

        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main Thread");


    }

}
