package Java_Collection_Framework;

import java.util.List;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        List<Integer> vector = new Vector<>();

        // A vector is synchronised due to which only one thread can access it at a time
        // As it is synchronised so it is slower than other list types like ArrayList

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(4);    // This is the index value

        vector.set(1 ,5);

        System.out.println(vector);


    }

}
