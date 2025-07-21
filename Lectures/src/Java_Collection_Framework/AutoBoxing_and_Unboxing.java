package Java_Collection_Framework;
import java.util.ArrayList;

public  class AutoBoxing_and_Unboxing {


    public static void main(String[] args) {

        /*
        Autoboxing and Unboxing are the processes in Java that automatically convert primitive data type into
        to their corresponding wrapper class and vice versa

        Autoboxing -- >   Primitive to Wrapper class
        Unboxing --> Wrapper to primitive
         */

        ArrayList<IntWrapper> list = new ArrayList<>();   // It is a user defined data type so it cannot be used directly

        list.add(new IntWrapper(50));  // Boxing
        list.add(new IntWrapper(60));
        list.add(new IntWrapper(70));


        System.out.println(list.get(0).getValue());


        ArrayList<Double> doublelist = new ArrayList<>();
        doublelist.add(45.12);    // THis is a short method
        doublelist.add(Double.valueOf(7156.1));     // This is done behind the scene by the java       AutoBoxing

        System.out.println(doublelist.get(0));     // This is a short method
        System.out.println(doublelist.get(0).doubleValue());     // this is the real process done by the java      AutoUnboxing
    }
}

    class IntWrapper{

        private int value;

        public IntWrapper(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
        public void setvalue(int value){
            this.value = value;
        }

    }


