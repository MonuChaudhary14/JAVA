package Thread;

public class Synchronization_Under_Concurrency_Control {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

      new Thread(new Runnable(){

          public void run(){
              for(int i = 1; i <= 1000; i++){
//                  counter++;    Since it is static so we can call it directly
                    Synchronization_Under_Concurrency_Control.counter++;
              }
              System.out.println("Loop is over");
          }

      }).start();

      new Thread(new Runnable(){

          public void run(){

              for(int i = 1; i <= 1000; i++){
                  Synchronization_Under_Concurrency_Control.counter++;
              }
              System.out.println("Loop 2 is over");
          }
      }).start();

        Thread.sleep(1000);  // If we do not use this then we get this output random and counter can be before thread1 and thread2
        System.out.println(Synchronization_Under_Concurrency_Control.counter);  // If we do not use sleep then this output will be different because it is executed before the completion of the Threads


    }
}

