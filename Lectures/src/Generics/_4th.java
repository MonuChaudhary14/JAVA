package Generics;
import java.util.*;

public class _4th {

    // Generic Method

//    <T> before return type declares it is a generic method

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(12);
        list1.add(45);
        list1.add(60);
        list1.add(78);
        System.out.println(list1);
        new Info().print(list1);

        List<String> list2= new ArrayList<>();
        list2.add("Hello");
        list2.add("World");
        System.out.println(list2);
        new Info().print(list2);



    }


}

class Info{

    public <E> void print(List<E> list){   // This is a generic method
        // Here we can give list of any type with any data type
        for(E element : list){
            System.out.println(element);
        }

    }

    public <E> void print(E[] array){

        for(E data : array){
            System.out.println(data);
        }

    }

}
