public class _2nd {

    public static void main(String[] args) {

        //Switch --> We can use string, int, char, byte, short, enum, Integer, Char, Short, character

        String fruit = "apple";
        switch (fruit) {
            case "apple":
            case "Apple":
                System.out.println("Fruit is apple");
                break;
            case "banana":
                System.out.println("Fruit is banana");
                break;
            case "cherry":
                System.out.println("Fruit is cherry");
                break;
            default:
                System.out.println("Unknown fruit");
                break;  // Break is not compulsory for last value
        }


        switch (fruit) {
            case "apple" -> System.out.println("Fruit is apple");  // In this there is not need to use break, this is derived from lambda expression
            case "banana" -> System.out.println("Fruit is banana");
            case "cherry" -> System.out.println("Fruit is cherry");
            default -> System.out.println("Unknown fruit");
        }

        char c = 'C';  // Does not work on String

        System.out.println(Character.toLowerCase(c));

        // For String, we can use name.tolowercase()

        String name = "MOnu";

        System.out.println(name.toLowerCase());


        // To make an infinite loop

//        for(;;){
//
//            System.out.println("....");
//
//        }

        int i = 0;

        for(; i < 10; i++){

            System.out.println(i);

        }

        for(;; i++){

            if(i > 10){
                break;
            }
            System.out.println(i);

        }
        for(;;){

            if(i > 10){
                break;
            }
            i++;
            System.out.println(i);

        }

        int j = 12;

        for(j = 1; j <= 10; j++){   // This will update the value of this variable

            System.out.println(j);

        }

        System.out.println(j);


        /* Literals -->
        Types of Literals:
        Integer Literals:

        These are used to represent whole numbers.

                Examples: 42, -5, 0

        Can be specified in different bases:

        Decimal: 123

        Octal: 0173

        Hexadecimal: 0x7B

        Binary: 0b01111011

        Floating-Point Literals:

        These are used to represent decimal numbers.

                Examples: 3.14, -0.001, 2.0

        Can be expressed in exponential notation: 1.23e2 (which is 1.23 x 10^2)

        Character Literals:

        Represent a single character enclosed in single quotes.

        Examples: 'A', '9', '\n' (newline), '\u0041' (Unicode escape for 'A')

        String Literals:

        Sequence of characters enclosed in double quotes.

        Examples: "Hello, World!", "Java123", "Good\nMorning"

        Boolean Literals:

        Representing true or false values.

                Examples: true, false

        Null Literal:

        Represents the null reference.

                Example: null*/

        int num1 = 100;   // This is decimal representation
        int num2 = 0100;  // This is octal representation
        int num3 = 0x64;  // This is hexadecimal representation
        int num4 = 0b0100;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);




















    }





}
