import java.util.HashSet;   // This is used to use HashSet
import java.util.Iterator;  // This is used to import Iterator

public class Hashset {

    public static void main(String[] args) {

        /* Time complexity: - Relation between input size and running time(operations)
        Best Case- Element found out in Single turn    omega(1)
        Average Case - Sum of time complexity of all possible cases divided by total number of cases    theta(average value)
        Worst Case-Directly proportional to input size   Big O   O(n)


        // Hash Set:  Set does not allow duplicates. All the elements are unique
        They can be unordered


        Time Complexity-
        Insert- O(1)
        Search- O(1)
        Delete- O(1)

        */

        // How to declare a Hash Set

        HashSet<Integer> name = new HashSet<>();

        name.add(1);
        name.add(2);
        name.add(3);
        name.add(4);
        name.add(5);
        name.add(6);
        name.add(7);
        name.add(8);
        name.add(9);
        name.add(0);  // This element will not add into the set because 1 is already present in the HashSet

        if(name.contains(1)){    // name.contains  is used to find a element
            System.out.println("Set contains one");
        }

        name.remove(2);   // This is used to remove a element form the HashSet

        System.out.println("This is the size of HashSet: "+name.size());  // This is used to find the size of the HashSet

        System.out.println("All the elements of set are:");

        System.out.println(name);  // This is used to print all elements


        // Iterator
        Iterator it = name.iterator();

//        it.next();  It returns 1st element, and it points the 1st element
//        it.next();  It returns 2nd element, and it points to 2nd element

//        it.next returns the value as well as it move the pointer to next iteration


//         it is first pointing to null after using next it points to the first value of the set and then next

//        it.hasNext();  It returns true if the next value is available otherwise it returns false
//        If iterator is pointing to the last value then hasNext return the last value

            while(it.hasNext()){
                System.out.print(it.next()+ " ");  // this will also point the io
            }


    }

}
