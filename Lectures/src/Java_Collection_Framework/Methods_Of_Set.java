package Java_Collection_Framework;

public class Methods_Of_Set {

    /*
    The Set interface in Java extends the Collection interface, so it inherits all the methods from Collection. Below is a list of all commonly used methods in a Set, categorized for better understanding.

1. Basic Methods
These methods allow basic operations like adding, removing, and checking elements.

Method	Description
boolean add(E e)	Adds the specified element to the set if it's not already present.
boolean remove(Object o)	Removes the specified element from the set.
boolean contains(Object o)	Returns true if the set contains the specified element.
int size()	Returns the number of elements in the set.
boolean isEmpty()	Returns true if the set is empty.
void clear()	Removes all elements from the set.

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println(set.contains("Banana")); // true
        System.out.println(set.size()); // 3

        set.remove("Banana");
        System.out.println(set.contains("Banana")); // false
    }
}
2. Bulk Operations
These methods help in performing operations on multiple elements at once.

Method	Description
boolean addAll(Collection<? extends E> c)	Adds all elements from the specified collection to the set.
boolean removeAll(Collection<?> c)	Removes all elements from the set that are also contained in the specified collection.
boolean retainAll(Collection<?> c)	Retains only the elements that are contained in the specified collection (performs intersection).
boolean containsAll(Collection<?> c)	Returns true if the set contains all elements from the specified collection.

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class SetBulkOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        set1.retainAll(set2); // Intersection operation
        System.out.println(set1); // Output: [3, 4, 5]
    }
}
3. Iteration Methods
These methods allow iteration over the elements of the set.

Method	Description
Iterator<E> iterator()	Returns an iterator over the elements in the set.
Spliterator<E> spliterator()	Returns a spliterator to use for parallel processing.

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetIteration {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
4. Stream and Parallel Processing Methods (Since Java 8)
Java 8 introduced new methods to work with streams.

Method	Description
Stream<E> stream()	Returns a sequential stream with the elements of this set.
Stream<E> parallelStream()	Returns a parallel stream with the elements of this set.
Example (Using Streams)
java
Copy
Edit
import java.util.Set;
import java.util.HashSet;

public class SetStreamExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        set.stream().forEach(System.out::println); // Output: 10 20 30 (order may vary)
    }
}
5. Convert Set to Array
These methods help in converting a Set to an array.

Method	Description
Object[] toArray()	Converts the set into an array of Object.
<T> T[] toArray(T[] a)	Converts the set into an array of the specified type.
Example
java
Copy
Edit
import java.util.Set;
import java.util.HashSet;

public class SetToArray {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        String[] array = set.toArray(new String[0]); // Convert set to array
        for (String color : array) {
            System.out.println(color);
        }
    }
}
6. Equality and HashCode Methods
These methods help in checking equality and generating hash codes for a Set.

Method	Description
boolean equals(Object o)	Compares two sets and returns true if they contain the same elements.
int hashCode()	Returns a hash code value for the set.
Example
java
Copy
Edit
import java.util.Set;
import java.util.HashSet;

public class SetEqualityExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println(set1.equals(set2)); // true (order does not matter)
    }
}
Summary of All Methods in Set
Method	Description
add(E e)	Adds an element if not already present.
remove(Object o)	Removes an element from the set.
contains(Object o)	Checks if an element is in the set.
size()	Returns the number of elements in the set.
isEmpty()	Checks if the set is empty.
clear()	Removes all elements.
addAll(Collection<? extends E> c)	Adds all elements from another collection.
removeAll(Collection<?> c)	Removes all matching elements.
retainAll(Collection<?> c)	Retains only the elements found in another collection.
containsAll(Collection<?> c)	Checks if all elements from another collection are present.
iterator()	Returns an iterator over the set.
spliterator()	Returns a spliterator for the set.
stream()	Returns a sequential stream of elements.
parallelStream()	Returns a parallel stream of elements.
toArray()	Converts the set to an array.
equals(Object o)	Compares two sets for equality.
hashCode()	Returns a hash code for the set.

     */

}
