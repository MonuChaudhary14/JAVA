package CurrencyConvertor;

import java.util.Scanner;

public class Rupees extends CurrencyConvertor{

    Scanner sc = new Scanner(System.in);

    public void assign(){

        System.out.println("Enter the name of second currency");
        String second = sc.next();

        System.out.println("Enter the amount");

        double num = sc.nextDouble();

        convert(second , num);

        sc.close();
    }

    public void convert(String second, Double num){

        if(second.equals("USD")){
            System.out.println(Math.round(num * 0.012) + " $");
        }
        else if(second.equals("JPY")){
            System.out.println(Math.round(num * 1.48) + " ¥");
        }
        else if(second.equals("EUR")){
            System.out.println(Math.round(num * 0.011) + " €");
        }
        else{
            System.out.println("Please choose appropriate value");
            convert(second , num);
        }
    }
}
