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
//        Type of Reference Variable: The reference variable v is of type Vehicle. This determines what methods and properties you can access directly through v. It must comply with the methods and properties defined in the Vehicle class.
//
//        Actual Object: The actual object created and assigned to v is of type Car, which means the runtime type of the object is Car.


        c1.age = 45;  // We can access the feature of class Vehicle
        c1.cost = 1265654654;

        /*Method Overriding

        If a subclass provides the specific implementation of the method that has been declared by one of its parent class ,it is known as method overriding .

        Method Overriding is also known as runtime polymorphism. Hence, we can achieve polymorphism in JAVA with the help of inheritance.

         */

        c1.print();

        /*
        Every object of a class has some in build functions which can be used by the object. This build in functions are contained in object class.  This is also called as object class is the top most parent of every class
         */



        /* Super Keyword

        Super is a special keyword that is used to refer to the immediate instance of parent class,to invoke a method of immediate parent class,to invoke constructor of immediate parent class

         */

        /*
        Final Keyword

        The final keyword is a non-access modifier used to define entities that cannot be changed for modified.  This can be used in variables, functions, and classes.
        A final variable must be initialized when it is declared or in the constructor if it's an instance variable.
        Subclasses cannot override a final method. This is useful for methods that are critical to the operation of the class and should not be modified.Ensures that the method implementation is not changed by subclasses.
        A final class cannot be subclassed. This is useful for creating immutable classes or when a class should not be extended for security or design reasons.Ensures that no other class can extend it.
         */


    }
}

class Vehicle{

    int age;

    String name ;

    Vehicle(){
        this(78);   // This and Super must be the first to call in the class. So we cannot use this and super at the same time and in the same function or constructor
        System.out.println("This is the default constructor of Vehicle");
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
    int cost;
    String color;

    Car(){    // When there are default constructor of parent class, then the default constructors of all the parent class execute first
//        super();  This invoke the parent class constructor

        super(15);  // Super must be the first statement in constructor when invoking the constructor of parent class
        // The above super invoke the parametrized constructor of parent class

        System.out.println("This is the default constructor of Car");
    }

    void print(){
        super.print();   // This invokes the print function of Vehicle Class because it is its immediate parent class
        System.out.println(this);
        System.out.println("I am class Car");
    }

}

final class FinalClass{  // This class does not have any subclasses or child classes
        int a;

        void print(){
            System.out.println("This is the final Class");
        }
}
