package Practice;
import javax.crypto.spec.PSource;
import java.lang.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _1 {

    _1(){
        System.out.println("This is public class");
    }


    public static void main(String[] args) {

        _1 obj = new _1();

        System.out.println("This is main function");

        float x = 0.7f;
        float y = 0.9f;

        float a = x + 0.1f;
        float b = y - 0.1f;

        System.out.println(a == b);


        Animal human = (Animal) new Human();

        human.sound();

//        human.speak();

//        Human new_human = (Human) new Animal();
//
//        new_human.sound();


        int[] arr = {12, 3, 45, 6};

        IntStream stream = Arrays.stream(arr);

        System.out.println(stream.toString());

    }





}

class variables{
    int start;
    final int val = 10;
    static String name;

}

class Animal{
    void sound(){
        System.out.println("sound");
    }
}

class Human extends Animal{

       public void sound(){
            System.out.println("Human");
        }

        public void speak(){
            System.out.println("yes , the humans can speak");
        }


}




