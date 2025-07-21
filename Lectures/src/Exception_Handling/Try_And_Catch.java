package Exception_Handling;


/*
The try catch block is used to handle exceptions and prevents the abnormal termination of the program
 */

import javax.management.RuntimeMBeanException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try_And_Catch {

    public static void main(String[] args) {

    /*
    It is used for exception handling to handle runtime errors gracefully and prevent program crashes
     */

    case1(1,0);
    case2(3,0);

    }

    public static void case1(int x, int y){

        if(y != 0){
            System.out.println(x/y);
       }
        else{
            System.out.println("It is not possible");
        }

    }

    public static void case2(int x, int y){
        try{
            System.out.println("Before Exception");

        System.out.println("This is partial Exception" + (x=x*100)/y);   // This line will not be shown if there is an Exception.
         // The string is the part of the Exception so it is not executed if exception occurs
        System.out.println("After Exception");
        }
        catch(ArithmeticException | NullPointerException e){   // We can have any number of catch block but each block must be unique
            System.out.println("It is not possible");
            e.printStackTrace();   // It also specifies the exact line in which the exception occur
            System.out.println();
            System.out.println(e);  // This is the toString method of Exception e
        }
        catch(Exception e){     // 'Exception' is the parent of all exception. ArithmeticException is a part of Exception
            System.out.println("It is not possible");   // We cannot use This block before ArithmeticException. We cannot have parent class before child class
        }
        finally {    // The finally block executes whether there is exception or not
            System.out.println("Finally the value of y is "+y);   // This must be at the last
            System.out.println("The value of x is update because the sub-statement before the exception executed so now the new value of x is "+x);
        }
        /*
        There are some cases when a finally block does not execute:
        Use of System.exit() method
        An exception occurs in the finally block
        The death of a thread
         */
    }

}
/*
An exception is an unexpected event that occurs during program execution.
It affects the flow of the program instructions which can cause the program to terminate abnormally.


Java Runtime Exception->
A runtime exception happens due to a programming error. They are also known as unchecked exceptions
Ex-> Null pointer access(Missing the initialization of a variable)- Null Pointer Exception
Out of bounds array access - ArrayIndexOutOfBoundsException
Arithmetic Exception

Java IOException->
It is also known as Checked Exception.
They are checked by the compiler at the compile time and the programmer is prompted to handle these exceptions.

FileNotFoundException




 */

