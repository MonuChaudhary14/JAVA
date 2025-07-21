public class Seventh {
    public static void main(String[] args) {

        /*
        Abstract Class

        The abstract class in Java cannot be instantiated (we cannot create objects of abstract class).
        We use the abstract keyword to declare an abstract class.

        An abstract class can have both the regular methods and abstract methods.

        A method that doesn't have its body is known as an abstract method.

        Though abstract classes cannot be instantiated, we can create subclasses from it.
         We can then access members of the abstract class using the objects of the subclass.

        If the abstract class includes any abstract method , then all the child class inherited from the abstract superclass must provide the implementation of the abstract method.

        If we define any abstract methods or function in the class , then we have to make the class abstract also




        Abstraction is an important concept of OOPs that allows to hide the unnecessary details and only show the needed information. This allows us to manage complexity by omitting or hiding details with a simpler, higher level idea.

         */

//        Human h = new Human();


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

        Human human = new Human(){ //We can create an object of Human, but we have to implement it functions here
            // This is an anonymous class method. So it will be used only once
            void print(){
                System.out.println("This is Human");
            }

            void dispay(){
                System.out.println("This is the display method");
            }

        };  // We can also call functions with this just use .functionname in place of ';'

    }
}

abstract class Human{   // We cannot create an object of this class, only its child or subclasses can access or must write its abstract functions

    abstract void print();   // We cannot declare this function anymore.

    public void display(){  // We can also create methods like this but this is not a absract method

        System.out.println("Hello");

    }
}

class Animal extends Human{
    // Animal must have to implement all the abstract of the parent class or either make it also an abstract

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


    // We can make default methods which we can override means we can change the value of the methods, and it is optional to override its implementation
    default void walk() {
        System.out.println("Walking");
    }
}

interface Pet{

    void sings();
    void drinks();

    default void sleep(){   // This is a non-abstract function, and there is no need to declare it in its child class
//        These methods belong to the interface itself rather than to any instance of the implementing class. They can be called using the interface name
        System.out.println("I am sleeping");

    }

}

class FlyingAnimals implements Birds , Pet{

    // We have to give implementation of all the functions which are in birds and pet

    @Override
    public void eats(){

        System.out.println("Birds");

    }

    public void sings(){
        System.out.println("Pet is singing");
    }

    public void drinks(){
        System.out.println("Drinks");
    }

}
