package Packages;  // We have to give proper file location. Like we create another package in this, then we have to provide it like Packages.package1

public class Sixth {

    static {  // This runs just after the class is loaded. We can create multiple static block, and we can also assign the values
        System.out.println("Called from the static block");
    }

    public static void main(String[] args) {

        /*
        A package is simply a container that groups related types (Java classes, interfaces, enumerators and annotations).

        To define package in Java, you use a keyword 'package'.
        Java uses file system directories to store packages.

        Importing a package

        Java has an import statement that allows you to import an entire package, or use only certain classes and interfaces defined in the package.

        import java.util.Date    this import only date class
        import java.io.*; imports everything inside java.io.package

        import java.util.Scanner;
        import java.util.*;

        In Java, the import statement is written directly after the package statement (if it exists) and before the class definition

         */


        /*
        Java Access Modifiers: -

        In Java, access modifiers are used to set the accessibility(visibility) of classes, interfaces, variables, methods, constructors, data members and the setter methods.

        public void print(){
        sout("This is accesses by any other member of the inherited class object")

        }

        // IMP-->(Check) A protected element can be accessed by only the subclass when it is in different package not even the object of the class(which contain the element) can access it

        // Protected can also be accessed through the subclass of subclass of parent class

        C:\Users\prach\OneDrive\Pictures\Screenshots\Screenshot 2024-10-25 210418.png  see this image for more clarity

         */

        /*
        Java Encapsulation

        Encapsulation refers to the bundling of fields and methods inside a single class. It prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.

        It means changing the elements of a class inside the class so that outer class members cannot access it

         */

        /*
        Data Hiding

        Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way of data hiding.
        We can access modifiers to achieve data hiding.

        Note:-  People often consider encapsulation as data hiding, but that's not entirely true.
        Encapsulation refers to the bundling of related fields and methods together. This can be used to achieve data hiding. Encapsulation is not itself data hiding.

         */

        Person p1 = new Person();  // This is an example of Encapsulation

        p1.setAge(45);  // In this we cannot directly access the age variable, we need to call the functions for this
        p1.getAge();


        /*
        static keyword:

        // When we give a static variable then it will be common to all the objects of the class
        // This is the part of the class not the object
        // If value is increases by any object then it will be updated for all the variable
        // Always use Class Name to access it (can also be access in the class with this keyword)
        // It can be accessed before creating the object(instance) of the class
        // We cannot use this keyword in static method
        // It cannot access the non-static methods directly
        // But a non-static method can call the static method directly
        // When we want to initialise the static variables then we can make a static block which will be initialised at one time when class is loaded
        // Outside classes cannot be static because it does not depend upon another class
        // Static elements are resolved during compile time



        // When we have a method in another non-static method , then there is no need to make the object to call the method because the method in which the object is also requires an object
        // But if there is non-static method inside a static method then we need to make the object of non-static class to access it because so no object is created to call a static method



        This is used to create a function or variable which can be used anywhere we do not need any object to access it .

        If an object change the value of static then it value will be changed for whole program

        If we want to access class members without creating an instance of the class, we need to declare the class member static.

        Static variable can be accessed by calling the class name of the class. There is no need to create an instance of the class for accessing the static variable are the class variable and are shared among all the class instances.

        Only a single copy of the static variable is created and shared among all the instances of the class.
        because it is a class level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
        First memory is given to static variables or functions even if class is not executed

        If an object modifies the value of a static variable , the change will be reflected across all objects.

        Static variables can be used in any type of method: static or non-static

        Non-static variable cannot be used inside the static methods. It will throw a compile time error

        We can call a static function in non-static function , but we cannot call a no  static function in a static variable without creating its class.

         */

        System.out.println(Person.count);

        /*
        Static Methods

        The static members and methods belong to the class rather than the instance of the class means no need to create an object of class.
        When the implementation of the particular method is not dependent on the instance variable and instance methods,
        In that case, we can make that method to be static.

        They are accessed by the name of the class.

        The keywords such as this and super are not used in the body of the static method.

        The modification of the static field value is not allowed.

        If we want that the static value does not change, then use static final

         */




        /*
        Singleton Classes
        A Singleton class is a class that allows only one instance to be created. It ensures that a single object is shared throughout the application.
         */

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();   // Both the object s1 and s2 have same object

        child c = new child();
        parent p = new child();
        p.print();
        c.print();



    }
}

class Singleton{

    private Singleton(){    // Here the constructor is private which is responsible to create a new object
        System.out.println("This is constructor");
    }

    static Singleton getInstance(){      // Static ensures that it can be accessed without the object
        return  new Singleton();   // We can also make it outside and we can return the object
    }

}

class teacher{

    static int count;
    static String name;

    static {
        count = 0;
        name = "Monu";
        System.out.println("The will only run once");
    }

    public int experience;

    private int ID;   // This is not accessed by any member or object of the class outside the class
    // It can be accessed in the class teacher

}

class Person{

    private int age;
    private String name;
    static int count = 15;

    public void setAge(int age){
        // we can use various restrictions for users to set age
        this.age = age;
    }

    public void getAge()
    {
        System.out.println(age);
    }
}

class parent{

    static void print(){           // There is no point to override the static methods because always the method of parent class is called when the reference is of parent because they did not depend upon object
        System.out.println("In parent");
    }

}

class child extends parent{

//    @Override
    static void print(){
        System.out.println("In child");
    }
}
