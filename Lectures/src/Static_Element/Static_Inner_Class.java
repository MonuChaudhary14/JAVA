package Static_Element;

public class Static_Inner_Class {

    public static void main(String[] args) {
        // When we want to access the element of non-static class then try to make a getter which return the object of the class and then try to access the elements of the class
        Outer outer = new Outer();

        outer.message();
        Outer.message();   // We can also access it like this but only static members

        Outer2.Inner.message();    // We can directly assess Inner and message because they both are static means no need to create an object to access the members
        System.out.println(Outer2.Inner.val);
        Outer2 nonstatic = new Outer2();
        Outer2.Inner2 innerInstance = nonstatic.new Inner2();  // Creating instance of non-static inner class
        System.out.println(innerInstance.val);


    }

}

class Outer{

    public static void message(){    // We can mark it as a static
        System.out.println("This is outer class");
    }

}

class Outer2{

    static class Inner{    // Static inner class should be used when all the elements inside the static inner class is static

        public static int val = 50;   // If we make them private, then it is still usable by non-static class
        public static void message(){
            System.out.println("This is inner class");
        }

    }

    class Inner2{

//        Inner2 inner = new Inner2();   // If we use this line , there is an infinite recursion when we want to return inner in line no. 48

        public  int val = 90;

        public void display(){
            System.out.println("This is from nonstatic class");
            System.out.println("This is the value of private element from static class x = "+Inner.val);
        }

        public Inner2 getter(){
            return this;
        }
    }

}
