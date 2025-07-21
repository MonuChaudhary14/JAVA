public class Eigth {

    Lock lock = new Lock();

    void shopstatus(){

        if(lock.isLocking()){
            System.out.println("Shop is closed");
        }
        else{
            System.out.println("Shop is open");
        }

    }

    public Lock getLock() {   // how can we use this
        return lock;
    }

    public class Lock{    // By using private only the outerclass can access the methods of this class

        private boolean locking = true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }

    }



    class Number {
        int price;
    }

    static class toy{
        int price;
    }

    public static void main(String[] args) {

        /*

        Inner classes and Nested Static Class in Java

        Inner classes
        A non-static nested class is a class within another class. It has access to members of the enclosing class(outer class).
        It is commonly known as inner class.
        We can also make class as private, so other classes (other than outer class) are not able to use it public methods or variable

        Since the inner class exists within the outer class, you must instantiate the outer class first, to instantiate the inner class.

        Advantages of Inner class

        1.Better real life depiction
        2.Inner class can only be used by outer class so it provides security in real life scenrio
        3.Easy access, as inner class is implicitly available inside an outer object



        Nested Class: -

        Unlike inner class, a static nested class cannot access the members variable of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class.

        Using the nested class makes your code more readable and provides better encapsulation.

        Non-Static Nested Class: - known as inner class majorly because instance is inside instance
        1.Member inner class: - This means we have a class inside a class
        2.Local inner class: - The scope is local




        3.Anonymous inner class: -   Example on Ninth.java

         */


//      Number num = new Number();  We cannot directly create object of this class because it is non-static, and we can only create objects of those classes which are static

        Eigth shop = new Eigth();

        shop.shopstatus();

        shop.getLock();

        shop.getLock().setLocking(false);  // it is not usable when Lock class is private



        Number num = new Eigth(). new Number();
        // Another method
        Eigth obj = new Eigth();
        Number num1 = obj.new Number();

        num.price = 12;
        num1.price = 18;


        toy Toy = new Eigth.toy();



        /*
        Anonymous Classes

        In Java, a class can contain another class known as nested class. It is possible to create a nested class without giving any name.
        A nested class that doesn't have any name is known as anonymous class.


       Anonymous classes usually extend subclasses or implement interfaces.

       1.a superclass that can anonymous class extends
       2.an interface that an anonymous class implements

         */


        new outerclass().outermethod();  // In this anonymous class concept is used
        // This is used only once so when we do not want to create memory for the object, then we can use this concept


        /*

        class Innerclass extends outerclass{    In this way we can create a subclass of a class

        }
        */

        outerclass innerclass = new outerclass(){   // This is also used to create a subclass of existing class but it can only be used once and here.

            void print(){
                System.out.println("Print");
            }

        };

        superinterface subinterface = new superinterface() {

            void display(){
                System.out.println("Hello");
            }

        };

        /*
        Functional Interfaces

        An interface that contains exactly one abstract method is known as functional interface.

        Functional Interface introduces in Java 8 and allows us to use a lambda expression to initiate the interface's method and
         avoid using lengthy codes for the anonymous class implementations.



         */

//
//        superinterface1 sub = () -> {
//            System.out.println("Check this");
//
//        };

        //  interface_name subinterface_name = (parameters) -> return value;
//        C:\Users\prach\OneDrive\Pictures\Screenshots\Screenshot 2024-11-01 220430.png
    }
}


class outerclass{

    public void outermethod(){

        System.out.println("Outermethod");
    }
}

interface superinterface{

    public static void display(){
        System.out.println("Display");
    }
}


interface superinterface1{

    public static void display1(){
//        System.out.println("Display");
    }

}


