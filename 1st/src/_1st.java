public class _1st {

    public static void main(String[] args) {

        System.out.println(9/2);   // This shows an integer value because 9 nad 2 both are integer

        System.out.println(9/2f);  // This show float value because in between 9 and 2 one value is float

        boolean b = true; // We cannot use 1 and 0 in boolean
        char ch = '&'; // Here & is called as uni code character

        char c = '\u00A7';  // There are some many uni code characters which we can use to get special characters which are not even in keyboard

        System.out.println(ch);
        System.out.println(b);
        System.out.println(c);


        // String

        String first = "Monu ";
        String second = "Chaudhary";

        System.out.println(first+second);   // Here + is overloaded operator it works as both arithmetic operator and also to add strings

        int a = 45;

        System.out.println(first+a);  // In this int is implicitly cast into string


        String d = "10";

        System.out.println(Integer.parseInt(d));

        System.out.println(Integer.parseInt(d)+50);

//        System.out.println(Integer.parseInt(first));   This shows error


        // Type Casting

        short a1 = 10;

//        byte a2 = a1;    Range of byte is not enough to store short but

        int a2 = a1;    // Range of int is much greater than short


        // Implicit Casting

//        byte --> short --> int --> long --> float --> double


//        Explicit type casting

//        can convert any data type into another


        float e = (float)a1;

        System.out.println(e);

        String s1 = "45";

//        int a4 = s1;    compatibility does not match

        // we can parse it to get integer value
//         parsing is totally different from type casting .
//        in parsing, it reads the string and tries to get the value

        int a5 = 5000;
        byte r = (byte)a5;  // There can be ambiguity int this case of narrowing

        System.out.println(r);
        System.out.println((float)a5);

        int g = 50;
        float m = 5.12f;

        int value = (int)(g*g + 2*(g*m) + m*m);



        // Naming Conventions


//        Package -> always in lower case

//        class ->  starting word can be capital or lower

//        interfaces -> should be capital

//        for other google it

        int y = 45;
        String result = y == 45? "This is possible " : "This is not possible";
        String result1 = (y == 45)? "This is also possible " : "This is not possible";
        System.out.println(result);
        System.out.println(result1);



    }



}
