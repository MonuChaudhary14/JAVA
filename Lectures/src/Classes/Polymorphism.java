package Classes;

/*
Polymorphism is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows objects to take multiple forms, enabling flexibility, code reusability, and maintainability.

Types of Polymorphism
Compile-time Polymorphism (Method Overloading)
Runtime Polymorphism (Method Overriding)

 */

public class Polymorphism {
    public static void main(String[] args) {
        phone myDevice;  // Parent class reference

        myDevice = new phone();
        myDevice.feature(); // Output: This is a phone

        myDevice = new tablet();
        myDevice.feature(); // Output: This is a tablet

        myDevice = new laptop();
        myDevice.feature(); // Output: This is a laptop
    }
}

// Base class OR Parent Class
class phone {
    public void feature() {
        System.out.println("This is a phone");
    }
}

// Subclass 1
class tablet extends phone {
    @Override
    public void feature() {
        System.out.println("This is a tablet");
    }
}

// Subclass 2
class laptop extends phone {
    @Override
    public void feature() {
        System.out.println("This is a laptop");
    }
}