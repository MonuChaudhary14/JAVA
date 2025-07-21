package Abstract;

public abstract class Person {
    // It can have a constructor
    Person(){
        System.out.println("Person constructor");
    }
    public void speak(){
        System.out.println("I'm a person");
    }

    public abstract void eat();   // This is an abstract method(method without implementation)

}
