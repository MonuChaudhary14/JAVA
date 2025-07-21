package Lamda_Expression;

public class Lambda {

    public static void main(String[] args) {

    lambda l = ()-> System.out.println("Hello");

    l.fun();

    lambda l3 =( ()-> System.out.println("Hello") );

    l3.fun();  // We have to use this method to return the value

    lambda l1 = ()-> {
        System.out.println("Hi");
        System.out.println("Bye");
    };

    l1.fun();

    lambda l2 =( ()-> {
        System.out.println("Ram Ram");
        System.out.println("Jai Shree Ram");
    } );

    l2.fun();
    }
    int num = 45;   // We can access the local variables
    lambda2 lam = (int x) -> 10;
    lambda2 lam1 = (/*No need to write return type*/x) -> {
        System.out.println("This is Lambda2 " + num);
        return (int)10.25f;};

}

interface lambda{     // It must be a functional interface means there should only be one abstract method

    void fun();
//     public void write();
}

interface lambda2{
    public int val(int x);
}
