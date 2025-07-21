package Java_Collection_Framework;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterators_Sort_Reverse {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Monu");
        list1.add("Chaudhary");
        list1.add("Poonia");

        Iterators_Sort_Reverse it = new Iterators_Sort_Reverse();
        it.printlist(list1);

        list1.sort(null);   // Null means that we want natural ordering
        it.printlist(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }

    void printlist(List<String> list){

        Iterator<String> data = list.listIterator();   // It is a custom iterator provided only for list (Search it)

        while(data.hasNext()){
            System.out.println(data.next());
        }

    }

    void delete(List<String> list){

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            it.next();
            it.remove();  // It removes the element which is returned by iterator
        }


    }

}

/*An Iterator in Java is an object that allows you to traverse through a collection one element at a time.
It is part of the Java Collections Framework and helps in safely iterating over collections, including List, Set, and Map.

 */
