import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {

        for(String arg : args){
            System.out.print(arg + " ");
        }
        System.out.println();

        // This string[] args is used to store some information we can give it values by edit configuration and adding the words(strings) which we want to print


        // We cannot give functions or methods in this main function
        greet();  // We can directly call those functions which are static in this

        int average = average(15,5);

        System.out.println(average);


        /* Math Class Methods
        1.Math.min(x ,y)
        2.Math.max(x ,y);
        3.Math.sqrt(x);   in double
        3.Math.cbrt(x);   in double  (cube root)
        4.Math.pow(x ,y);
        5.Math.abs(x);
        6.Math.random();  this is used to get random number between [0 , 1) , and we want from a range the multiply it by another number or add some number
        7.Math.floor(x);  this return the just prev integer before the provided value but in double data type
        8.Math.ceil(x);   this return the just greater integer after the provided value in double value
        9.Math.round(x);  this round off the number and return in integer form



        Rounding Functions
Function	Description	Example	Output
Math.ceil(x)	Rounds up to the nearest integer	Math.ceil(4.3)  	5.0
Math.floor(x)	Rounds down to the nearest integer	Math.floor(4.9) 	4.0
Math.round(x)	Rounds to the nearest integer	    Math.round(4.5)  	5
Math.round(x)	Rounds to the nearest integer	    Math.round(4.4)	    4


Math.sin(x)	Returns the sine of x (in radians)	Math.sin(Math.PI / 2)	1.0
Math.cos(x)	Returns the cosine of x (in radians)	Math.cos(0)	1.0
Math.tan(x)	Returns the tangent of x (in radians)	Math.tan(Math.PI / 4)	1.0
Math.toRadians(deg)	Converts degrees to radians	Math.toRadians(90)	1.5708...
Math.toDegrees(rad)	Converts radians to degrees	Math.toDegrees(Math.PI)	180.0

        */


        //String

        //In Java , String is basically an object that represents a sequence of char values. An array of characters works same as Java String.
        //Strings objects are immutable means they cannot be modified and changable.
        //Once a string object is created its data or state cannot be changed.
        char ch[] = {'M' , 'O' , 'N' , 'U' , '\0'};

        //Another Method
        Scanner sc = new Scanner(System.in);
        String name = new String("Monu");


        //we can take input by using sc.nextLine();   It consider all the letter even spaces
        //This can also be used to take input of string -> sc.next();   This only take input and only the value before first space


        String name1 = "Monu";     //In this case it is stored in Heap memory where a area is declared in string constant pool area
        String name2 = "Monu";     //In this and the prev case a string of "Monu" is created only one time other values the pointed to the first created string presented in heap memory(string constant pool area)

        String name3 = new String("Monu"); // In this case a new location  is created for the same "Monu" String     "" -> string literal


        // When we update the string then its prev value does not replace by current value instead it point to a new memory location which contain the current string
        //After that garbage collector checks that no data types is pointing it so it release the memory


        //Comparing two strings

        if(name1 == name2){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }

        // Imp case
        if(name ==  name1){
            System.out.println("Both are same");
        }
        else{    // when we are using "==" , in this case it check the reference in derived or user defined data types not the actual the value.  In this both have different location so else condition executes
            System.out.println("Both are not same");
        }

        //To compare the value of two values which are present at same or different locations we have to use equals method

        if(name.equals(name1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        name1 = "MONU";

        if(name.equalsIgnoreCase(name1)){  // This ignores whether the element is CAPITAL or lower case
            System.out.println("Same in ignore case");
        }
        else{
            System.out.println("Not Same in ignore case");
        }

        // Java Strings Methods       These methods provide new string they do not change the actual string
//        1.  .toUpperCase();
//        2.  .toLowerCase();
//        3.  .trim();   This is used to remove space from the start and end
//        4.  .startsWith()  This is check whether the string start with a another provided string and return true or false
//        5.  .endsWith()    This is used to check the string end with a another string and returns true or false
//        6.  .equals()
//        7.  .charAt(index)  It tells which character is present at that index
//        8.  .valueOf()  This convert an integer value into string
//        9.  .replace("target" , "replacement")  This is used to replace a string to another
//        10. .contains()  This checks that the string contains a provided string  and return true or false. This is case-sensitive
//        11. .substring(startingidnex(inclusive)  , endingindex(exclusive));   if we do not give the ending index then it will print the entire string after the beginning index
//        12. .split()  This is used to split the string into various strings for a particular character like when we give space in it. It provides an array of strings which is a part of original string seperated by space
//        13. .toCharArray()  This is used to split string into an array of character, and it returns a array of character
//        14. .isempty() This checks whether the string is empty or not. It returns true or false
//        15. .isblank() This works same as isEmpty() but it return true when the string is empty or contain only spaces
//        16. .compareTo() This  compares the String lexicographically
//        17/ .compareToIgnoreCase() This compares the String lexicographically

        // We can also use these functions of String literal    "Hello".startsWith("H");

    }

    //Functions OR Methods

    static public void greet(){
        /* This is function specifier it is not compulsory it has a default value*/
        System.out.println("Greet");
    }
    static public int average(int a, int b){
        return (a+b)/2;
    }
     public static int getrandom(int a , int b){
        //return Math.random()*6;
         return (int)(Math.random()*(b-a+1)+a);  // this is used to give value between two numbers
    }

    /*
    How It Works
Math.random() generates a random double in the range [0.0, 1.0).

Multiplying by (b - a + 1) scales it to [0, (b - a + 1)), giving a range of possible values from 0 to (b - a).

Adding a shifts the range to [a, b + 1).

Casting to (int) removes the decimal, resulting in an integer in [a, b].


     */





}
