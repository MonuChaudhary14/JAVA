package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
In Java, the throws keyword is used in method declarations to indicate that a method can throw one or more exceptions.
It tells the caller of the method that it must handle these exceptions or declare them using throws as well
 */

public class Throws {

    public static void main(String[] args){

        Throws t = new Throws();

        try{
            t.dosomething();
            String name = "Monu";
            if(name.equals("Monu")){
                throw new Custom_Exception("This is a custom exception");
            }
        }
        catch(FileNotFoundException | Custom_Exception e){  // Here e is the object of FileNotFoundException
            e.printStackTrace();    // These exceptions must be same as that given in the method
        }
        finally {
            System.out.println("This block will executed always");
        }


    }

public void dosomething() throws FileNotFoundException , Custom_Exception{

    FileReader in = new FileReader("Exception_Handling.txt");
    System.out.println("Do something");

}

}

