package final_keyword;

public class final_method {

    // If a method is declared final it cannot be overridden by subclass

    public static void main(String[] args) {

    Parent parent = new Parent();
    parent.show();


    }

}

class Parent {
    final void show(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

//    void show(){     Until the method is final in parent class then we cannot use this
//        System.out.println("This is child class");
//    }

}
