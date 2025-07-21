package String;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a'+ 'b');  // It is converting it into its ASCII value

        System.out.println("a" + "b");

        System.out.println('a' + 3);

        System.out.println((char)('a' + 3));

        System.out.println("a" + 4);  // int is converted into its Wrapper class(Integer) which call its toString Method
        System.out.println("a" + "1");  // Same as above

        System.out.println("Monu " + new ArrayList<>());
        // Here ArrayString is calling is toString method

        System.out.println("Monu" + new Integer(45));

        // + operator in java is only defined for primitive value and when atleast when value is String
        // In java + operator only overloaded operator and we cannot perform operator overloading


//        System.out.println(new Integer(45) + new ArrayList<>());  // This will not work
        System.out.println(new Integer(78) + " "+ new ArrayList<>());  // This will work because it contains a string value due to which other values are also converted






    }

}
