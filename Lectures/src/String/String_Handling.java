package String;

public class String_Handling  {

    /*
    In Java, String is a class that represents a sequence of characters. Strings in Java are immutable, meaning once a String object is created, its value cannot be changed.

1. Creating Strings
There are two ways to create a string in Java:

1.1 Using String Literals (String Pool)

String s1 = "Hello";
String s2 = "Hello"; // Reuses the same object from String Pool
Strings created this way are stored in the String Pool, which is part of the Heap Memory.

If a string with the same value already exists, Java reuses the existing object instead of creating a new one.



String pool is a separate memory for memory structure inside the heap memory
All the similar value of String are not recreated in the pool(Make optimised program)




1.2 Using new Keyword (Heap Memory)

String s3 = new String("Hello");
String s4 = new String("Hello");
Strings created with new are stored separately in the heap even if they have the same value.

Here, s3 and s4 are different objects.

2. String Immutability
Once a String is created, its value cannot be changed.

Example:

String str = "Java";
str.concat(" Programming"); // Creates a new object but doesn't change 'str'
System.out.println(str); // Output: Java
Since strings are immutable, str.concat(" Programming") creates a new string, but str still refers to "Java".

If you want to modify str, assign it explicitly:

str = str.concat(" Programming");
System.out.println(str); // Output: Java Programming

3. Common String Methods
Method	Description	Example
length()	Returns length of string	"Java".length() → 4
charAt(index)	Returns character at a specific index	"Java".charAt(1) → 'a'
toUpperCase()	Converts to uppercase	"java".toUpperCase() → "JAVA"
toLowerCase()	Converts to lowercase	"JAVA".toLowerCase() → "java"
equals(str)	Compares two strings (case-sensitive)	"Hello".equals("hello") → false
equalsIgnoreCase(str)	Compares ignoring case	"Hello".equalsIgnoreCase("hello") → true
contains(substring)	Checks if string contains another string	"Java Programming".contains("Java") → true
replace(old, new)	Replaces part of a string	"Java".replace('J', 'K') → "Kava"
substring(start, end)	Extracts a substring	"Hello".substring(1, 4) → "ell"
split(regex)	Splits a string into an array	"a,b,c".split(",") → ["a", "b", "c"]
trim()	Removes leading and trailing spaces	" Java ".trim() → "Java"

4. String Comparison
4.1 Using == (Reference Comparison)
Checks if two string references point to the same object.

String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2); // true (same reference in String Pool)
System.out.println(s1 == s3); // false (different objects in heap)

4.2 Using .equals() (Content Comparison)
Compares actual content of the strings.

System.out.println(s1.equals(s3)); // true (same content)

5. StringBuffer and StringBuilder (Mutable Strings)
Since String is immutable, if you need to modify strings frequently, use:

StringBuffer (Thread-safe, slower)

StringBuilder (Faster, not thread-safe)

StringBuilder sb = new StringBuilder("Hello");
sb.append(" World"); // Modifies the same object
System.out.println(sb); // Output: Hello World

6. String Formatting (String.format())

String name = "Alice";
int age = 25;
String result = String.format("My name is %s and I am %d years old.", name, age);
System.out.println(result); // Output: My name is Alice and I am 25 years old.
     */


    public static void main(String[] args) {

        // Additional Info

        String s1 = "Hello World";
        String s2 = "Bye World";

        System.out.println(s1.compareTo(s2));  // This will return +ve value when s1 is greater
//        -ve value when s2 is greater
//        0 when both are equal


    }

}
