package Lamda_Expression;

public class Thread_Using_Lambda {

    public static void main(String[] args) {

    Thread thread = new Thread(new Runnable() {

        public void run() {
            System.out.println("Hello World");
        }

    });

    Thread thread1 = new Thread( ()-> System.out.println("Statement 1"));
    thread1.start();

    Thread thread2 = new Thread( ()-> {
        System.out.println("Statement 2");   // These two statements are now the part of run method
        System.out.println("Bye");
    });


    }
}
