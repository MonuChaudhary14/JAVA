package CurrencyConvertor;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EUR extends CurrencyConvertor{

    Scanner sc = new Scanner(System.in);

    public void assign(){

        System.out.println("Enter the name of second currency");
        String second = sc.next();

        System.out.println("Enter the amount in EUR");

        double num = sc.nextDouble();

        convert(second, num);

        sc.close();
    }

    public void convert(String second, Double num){

        if(second.equals("INR")){
            System.out.println(Math.round(num * 88.96) + " ₹");
        }
        else if(second.equals("USD")){
            System.out.println(Math.round(num * 1.06) + " $");
        }
        else if(second.equals("JPY")){
            System.out.println(Math.round(num * 158.71) + " ¥");
        }
        else{
            System.out.println("Please choose appropriate value");
            convert(second, num);
        }
    }
}
