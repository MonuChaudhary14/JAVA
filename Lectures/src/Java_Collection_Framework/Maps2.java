package Java_Collection_Framework;
import java.util.*;

public class Maps2 {

    public static void main(String[] args) {

    Map<Code , String> map = new TreeMap<>();
    // If we use treemap and put all the values same then it will crash
    map.put(new Code("Monu" , "Hi") , "1");
    map.put(new Code("Monu" , "Hello") , "2");
    map.put(new Code("Monu" , "Ram Ram") , "3");

    System.out.println(map);


    // Searching in Maps

        System.out.println(map.get(new Code("Monu" , "Hi")));  // This will give the value which is 1

        // To search key from value

        Code code = null;

        for(Code key: map.keySet()){
            if(map.get(key).equals("Ram Ram")){
                code = key;
                break;
            }
        }

        System.out.println(code);

        Iterator it = map.entrySet().iterator();




    }

}

class Code implements Comparable<Code> {

    private String key;
    private String value;

    public Code(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }

    public String toString() {
        return "Key: " + key + " ,  Value: " + value;
    }

    public int compareTo(Code o){

        String code1 = key.concat(value);
        String code2 = o.getKey().concat(o.getValue());

        return code1.compareTo(code2);

    }

}



/*
A Map in Java is a data structure that stores key-value pairs and allows efficient retrieval, insertion, and deletion of values based on keys. Unlike a List or Set, a Map does not allow duplicate keys, though values can be duplicate.

1. Characteristics of a Map
Stores data as (Key, Value) pairs.

Keys are unique, but values can be duplicated.

Efficient lookup of values using keys.

Implements the Map interface in the Java Collections Framework.

2. Types of Maps in Java
Java provides multiple Map implementations:

Map Type	Ordering	Allows null Key?	Thread-Safe?	Performance
HashMap	No order	✅ Yes (1 key)	❌ No	Fast (O(1) average)
LinkedHashMap	Insertion Order	✅ Yes (1 key)	❌ No	Slightly slower than HashMap
TreeMap	Sorted (Ascending)	❌ No	❌ No	O(log n)
Hashtable	No order	❌ No	✅ Yes	Thread-safe but slower
3. HashMap (Unordered, Fastest)
A HashMap stores key-value pairs with no specific ordering.

Allows one null key and multiple null values.

Uses hashing for fast access.

Not thread-safe (use ConcurrentHashMap for multi-threading).

Example
java
Copy
Edit
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(null, "Mango"); // Allows one null key

        System.out.println(map.get(2)); // Output: Banana
        System.out.println(map.containsKey(3)); // Output: true
    }
}
Use Cases
✅ Caching
✅ Storing User Sessions

4. LinkedHashMap (Preserves Insertion Order)
A LinkedHashMap maintains the insertion order of keys.

Useful when order matters.

Performance is slightly slower than HashMap.

Example
java
Copy
Edit
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map); // Output: {3=Cherry, 1=Apple, 2=Banana}
    }
}
Use Cases
✅ Maintaining Access Order
✅ Caching

5. TreeMap (Sorted Order)
A TreeMap sorts keys in ascending order.

Does not allow null keys, but allows multiple null values.

Uses Red-Black Tree (self-balancing BST).

Slower than HashMap (O(log n) operations).

Example
java
Copy
Edit
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map); // Output: {1=Apple, 2=Banana, 3=Cherry}
    }
}
Use Cases
✅ Sorted Data Storage
✅ Navigable Maps

6. Hashtable (Thread-Safe, No null Keys/Values)
A Hashtable is a synchronized version of HashMap.

Thread-safe (multiple threads can access it).

Does not allow null keys or values.

Slower than HashMap.

Example
java
Copy
Edit
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map.get(1)); // Output: Apple
    }
}
Use Cases
✅ Multi-threaded Applications
✅ Legacy Code

7. ConcurrentHashMap (Thread-Safe and Fast)
A ConcurrentHashMap is a modern alternative to Hashtable.

Thread-safe but faster than Hashtable.

Does not allow null keys or values.

Example
java
Copy
Edit
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map.get(2)); // Output: Banana
    }
}
Use Cases
✅ Multi-threaded Systems
✅ High-Performance Caching

8. Key Methods in Map Interface
Method	Description
put(K key, V value)	Adds a key-value pair
get(Object key)	Retrieves the value for a key
remove(Object key)	Removes a key-value pair
containsKey(Object key)	Checks if key exists
containsValue(Object value)	Checks if value exists
size()	Returns the number of elements
isEmpty()	Checks if map is empty
clear()	Removes all entries
keySet()	Returns a set of all keys
values()	Returns a collection of all values
entrySet()	Returns a set of key-value pairs
Example
java
Copy
Edit
import java.util.HashMap;
import java.util.Map;

public class MapMethodsExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        System.out.println(map.containsKey("A")); // Output: true
        System.out.println(map.values()); // Output: [1, 2]
    }
}
9. Comparison of Map Implementations
Feature	HashMap	LinkedHashMap	TreeMap	Hashtable	ConcurrentHashMap
Order	No Order	Insertion Order	Sorted Order	No Order	No Order
Null Keys	✅ Yes (1 key)	✅ Yes (1 key)	❌ No	❌ No	❌ No
Null Values	✅ Yes	✅ Yes	✅ Yes	❌ No	❌ No
Thread-Safe?	❌ No	❌ No	❌ No	✅ Yes	✅ Yes
Performance	Fast (O(1))	Fast (O(1))	Slower (O(log n))	Slow	Fas
 */
