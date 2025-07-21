import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator ");

        calculator();

}

public static void calculator(){
    //        System.out.println("Enter the first value ");
    double d;

    Scanner sc = new Scanner(System.in);

    d = sc.nextDouble();

    String ch = sc.next();


    switch (ch){

        case "+":
//                System.out.println("Enter Second Number");
            double a1 = sc.nextDouble();

            System.out.println(a1+d);
            break;

        case "-":
//                System.out.println("Enter Second Number");
            double a2 = sc.nextDouble();

            System.out.println(d-a2);
            break;

        case "/":
//                System.out.println("Enter Second Number");
            double a3 = sc.nextDouble();

            System.out.println(d/a3);
            break;

        case "*":
//                System.out.println("Enter Second Number");
            double a4 = sc.nextDouble();

            System.out.println(a4*d);
            break;

        case "%":
//                System.out.println("Enter Second Number");
            double a5 = sc.nextDouble();

            System.out.println(d % a5);
            break;

        default:
            System.out.println("Incorrect Operator! Please Select from +  , -  , *  , / ");
            calculator();

    }
    sc.close();

        return ;
}
    }



