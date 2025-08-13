import java.util.Scanner;
public class first {
    public static void main(String[] args){

        System.out.print("Namaste Duniya  "); // next output will be print on same line
        System.out.println("Namaste Duniya");  // in this case a new line is created because of use println

        // Variable and rules
        int a = 45;
        int _isallowed = 12;  //we can use underscore
        int $isallowed; /* $ is allowed at any position*/

        //int 12n;  This is not allowed

        int secondMarksOfStudent = 12;  // camel case

        //we cannot use keyword as variable name

        //Data types
        /* Data types the type of data a variable can store

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
//      int w = q;  This is wrong
        int w = (int)q;

//    Operator

        /*1->Assignment Operators

         */
        int g = 45;
        int h = 12;

        double d = g/h;
        double j = (double)g/h;
        System.out.println(d); //In this case, the compiler performs the operator function first and, so the result is integer and then convert it into double
        System.out.println(j); //In this case, the compiler first converts g into double and then performs the operator task, so the result is also double and, we get proper decimal values

        //To use scanner (used to take input from the user), we have to import java.util.Scanner

        Scanner k = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = k.nextInt();
        String name = k.nextLine();  // This will take string value, but it also takes enter and other keys also
        String surname = k.next();   // This will also take string but this will not take enter and other keys like backspace in input command
//        float age1 = k.nextFloat();
//        long age2 = k.nextLong();
        k.close(); //It is used to release memory

//        Scanner sc = new Scanner("Hello 123 true");
//        String word = sc.next();  // "Hello"
//        int num = sc.nextInt();   // 123
//        boolean b = sc.nextBoolean(); // true


//        Scanner sc = new Scanner(new File("input.txt"));



        System.out.println("Your age is "+age);

        int m = 12;
        int n = 78;
        int max1 = 0;

//         m > n ? max1 = m : max1 = n; This is wrong because we cannot use it directly , we have to give it to sout function or assign it value to a variable. We can also call the functions in this operator

//        String ans = m > n ? "This can be used but sout cannot be used in this(reason below)": "This cannot be used in this ";

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
