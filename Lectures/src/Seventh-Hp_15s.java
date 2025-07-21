public class Seventh {
    public static void main(String[] args) {

        /*
        Abstract Class

        The abstract class in Java cannot be instantiated (we cannot create objects of abstract class). because
        We use the abstract keyword to declare an abstract class.
        If we want to create an object then we have to declare the abstract methods in it,
        We cannot create the abstract constructor ,but we can make a simple constructor
        We cannot create abstract static methods in abstract classes because static methods cannot be overridden, but we can make simple static methods in abstract classes
        A abstract classes cannot be final because it restricts the inheritance
        An abstract class can have both the regular methods and abstract methods.
        They can have any access modifier

        A method that doesn't have its body is known as an abstract method.

        Though abstract classes cannot be instantiated, we can create subclasses from it.
         We can then access members of the abstract class using the objects of the subclass.

        If the abstract class includes any abstract method , then all the child class inherited from the abstract superclass must provide the implementation of the abstract method.

        If we define any abstract methods or function in the class , then we have to make the class abstract also


        Abstraction is an important concept of OOPs that allows to hide the unnecessary details and only show the needed information.
        This allows us to manage complexity by omitting or hiding details with a simpler, higher level idea.

        */

//        Human h = new Human();


        Human h = new Animal(45);  // This is possible to create an object of child class with the reference to abstract parent class

        Human human1 = new Human(75) {
            @Override
            void print() {
                System.out.println("Human");
            }
        };

        human1.display();
        /*
        Java Interfaces

        An interface is a fully abstract class. It includes a group of abstract methods.
        We use the interface keyword to create an interface in Java.


        Like abstract classes, we cannot create objects of interfaces.
        To use an interface, other classes must implement it. We use implements keyword to implement an interface.



        Advantages of Java Interfaces

        Similar to abstract classes, interfaces help us to achieve abstraction in Java.

        Interfaces are also used to achieve multiple inheritance in Java

        All the methods inside an interface are implicitly public, and all fields are implicitly public static final.

         */


//        Birds b = new Birds();  We cannot instantiated the abstract class

        Human human = new Human(45){ //We can create an object of Human, but we have to implement it functions here
            // This is an anonymous class method. So it will be used only once
            void print(){
                System.out.println("This is Human");
            }

            void dispay(){
                System.out.println("This is the display method");
            }

        };  // We can also call functions with this just use .functionname in place of ';'



        Pet i = new FlyingAnimals(45);  // We can create a reference variable of parent interface but the object must be of child class
        Pet p = new Pet() {     // We can make the objects of interface but we have to implement the method at the same place
            @Override
            public void sings() {

            }

            @Override
            public void drinks() {

            }
        };

    }
}

abstract class Human{   // We cannot create an object of this class, only its child or subclasses can access or must write its abstract functions

    int age;

    Human(int age) {
        System.out.println("This is the constructor of Human");
        this.age = age;
    }
    abstract void print();   // We cannot declare this function anymore.

    public void display(){  // We can also create methods like this but this is not an abstract method

        System.out.println("Hello");

    }

    static void greeting(){
        System.out.println("Hello");
    }

}

class Animal extends Human{
    Animal(int age) {    // If we created a constructor in abstract method then we have to make a construct in this also when there is no parameter less constructor
        super(age);  // comment these 3 lines and check
    }
    // Animal must have to implement all the abstract methods of the parent class or either make it also an abstract

    @Override    // This shows that an existing function is override. We can use this to check the spellings of the functions
    void print(){
        System.out.println("Hello");
    }
}

interface Birds{    // we cannot use public here because it already contains a class name seventh.java so if we create a new file and then use interface then maybe we give specifiers in this

    public void eats();   // This is optional to give access modifier in interface
    void drinks(); // we cannot use private and protected it

    public static final int timespan = 50;

    int time = 45;   // This is also public static final


    // We can make default methods which we can override means we can change the method implementation, and it is optional to override its implementation
    default void walk() {              // We have to give its implementation
        System.out.println("Walking");
    }

    default void sleep(){
        System.out.println("Sleeping");
    }
}

interface Pet /*extends Animals*/{     // We can create multiple classes which implements these, and they have different function , so when we create a reference variable of a variable in the main class
//    which can point to any class which implements interface of the object , so we get different output when there are methods of same name in different interface which is not when we directly implements
//    interface in the main class


    void sings();
    void drinks();

    default void sleep(){   // This is a non-abstract function, and there is no need to declare it in its child class
//        These methods belong to the interface itself rather than to any instance of the implementing class. They can be called using the interface name
        System.out.println("I am sleeping");
    }

    static void greet(){   // Static method must have a body and they are called by interface name
        System.out.println("Hello");
    }

}

class Animals{
    int age;
    Animals(int age) {
        this.age = age;
    }
    void print(){
        System.out.println("Hello");
    }
}

class FlyingAnimals extends Animals implements Birds , Pet {
    FlyingAnimals(int age) {
        super(age);
    }

    // We have to give implementation of all the functions which are in birds and pet

    @Override
    public void eats(){

        System.out.println("Birds");

    }

    public void sings(){
        System.out.println("Pet is singing");
    }

    public void drinks(){    // The override method should be public
        System.out.println("Drinks");
    }

    @Override
    public void sleep() {   // If two interface have same default method then we have to implement it
        Birds.super.sleep();
    }

}
