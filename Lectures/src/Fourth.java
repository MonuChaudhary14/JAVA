public class Fourth {  // Only one class can be public
    public static void main(String[] args) {

    //OOPS

/*            Classes and Objects

    1. Classes is a blueprint that defines some properties and behaviors.
    An object is an instance of a class which has those properties and behavior attached.

    2.A class is not allocated memory (but is stored in meta-space) when it is defined. An object is allocated memory when it is created.

    3.Class is a logical entity whereas an object is a physical entity.

    4.A class is declared only once. On the other hand, we can create multiple objects of a class

    5.A class is a way to arrange data and behavior information. It is a template that must be implemented by its objects.

    6.A class can also be seen as a user defined data type where any object of defined data type has some predefined properties and behaviors.

 */

    //Creating an object of Class Dog
        Dog d1 = new Dog();

        d1.age = 12;
        d1.color = "Black";
        d1.name = "Jack";

        d1.bark();


        Dog d2 = new Dog();
        d2.name = "Jerry";

        d2.walk();


        /* Method Overloading
        1.Two or more methods can have the same name inside the same class if they accept different arguments.
        This feature is known as method overloading.

        2.Method Overloading is achieved by either:
        a. Changing the number of arguments.
        B. changing the data type of arguments

        3.It is not method overloading if we only change the return type of methods.
        There must be differences in the number of parameters

        void func();
        void func(int a);
        int func(int a , int b);
        void func(int a , int b);   In this case, this method is not different from the prev.  This is not method overloading.
        void function(float a);

        */


        /*
        Static

        Static blocks, also known as static initialization blocks, are used to initialize static variables. They are executed only once when the class is first loaded into memory, before the main method or any other static methods. Static blocks can be used to perform complex static initializations that cannot be done in a single line of code.

Key Points:

Executed only once when the class is loaded.

Used to initialize static variables.

Can perform complex initializations.

Example:

java
public class Example {
    static int count;
    static String message;

    // Static block
    static {
        count = 10;
        message = "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println("Count: " + count);      // Output: Count: 10
        System.out.println("Message: " + message); // Output: Message: Hello, World!
    }
}
Explanation:

The static block initializes the static variables count and message.

The block is executed when the class is loaded, ensuring that the static variables are initialized before they are used.

Static Nested Classes
Static nested classes are static classes defined within another class. They can access the static members of the outer class directly but cannot access non-static members without an instance of the outer class. Static nested classes are often used to logically group classes that will only be used in one place, increasing encapsulation and reducing clutter.

Key Points:

Can be instantiated without an instance of the outer class.

Can access static members of the outer class.

Cannot access non-static members of the outer class without an instance.

Example:

java
public class OuterClass {
    static int outerStaticVar = 100;

    // Static nested class
    static class StaticNestedClass {
        void display() {
            System.out.println("Outer class static variable: " + outerStaticVar);
        }
    }

    public static void main(String[] args) {
        // Instantiate the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display(); // Output: Outer class static variable: 100
    }
}
Explanation:

The StaticNestedClass is defined inside OuterClass and is declared static.

It can access the static variable outerStaticVar directly.

An instance of the static nested class is created using OuterClass.StaticNestedClass.

Use Cases
Static Blocks: Often used for static initialization tasks such as setting up static resources, loading configuration settings, or initializing complex static data structures.

Static Nested Classes: Useful for logically grouping helper classes, builder classes, or utility classes that are only relevant to the outer class. They help keep the code organized and maintainable.
         */


        /*
        Constructors:

        1.Constructors are invoked implicitly when you instantiate objects.

        2.The two rules for creating a constructor are:
        a.The name of the constructor should be the name of the clas
        b.A Java constructor must not have a return type.

        3.If a class doesn't have any constructor, the java compiler automatically creates a default constructor during run time. The default constructor initializes instance variables with default values.

        4.Default Constructor- A constructor that is automatically created by the Java Compiler if it is not explicitly defined.

        5.A constructor cannot be abstract or static or final.

        6.A constructor can be overloaded but cannot be overridden.

         */

        Complex num1 = new Complex();
        num1.print();


        Complex num2 = new Complex(13,45);
        num2.print();

        Complex num3 = new Complex(16);

        Complex add = num2.add(num1);
        add.print();

        System.out.println(num1);  // This stores the reference of class object


        /*This keyword: -
                In java, this keyword is used to refer to the current object inside a method or a constructor.
                We mostly use this keyword to remove any ambiguity in variable name. We can also use this to invoke methods of current class or to invoke a constructor of the current class

        */
    }
}

class Dog{   // Must try(not compulsory) to use the first letter of name of the class CAPITAL

    String name;
    int age;
    String color;

    // We can create functions in class

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+ " is barking");
    }

}

class Complex{

    int a , b;

    public Complex(){    // This is a default constructor that Java Compiler provides, and it also initializes all the value to 0
        a = 1;    // In default constructor the value for both is 0 if not defined
        b = 5;
    }

    public Complex(int real , int imaginary){

        a = real;
        b = imaginary;

    }

    public Complex(int a){

      this.print();
      this.a = a;   // When we do not give this compiler, read the "a" as the parameters "int a". By using "this" it enables the compiler that it point the variable a outside of the constructor
        b = 12;      // This stores the reference of current element which is invoked by the user

    }

    void print(){   // This is a function

        System.out.println(a+" + i"+b);

    }

    Complex add(Complex first){

        System.out.println(this);  // This stores the reference of the object in which this is invoked
        this.print();               // This prints the print for num2 because we give num2.print(num1);
        first.print();
        return new Complex(first.a+a , first.b+ b);
        // If we return a class, then we can also return this. It returns the class which is called (check)
    }

}
