import java.util.Objects;
public class Fifth {


    public static void main(String[] args) {

        final int number  = 45;   // This cannot be overwritten in the whole program

        /* INHERITANCE

        Inheritance is one of the key features of OOP that allows us to create a new class from an existing class.
        The new class that is created is known as subclass (child or derived class), and the existing class from where the child class
        is derived is known as superclass (parent or base class).

         */

        Car c1 = new Car();
        Vehicle v = new Car();  // v is a reference variable of type Vehicle that points to an object of type Car
        // We "cannot" access the elements of child class from this
//        System.out.println(v.cost);   // This cannot be done
        // The type of reference variable determines the elements it can access

//        Car c2 = new Vehicle();

//        We cannot do this
//        Here we have the access to the elements of Car class, but it is initializing the object of Parent class due to which the element of child class are not initialized
//        We cannot call the constructor of child class from Parent class

//        The reference type defines which one to access while the object define which one to run

        // We can create the object of child class using a parent class and this is called as Upcasting
//        Upcasting in Java is the process of converting a subclass type into a superclass type.
//        This is done implicitly or explicitly and allows a subclass object to be referenced by a superclass reference.

//         How java determines which method to run?
//        Ans-
//        Dynamic Method Dispatch (also called Runtime Polymorphism) is a mechanism in Java where a method call is resolved at runtime, rather than at compile time.
//        It allows method overriding, where a subclass provides its own specific implementation of a method already defined in the superclass.
//
//                How It Works?
//        A superclass reference is used to call an overridden method in a subclass.
//
//                The method that gets executed is determined by the actual object type (not the reference type).
//
//                Java uses dynamic binding (late binding) to determine which method to call at runtime.



//        Type of Reference Variable: The reference variable v is of type Vehicle. This determines what methods and properties you can access directly through v.
//        It must comply with the methods and properties defined in the Vehicle class.

//        Actual Object: The actual object created and assigned to v is of type Car, which means the runtime type of the object is Car.

        // The parent class cannot access the properties of child class
        // A class can only access the properties of its upper class





        c1.age = 45;  // We can access the feature of class Vehicle
        c1.cost = 1265654654;

        /*Method Overriding

        If a subclass provides the specific implementation of the method that has been declared by one of its parent class ,it is known as method overriding .

        Method Overriding is also known as "runtime polymorphism". Hence, we can achieve polymorphism in JAVA with the help of inheritance.

         */

        c1.print();

        /*
        Every object of a class has some in-build functions which can be used by the object. This build in functions are contained in object class.
         This is also called as object class is the top most parent of every class
         */



        /*
        Binding refers to the process of associating a method call with its corresponding method implementation. In Java, binding can be early (static) or late (dynamic).

1. Early Binding (Static Binding)
Happens at compile-time.

Faster execution since method calls are resolved at compile-time.

Used in method overloading and final, static, or private methods (since they cannot be overridden).

Determined by the reference type, not the object.

Example of Early Binding (Method Overloading)
class Demo {
    void show(int a) {
        System.out.println("Integer method: " + a);
    }

    void show(String s) {
        System.out.println("String method: " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show(10);      // Calls show(int)
        obj.show("Hello"); // Calls show(String)
    }
}

The method call is determined at compile-time.

The correct method is selected based on method signatures.

No overriding, only overloading.

2. Late Binding (Dynamic Binding)
Happens at runtime.

Slower than early binding, as method calls are resolved dynamically.

Used in method overriding.

Determined by the actual object, not the reference type.

Example of Late Binding (Method Overriding)
java
Copy
Edit
class Parent {
    void show() {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class show method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();  // Upcasting
        obj.show(); // Late binding: Calls Child's show() method
    }
}

The method call is resolved at runtime.

The actual object type (Child), not the reference type (Parent), determines which method to execute.

Enables runtime polymorphism.

🔍 Key Differences Between Early and Late Binding
Feature	Early Binding (Static)	Late Binding (Dynamic)
Resolution Time	Compile-time	Runtime
Performance	Faster	Slower
Used In	Method Overloading, static, final, and private methods	Method Overriding
Method Call Determined By	Reference type	Actual object type
Example	Method Overloading	Method Overriding

         */




        /* Super Keyword

        Super is a special keyword that is used to refer to the immediate instance of parent class,to invoke a method of immediate parent class,to invoke constructor of immediate parent class

        Object class is the parent class of all the class

        We can also use this keyword in child class to access the elements which are not present in child class but present in parent class because then it will check if
//      the element is present in child class then it will search in Parent class

         */

        /*
        Final Keyword

        The final keyword is a non-access modifier used to define entities that cannot be changed for modified.  This can be used in variables, functions, and classes.
        A final variable must be initialized when it is declared or in the constructor if it's an instance variable.
        Subclasses cannot override a final method. This is useful for methods that are critical to the operation of the class and should not be modified.Ensures that the method implementation is not changed by subclasses.
        A final class cannot be subclassed. This is useful for creating immutable classes or when a class should not be extended for security or design reasons.Ensures that no other class can extend it.
         */

        final Vehicle v2 = new Vehicle();  // When we do then we cannot the change the reference of v2 but we can change the value of the class object
//        v2 = new Vehicle();  // This is not possible
        v2.age = 45;  // This is possible

    }
}

class Vehicle{

    int age;

    String name ;

    Vehicle(){
        this(78);   // This and Super must be the first to call in the class. So we cannot use this and super at the same time and in the same function or constructor
        System.out.println("This is the default constructor of Vehicle");
    }

    Vehicle (int age , String name){
        this.age = age;
        this.name = name;
    }

    Vehicle(int age){

        System.out.println("The age of the vehicle is "+age);
    }

    void print(){

        System.out.println("I am class Vehicle");
    }

    final void accelerete(){   // This function with same arguments cannot be created(defined) in this or even its child or base class

        System.out.println("vehicle is accelerating");
    }

}

class Car extends Vehicle{

    int purchase_date;
    public int cost;
    String color;

    Car(){    // When there are default constructor of parent class, then the default constructors of all the parent class execute first
//        super();  This invoke the parent class constructor

        super(15);  // Super must be the first statement in constructor when invoking the constructor of parent class
        // The above super invoke the parametrized constructor of parent class

        System.out.println("This is the default constructor of Car");
    }

    public Car(int purchase_date, int cost, String color, int age  , String name) {   // Here we have also provided the elements of parent class to initialize
        super(age, name);
        this.purchase_date = purchase_date;
        this.cost = cost;
        this.color = color;
    }

    public Car(int age, int purchase_date, int cost, String color) {
        super(age);
        this.purchase_date = purchase_date;
        this.cost = cost;
        this.color = color;
    }

    void print(){
        this.age = 60;  // Here we can call the elements of parent class using the "this" keyword
        super.name = "Car";  // We can also use the super keyword to access the elements of parent class
        super.print();   // This invokes the print function of Vehicle Class because it is its immediate parent class
        System.out.println(this);
        System.out.println("I am class Car");
    }

}

final class FinalClass{  // This class does not have any subclasses or child classes because there is a final keyword
        int a;

        void print(){
            System.out.println("This is the final Class");
        }
}
