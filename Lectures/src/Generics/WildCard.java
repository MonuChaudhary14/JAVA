package Generics;

public class WildCard {

    public static void main(String[] args) {

        /*
        Wildcards (?) in Java generics allow flexibility when working with unknown types. They are useful when you don’t know the exact type parameter or when you want to accept a range of types.

1. What is a Wildcard (?)?
A wildcard (?) represents an unknown type. It is used in generic classes, methods, and parameters.

Example of a Simple Wildcard
java
Copy
Edit
public static void printList(List<?> list) {
    for (Object element : list) {
        System.out.println(element);
    }
}
? means the method can accept a list of any type (List<Integer>, List<String>, etc.).

But you cannot add elements to the list because Java doesn't know the exact type.

2. Types of Wildcards
There are three types of wildcards in Java:

Wildcard	Meaning
?	Unbounded wildcard (accepts any type)
? extends T	Upper-bounded wildcard (T or any subclass of T)
? super T	Lower-bounded wildcard (T or any superclass of T)
3. Unbounded Wildcard (?)
Allows a method to accept a collection of any type.

Useful when you don’t care about the type.

Example
java
Copy
Edit
import java.util.*;

public class WildcardExample {
    public static void printList(List<?> list) {  // Accepts List of any type
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");

        printList(intList);  // ✅ Works
        printList(strList);  // ✅ Works
    }
}
Output
css
Copy
Edit
1
2
3
A
B
C
Key Points
Can only read elements, but cannot add new elements (list.add(...) is not allowed).

printList(List<?> list) accepts any type of List (List<Integer>, List<String>, etc.).

4. Upper-Bounded Wildcard (? extends T)
Restricts the type to T or any subclass of T.

Useful when reading from a collection.

Cannot add elements, but can read them.

Example: Accept Numbers (Integer, Double, etc.)
java
Copy
Edit
import java.util.*;

public class UpperBoundExample {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printNumbers(intList);   // ✅ Works
        printNumbers(doubleList); // ✅ Works

        // List<String> strList = Arrays.asList("A", "B", "C");
        // printNumbers(strList); ❌ ERROR (String is not a subclass of Number)
    }
}
Output
Copy
Edit
1
2
3
1.1
2.2
3.3
Key Points
? extends Number means it only accepts Number and its subclasses (Integer, Double, etc.).

Cannot add elements, because Java doesn’t know the exact type (Integer, Double, etc.).

You can only read elements safely.

5. Lower-Bounded Wildcard (? super T)
Restricts the type to T or any superclass of T.

Useful when adding elements to a collection.

You cannot assume the exact type when reading.

Example: Adding Elements
java
Copy
Edit
import java.util.*;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();

        addNumbers(intList); // ✅ Works (Integer is allowed)
        addNumbers(numList); // ✅ Works (Number is a superclass of Integer)

        // List<Double> doubleList = new ArrayList<>();
        // addNumbers(doubleList); ❌ ERROR (Double is NOT a superclass of Integer)
    }
}
Key Points
? super Integer means it accepts Integer and any superclass (Number, Object).

You can add Integer elements, but you cannot safely read non-Object elements.

6. Comparing Wildcards
Wildcard	Meaning	Read Elements?	Add Elements?	Use Case
?	Any type	✅ Yes (as Object)	❌ No	Read-only collections
? extends T	T or subclass	✅ Yes (T)	❌ No	Read elements of a certain type
? super T	T or superclass	❌ No (except Object)	✅ Yes (T and subclasses)	Adding elements
7. Real-World Example: Generic Sorting
java
Copy
Edit
import java.util.*;

public class WildcardSort {
    public static void sortList(List<? extends Comparable<?>> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(5, 3, 8, 1);
        List<String> strList = Arrays.asList("Banana", "Apple", "Cherry");

        sortList(intList);  // ✅ Works
        sortList(strList);  // ✅ Works
    }
}
Output
csharp
Copy
Edit
[1, 3, 5, 8]
[Apple, Banana, Cherry]
Explanation
List<? extends Comparable<?>> ensures that only Comparable types (Integer, String, etc.) are accepted.

Sorting works safely because all elements are Comparable.


         */


    }

}
