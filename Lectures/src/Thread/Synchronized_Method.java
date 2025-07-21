package Thread;

public class Synchronized_Method {

    public static void main(String[] args) {

     Brackets b = new Brackets();

     new Thread(new Runnable(){
         public void run(){

             for(int i = 0; i < 5; i++){
                 b.generate();
             }

         }
     }).start();

     new Thread(new Runnable(){
         public void run(){

             for(int i = 0; i < 5; i++){
                 b.generate();
             }

         }
     }).start();

    }

}

class Brackets{

    public synchronized/* public and synchronized are interchangeable */ void generate(){

        for(int i = 1; i <= 20; i++){

            if(i <= 10){
                System.out.print('{');
            }
            else{
                System.out.print('}');
            }

        }
        System.out.println();
    }
}

