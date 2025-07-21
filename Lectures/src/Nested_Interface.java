public class Nested_Interface {

    public interface A {    // It can be declared as public priavte and protected
        boolean isOdd(int num);
    }

    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj.isOdd(5));


    }


}

class B implements Nested_Interface.A {


    @Override
    public boolean isOdd(int num) {
        return (num &1) == 1;
    }
}
