import java.util.Scanner;
public class first {
    public static void main(String[] args){

        System.out.print("Namaste Duniya  "); // next output will be print on same line
        System.out.println("Namaste Duniya");  // in this case a new line is created because of use println

        // Variable and rules
        int a = 45;
        int _isallowed = 12;  //we can use underscore at any position
        int $isallowed; /* $ is allowed at any position*/

        //int 12n;  This is not allowed because the variable name should not start with number

        int secondMarksOfStudent = 12;  // camel case

        //we cannot use keyword as variable name

        //Data types
        /* Data types is the type of data a variable can store

            Primitive data types:-
            int - stores whole number
            long - Stores whole number of larger value
            char - stores character
            float - stores decimal value upto 6 to 7 decimals and to also store exponential value
            double - stores fractional value upto 15 decimal places
            boolean - stores true or false
            byte - stores whole number from -128 to 127
            short - stores whole number but has smaller capacity

         */
        boolean is_true = false;
        byte marks = 45;
        float num = 4.12f; /*we have to use f because by default it considers this like as double*/
        double number = 12.4548448948;
        float num1 = 45.465464646456454f; // In this it rounds off this number to meet the range of float
        char ch = 'A';

        System.out.println(marks);

        //Data type implicit conversion
        int count = 15;
        long longcount = count;

        //But we cannot convert higher size capacity data type into lower size data types we can only do this by explicit conversion

        long q = 45;
//      int w = q;  This is wrong because there is chances of loss of data
        int w = (int)q;

//    Operator

        /*1->Assignment Operators

         */
        int g = 45;
        int h = 12;

        double d = g/h;      // In this first, the result is evaluated then it is converted in double so the result is 3.0
        double j = (double)g/h;   // In  this , the g is converted into double then it is evaluated so the result is 3.75
        System.out.println(d); //In this case, the compiler performs the operator function first and, so the result is integer and then convert it into double
        System.out.println(j); //In this case, the compiler first converts g into double and then performs the operator task, so the result is also double and, we get proper decimal values

        //To use scanner (used to take input from the user), we have to import java.util.Scanner

        Scanner k = new Scanner(System.in);

        Scanner sc = new Scanner("Namaste Duniya");


        System.out.println("Enter your age");

        int age = k.nextInt();
        String name = k.nextLine();  // This will take string value, but it also takes enter and other keys also
        String surname = k.next();   // This will also take string but this will not take enter and other keys like backspace in input command
//        float age1 = k.nextFloat();
//        long age2 = k.nextLong();

//        nextBigInteger(): Reads the next token as a BigInteger.
//        nextBigDecimal(): Reads the next token as a BigDecimal.

        if(k.hasNext()){
            System.out.println("Returns true if there is another token");
        }

        /*
        hasNextInt(): Checks if the next token can be parsed as an int.

hasNextLong(): Checks if the next token can be parsed as a long.

hasNextDouble(): Checks if the next token can be parsed as a double.

hasNextFloat(): Checks if the next token can be parsed as a float.

hasNextByte(): Checks if the next token can be parsed as a byte.

hasNextShort(): Checks if the next token can be parsed as a short.

hasNextBoolean(): Checks if the next token can be parsed as a boolean.

hasNextBigInteger(): Checks if the next token can be parsed as a BigInteger.

hasNextBigDecimal(): Checks if the next token can be parsed as a BigDecimal.
         */

        k.close(); //It is used to release memory


        System.out.println("Your age is "+age);

        int m = 12;
        int n = 78;
        int max1 = 0;

//         m > n ? max1 = m : max1 = n; This is wrong because we cannot use it directly , we have to give it to sout function or assign it value to a variable. We can also call the functions in this operator

        String ans = m > n ? "This can be used but sout cannnot be used in this(reason below)": "This cannot be used in this ";

        max1 = m > n ? m : n;
        // nesting is also allowed in ternary operator
        int number1 = 45;
        int number2 = 89;
        int number3 = 13;
        int max2 = 0;

        max2 = number1 > number2 ? number1 > number3 ? number1 : number3 : number2 > number3 ? number2 : number3;
        //we cannot use sout in ternary operator because it always requires a return type but sout return void

        System.out.println(max1);
        System.out.println(max2);



}
}

/*

findInLine(String pattern)
This method searches for a pattern (regular expression) in the current line of the input. It returns the matched string if found; otherwise, it returns null.

Scanner scanner = new Scanner("Hello 123 World 456");

        // Find the first occurrence of a number in the line
        String match = scanner.findInLine("\\d+");

         Explanation: The regex \\d+ looks for a number within the first 8 characters (Java 123). Since 123 is within that range, it's returned.


2. findWithinHorizon(String pattern, int horizon)
This method searches for a pattern within the given horizon (character limit). If a match is found, it returns the matched string; otherwise, it returns null.

Scanner scanner = new Scanner("Java 123 Programming 456");

        // Searching for a number within the first 8 characters
        String match = scanner.findWithinHorizon("\\d+", 8);

🔹 Explanation: The regex \\d+ looks for a number within the first 8 characters (Java 123). Since 123 is within that range, it's returned.

3. nextBigInteger()
This method reads the next token as a BigInteger. It is useful for handling large integers that exceed long's limit.

Scanner scanner = new Scanner("987654321012345678901234567890");

        BigInteger bigInt = scanner.nextBigInteger();

🔹 Explanation: The number is too large for primitive types like long, so we use BigInteger to handle it.

4. nextBigDecimal()
This method reads the next token as a BigDecimal. It is useful for handling very large or precise decimal numbers.

Scanner scanner = new Scanner("12345.678901234567890123456789");

        BigDecimal bigDec = scanner.nextBigDecimal();

        🔹 Explanation: BigDecimal is used for high-precision arithmetic, which is useful for financial applications.


5. skip(String pattern)
This method skips over input that matches the given regular expression.

 Scanner scanner = new Scanner("ABC 123 XYZ");

        // Skip the first word (ABC)
        scanner.skip("\\w+");

        // Skip the space
        scanner.skip("\\s+");

        // Read the next integer
        int number = scanner.nextInt();


6.ioException()
This method returns the last IOException encountered by the scanner, or null if no exception has occurred. It's useful for checking whether an I/O error happened during scanning.

Example

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("non_existent_file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        if (scanner != null && scanner.ioException() != null) {
            System.out.println("I/O Exception occurred: " + scanner.ioException());
        }

        if (scanner != null) {
            scanner.close();
        }
    }
}

🔹 Explanation:

If the file does not exist, a FileNotFoundException occurs.

ioException() can be checked to detect any I/O errors.




 */
