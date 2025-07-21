package Exception_Handling;

public class Throw {

    /*
    It is used to explicitly throw an exception during the execution of a program.
    It is typically used in a method or block of code when an error condition is encountered ,and you want to terminate normal execution by throwing an exception

     */

    public static void main(String[] args) {
//        String s = "Zero";
//
//        if(s.equals("Zero")){
//        throw new RuntimeException();
//        }
//        else if(s.equals("One")){
//            throw new ArithmeticException();
//        }

        Throw t = new Throw();

        t.dosomething();
    }

    class ZeroException extends RuntimeException {
        // We can add information in this
    }


    void dosomething() throws ArithmeticException, ZeroException{   // Here we can add the exceptions we are going to use in this method
        String s = "Zero";    // We can also use RuntimeException because it is a parent class of ZeroException

        if(s.equals("Zero")){
            throw new ZeroException();
        }
        else if(s.equals("One")){
            throw new ArithmeticException("We can add message here");
        }
    }

}
