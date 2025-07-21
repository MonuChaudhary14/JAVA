package Practice;
import java.util.Scanner;
import java.lang.Math;

public class Math_Methods {

    public static void main(String[] args) {


        //Checking all Math Methods

        Scanner sc = new Scanner(System.in);

        int a = 5 * (sc.nextInt());
//        int a = getInput() + sc.nextInt()   We can also give functions in this
//        int a = sc.nextInt() > 10 ? 100 : 200;  We can also use this in conditional branching
        int b = sc.nextInt();   // We cannot give any parameter in the bracket in nextInt()

        String result = Math.max(a,b) == a ? "A is greater ": "B is greater ";  // We have to store this value into String

        int absValue = Math.abs(-10); // absValue = 10
        int maxValue = Math.max(5, 10); // maxValue = 10
        int minValue = Math.min(5, 10); // minValue = 5
        int sum = Math.addExact(5, 10); // sum = 15    Return the sum of values given to it
        int difference = Math.subtractExact(10, 5); // difference = 5   Returns the difference of x and y.
        int product = Math.multiplyExact(5, 10); // product = 50
        int increment = Math.incrementExact(10); // increment = 11
        int decrement = Math.decrementExact(10); // decrement = 9
        int negation = Math.negateExact(10); // negation = -10   Return the negative of x



        // Exponential and Logarithm functions

        double expValue = Math.exp(1); // expValue ≈ 2.718   Return Eulers number e raised to the power of x
        double logValue = Math.log(10); // logValue ≈ 2.302   Returns the natural logarithm of x
        double log10Value = Math.log10(10); // log10Value = 1  Return the base 10 logarithm of x
        double powerValue = Math.pow(2, 3); // powerValue = 8
        double sqrtValue = Math.sqrt(16); // sqrtValue = 4


        // Trigonometric functions

        double sinValue = Math.sin(Math.PI / 2); // sinValue = 1  Return the Sine of x in radians
        double cosValue = Math.cos(0); // cosValue = 1
        double tanValue = Math.tan(Math.PI / 4); // tanValue = 1
        double asinValue = Math.asin(1); // asinValue = π/2  Returns the arc sine of x
        double acosValue = Math.acos(1); // acosValue = 0
        double atanValue = Math.atan(1); // atanValue = π/4


        // Rounding Methods

        long roundValue = Math.round(2.5); // roundValue = 3  Returns the closest long or int to the argument
        double ceilValue = Math.ceil(2.3); // ceilValue = 3.0  Returns the smallest double value that is greater than or equal to the argument and is equal to a mathematical integer.
        double floorValue = Math.floor(2.9); // floorValue = 2.0 Returns the largest double value that is less than or equal to the argument and is equal to a mathematical integer


        // Random Number Generation

        double randomValue = Math.random(); // randomValue is between 0.0 and 1.0      Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        // to get more range multiply or divide the number



        // Other useful Methods

        double copySignValue = Math.copySign(5.5, -2.2); // copySignValue = -5.5   Returns the first floating-point argument with the sign of the second floating-point argument.
        double hypotenuse = Math.hypot(3, 4); // hypotenuse = 5  Returns the square root of the sum of the squares of x and y
        double remainder = Math.IEEEremainder(10, 3); // remainder = 1.0   Computes the remainder operation on two arguments as prescribed by the IEEE 754 standard
        double nextAfterValue = Math.nextAfter(1.0, 2.0); // nextAfterValue = 1.0000000000000002   Returns the floating-point number adjacent to x in the direction of y
        double nextUpValue = Math.nextUp(1.0); // nextUpValue = 1.0000000000000002   Returns the floating-point value adjacent to x in the direction of positive infinity
        double scalbValue = Math.scalb(1.5, 3); // scalbValue = 12.0  Returns x multiplied by 2 raised to the power of scaleFactor



















    }

}
