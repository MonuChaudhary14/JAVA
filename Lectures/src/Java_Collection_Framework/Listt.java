package Java_Collection_Framework;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Listt {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Monu");
        list1.add("Chaudhary");
        list1.add("Poonia");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Ketan");
        list1.add("Chaudhary");
        list1.add("Poonia");

        Listt list = new Listt();

        list.display(list1);
        list.display(list2);

    }

    void display(List<String> list) {      // We can give all types of list like linked or ArrayList in this
        for(String s : list){
            System.out.println(s);
        }
    }


}
/*
Autoboxing and unboxing are features introduced in Java 5 that allow automatic conversion between primitive types and their corresponding wrapper classes.

📌 Autoboxing
Autoboxing is the automatic conversion of a primitive type to its corresponding wrapper class. This happens when a primitive is assigned to a reference variable of the corresponding wrapper class.

For example:

int → Integer

double → Double

char → Character

Example of Autoboxing
java
Copy
Edit
public class AutoboxingExample {
    public static void main(String[] args) {
        int num = 10;            // Primitive type
        Integer integerObj = num;  // Autoboxing: int -> Integer

        System.out.println("Integer Object: " + integerObj);  // Output: Integer Object: 10
    }
}
In the example above, int num = 10; is automatically converted (boxed) into an Integer object when assigned to integerObj.

📌 Unboxing
Unboxing is the reverse process where a wrapper class object is automatically converted to its corresponding primitive type.

For example:

Integer → int

Double → double

Character → char

Example of Unboxing
java
Copy
Edit
public class UnboxingExample {
    public static void main(String[] args) {
        Integer integerObj = new Integer(20);  // Wrapper class object
        int num = integerObj;  // Unboxing: Integer -> int

        System.out.println("Primitive int: " + num);  // Output: Primitive int: 20
    }
}
In the example above, Integer integerObj = new Integer(20); is automatically converted (unboxed) to a primitive int when assigned to num.

📌 Autoboxing and Unboxing in Collections
Autoboxing and unboxing are commonly used with Java collections, such as ArrayList, where primitive types cannot be stored directly. Instead, their corresponding wrapper classes are used.

Example with ArrayList
java
Copy
Edit
import java.util.*;

public class BoxUnboxCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Autoboxing: Adding primitive int to the ArrayList
        list.add(10);
        list.add(20);

        // Unboxing: Retrieving from ArrayList into primitive int
        int first = list.get(0); // Automatic unboxing
        System.out.println("First element: " + first);  // Output: First element: 10
    }
}
In this example:

10 and 20 are autoboxed into Integer objects when added to the ArrayList.

list.get(0) automatically unboxes the Integer back into a primitive int when assigning it to the first variable.

📌 When Does Autoboxing and Unboxing Happen?
Assignment: Assigning a primitive to a wrapper class variable or vice versa.

Method Calls: Passing primitives where wrapper objects are expected and vice versa.

Collections: Using wrapper types in collections (ArrayList, HashMap, etc.), which can only hold objects, not primitives.

📌 Limitations of Autoboxing and Unboxing
Performance Overhead: While autoboxing and unboxing make coding simpler, they can add overhead in terms of memory and performance. This is because creating wrapper objects involves extra memory allocation.

NullPointerException: Unboxing a null value will throw a NullPointerException. For example, unboxing a null Integer to int will cause an error.

java
Copy
Edit
Integer integer = null;
int num = integer;  // Throws NullPointerException
📌 Example of NullPointerException with Unboxing
java
Copy
Edit
public class NullPointerExample {
    public static void main(String[] args) {
        Integer integer = null;

        // Attempting unboxing of null will throw an exception
        try {
            int num = integer;  // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }
}
Output:

javascript
Copy
Edit
Error: java.lang.NullPointerException
📌 Autoboxing and Unboxing in Conditional Statements
Autoboxing and unboxing can also occur in conditions and loops:

java
Copy
Edit
public class AutoboxingUnboxingInConditions {
    public static void main(String[] args) {
        Integer a = 5;   // Autoboxing (int to Integer)
        Integer b = 10;  // Autoboxing (int to Integer)

        // Unboxing happens here in the condition
        if (a + b > 10) {
            System.out.println("Sum is greater than 10");
        } else {
            System.out.println("Sum is less than or equal to 10");
        }
    }
}
Output:

csharp
Copy
Edit
Sum is greater than 10
In this example, a and b are unboxed before the comparison (a + b).


 */
