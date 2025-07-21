package Thread;

public class Static_Synchronization {


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for(int i = 0; i < 5; i++){
                    try{
                        Brackets1.generate();
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
                    Brackets1.generate();
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

class Brackets1{

    synchronized public static void generate() throws InterruptedException {

            for (int i = 1; i <= 20; i++) {
                Thread.sleep(5);

                if (i <= 10) {
                    System.out.print('{');
                } else {
                    System.out.print('}');
                }
                for(int j = 0; j <  10; j++){
                    Thread.sleep(1);
                }
            }
        System.out.println();
        }
}
