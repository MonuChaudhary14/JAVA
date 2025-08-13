package Java_Collection_Framework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList</*Not compulsory to write the data type here*/>();

        list.add("Monu");
        list.add("Chaudhary");
        list.add("Poonia");
//      list.add(15);  This will throw an error due to type mismatch

        System.out.println(list);

        for(String s: list){
            System.out.println(s);
        }

        // To get the output of a particular element
        System.out.println(list.get(1));    // it is index of the element

        list.remove(2);
        list.remove("Chaudhary");   // gives true on success and false on some problem like(no element found)

        System.out.println(list);

        list.set(0 , "Jaat");    // This also returns true or false, so it can be use in sout

        // To remove an integer element and avoid considering the number as index use
//        list.remove(Integer.valueOf(10));


        System.out.println(list);

//        ArrayList<int> numbers = new ArrayList<>();  Primitive data type cannot be used. There must be a class

        ArrayList<Integer> numbers = new ArrayList<>();   // Here Integer is a wrapper class. This can be inbuilt or user defined
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.get(2));  // this is auto unboxing

        numbers.set(1,5);

        System.out.println(numbers.size());

        System.out.println(numbers.contains(5));

        System.out.println(numbers.isEmpty());

        numbers.clear();
    }

}

/*
ArrayList is a resizable array implementation of the List interface in Java. Unlike arrays, ArrayList can grow and shrink dynamically.

📌 Key Features
Dynamic Size: No need to specify a fixed size, unlike arrays.

Indexed Access: Elements are accessed using an index (like an array).

Allows Duplicates: Can store duplicate elements.

Maintains Insertion Order: Elements remain in the order they were added.

Not Thread-Safe: Multiple threads modifying an ArrayList may cause issues.

📌 Declaration and Initialization

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Printing the ArrayList
        System.out.println(list);  // Output: [Apple, Banana, Cherry]
    }
}


Types of Constructor

1. ArrayList()
Creates an empty list with default initial capacity (usually 10).

ArrayList<String> list = new ArrayList<>();


2. ArrayList(int initialCapacity)
Creates an empty list with the specified initial capacity.

ArrayList<Integer> numbers = new ArrayList<>(20);



3. ArrayList(Collection<? extends E> c)
Creates a list containing the elements of the specified collection.

import java.util.*;

List<String> oldList = List.of("A", "B", "C");
ArrayList<String> newList = new ArrayList<>(oldList);




📌 Common Methods
Method	Description
add(E e)	Adds an element at the end.
boolean addAll(Collection < ? extends T> c)
add(int index, E e)	Inserts an element at a specific index.
get(int index)	Retrieves the element at the specified index.
set(int index, E e)	Replaces the element at the specified index.
remove(int index)	Removes the element at the specified index.
remove(Object o)	Removes the first occurrence of the given object.
size()	Returns the number of elements in the list.
contains(Object o)	Checks if the list contains a specific element.
indexOf(Object o)	Returns the index of the first occurrence of the element.
clear()	Removes all elements from the list.
isEmpty()	Checks if the list is empty.
📌 Example: Using Methods

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("ArrayList: " + numbers); // [10, 20, 30, 40]

        // Accessing elements
        System.out.println("Element at index 2: " + numbers.get(2)); // 30

        // Modifying elements
        numbers.set(1, 25);
        System.out.println("After updating index 1: " + numbers); // [10, 25, 30, 40]

        // Removing an element
        numbers.remove(2);
        System.out.println("After removing index 2: " + numbers); // [10, 25, 40]

        // Checking for an element
        System.out.println("Contains 25? " + numbers.contains(25)); // true

        // Size of ArrayList
        System.out.println("Size: " + numbers.size()); // 3

        // Clearing all elements
        numbers.clear();
        System.out.println("Is empty? " + numbers.isEmpty()); // true
    }
}
📌 Iterating Over an ArrayList
1️⃣ Using for Loop
java
Copy
Edit
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
2️⃣ Using for-each Loop
java
Copy
Edit
for (String fruit : list) {
    System.out.println(fruit);
}
3️⃣ Using Iterator
java
Copy
Edit
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
4️⃣ Using forEach() (Java 8)
java
Copy
Edit
list.forEach(System.out::println);
📌 Sorting an ArrayList
java
Copy
Edit
import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Sorting in ascending order
        Collections.sort(names);
        System.out.println("Sorted List: " + names); // [Alice, Bob, John]

        // Sorting in descending order
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Reverse Sorted List: " + names); // [John, Bob, Alice]
    }
}
📌 Converting ArrayList to Array

String[] arr = list.toArray(new String[0]);
📌 Convert Array to ArrayList

String[] arr = {"A", "B", "C"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
📌 ArrayList vs LinkedList
Feature	ArrayList	LinkedList
Data Structure	Dynamic Array	Doubly Linked List
Insertion/Deletion	Slower (shifting required)	Faster (no shifting needed)
Access Speed	Faster (O(1))	Slower (O(n))
Memory Usage	Less	More (extra pointers)
📌 When to Use ArrayList?
✔ Fast Random Access (Use get(index))
✔ Frequent Read Operations
❌ Avoid if Inserting/Deleting frequently (Use LinkedList instead)
 */
