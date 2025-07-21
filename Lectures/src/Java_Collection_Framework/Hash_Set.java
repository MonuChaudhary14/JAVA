package Java_Collection_Framework;
import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.Set;

/*
A Set in Java is a collection that does not allow duplicate elements and provides methods to manage a group of unique elements efficiently.

Key Features of a Set:
No Duplicates: A Set does not allow duplicate values.

Unordered Collection (except LinkedHashSet and TreeSet).

Implements the Collection interface.

Allows null values (except TreeSet when using natural ordering).

Types of Sets in Java
Java provides three main implementations of the Set interface:

Implementation	Ordered?	Sorted?	Performance
HashSet	❌ No	❌ No	Fastest, O(1) for add/remove/search
LinkedHashSet	✅ Yes (insertion order)	❌ No	Slightly slower than HashSet (O(1))
TreeSet	✅ Yes (sorted order)	✅ Yes (natural/comparator)	O(log N) operations
1. HashSet (Most Common, Fastest)
Uses hashing for fast lookup.

Order is not maintained.

 */

public class Hash_Set {

    public static void main(String[] args) {

    Set<String> set = new HashSet<String/* It is optional to give String here*/>();

    set.add("Monu");
    set.add("Poonia");
    set.add("Chaudhary");
    set.add("Poonia");   // There is no duplicate value in the set

    System.out.println(set);
    set.remove("Monu");

        System.out.println(set.contains("Poonia"));


    // TreeSet and LinkedHashSet are same as that of HashSet

    }


}
