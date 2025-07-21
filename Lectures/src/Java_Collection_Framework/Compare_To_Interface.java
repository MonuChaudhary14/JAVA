package Java_Collection_Framework;

import java.util.*;
import java.util.function.Consumer;

public class Compare_To_Interface {

    public static void main(String[] args) {

      List<Name> names = new LinkedList();

      names.add(new Name("Monu"));   // Here the address of the constructor is assigned
      names.add(new Name("Chaudhary"));  // We get the desired output when we add toString methods in this
      names.add(new Name("Poonia"));   // This is a custom object so there is no comparable interface

        System.out.println(names);

        names.sort(null);       // This will throw an error because it is a custom value if the compareTo function is not given
        System.out.println(names);

        ArrayList<Object> elements = new ArrayList<>();   // Object is mother of everything in Java. It is the parent class of every class.
        // An object can be anything like String , int
        elements.add(new Name("Monu"));
        elements.add(new Name("Chaudhary"));
        elements.add(25);
        elements.add(25.489);

        elements.sort((o1 , o2) -> o1.toString().compareTo(o2.toString()));
        System.out.println(elements);

        Arrays.sort(new List[]{elements});
        System.out.println(elements);

//        Arrays.sort(elements , new Comparator<Object>() {
//        Sorting ArrayList<Object> Using Arrays.sort(elements, Comparator) Will Not Work
//        Arrays.sort(elements, Comparator) is incorrect because Arrays.sort() expects an array, not a list.
//
//        Fix: Use Collections.sort(elements, Comparator) instead.
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                return o1.toString().compareTo(o2.toString());
//            }
//
//        });

        Collections.sort(elements , new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                return -(o1.toString().compareTo(o2.toString()));   // BY adding -ve sign it sort in descending order
            }
        });

//        elements.sort(null);
//        System.out.println(elements);

        /*
        elements.sort(null); will cause a ClassCastException because List<Object> contains different types (String, int, double, and Name), and they don’t have a common Comparable implementation.

Fix: If sorting is necessary, a custom Comparator<Object> must be provided.
         */

        /*
        Consumer<Integer> is a functional interface in Java from the java.util.function package.
        It represents an operation that takes a single input of type Integer and returns no result (i.e., it performs some action but does not return a value).
         */

        Consumer<Integer> comsumer = element -> System.out.println(element.toString());

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {   // Here we have to use Objects or Wrapper Class

                if(o1 > o2){
                    return 1;
                }
                else if(o1 < o2){
                    return -1;
                }
                return 0;

            }
        };

        ArrayList<Integer> elements1 = new ArrayList<>();
        elements1.add(1);
        elements1.add(2);
        elements1.add(3);
        elements1.add(4);

        Collections.sort(elements1, c); // Here c is the comparator which is used to sort the elements

    }



}

class Name implements Comparable<Name> {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Name o) {   // We can also use Object
        // This method comes with compareTo interface so we have to implement it
        if(name.length() == o.name.length()){
            return 0;
        }
        else if(name.length() > o.name.length()){
            return 1;
        }
        else{
            return -1;
        }

    }

}
