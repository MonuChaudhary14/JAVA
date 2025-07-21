package Thread;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Anonymous_Thread {

    public static void main(String[] args){
        // Anonymous Thread
        Thread thread3 = new Thread(new Runnable(){

            public void run(){

                for(int i = 0; i < 10; i++){
                    try{
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }

            }

        });
        thread3.start();

        System.out.println("**********");

        // Another method

        new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    try{
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }).start();

     }
    }
