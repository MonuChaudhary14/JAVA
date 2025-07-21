package String;

import java.util.Arrays;

public class String_Methods {

    public static void main(String[] args) {

        // Practice Methods Related to String

        String name = "Monu";   // In this String --> Data type     name --> Reference Variable     Monu --> Object
        String same = "Monu";

        if (same == name) {
            System.out.println("Both are same");
        } else {
            System.out.println(" == fails");
        }
            name = "Monu Chauhdary";   // IN this name point to a new memory location which contain this value
            // The prev location which contain Monu still remain in the String pool
//        When there is no refernce to this location the garbage collector removes the value

            String naam = new String("Monu");

            if (naam == name) {
                System.out.println("Both are same");
            } else {
                System.out.println(" == fails");
            }

            if (naam.equals(same)) {
                System.out.println("They both are same");
            } else {
                System.out.println("They are not same");
            }


            // We cannot do naam[0]  to do this we have to use  charAt because we imagine it like an object type

            char ch = naam.charAt(2);
            System.out.println(ch);


        System.out.println();  // IN this PrintStream is a class
//       and out is the variable of PrintStream and PrintStream has a method called as println

        System.out.println(50);   // Every object calls the toString method
        // Here println is calling a method (valueOf) which is calling the toString method

        String n = null;
        System.out.println(n);  // It will give null
//      in this println call the valueOf method which will give null because of its return type

        /*
        public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
         */

        System.out.println(Arrays.toString(new int[]{2,3,4}));   // This is also possible
        System.out.println(new int[]{2,3,4});   // This will print from the toString method of Object


        Integer num = 54;
        System.out.println(num.toString());

        float v = 45.123156f;
        System.out.printf("Formatted number %.2f \n, v");
        // This also round off the value

    }

}
