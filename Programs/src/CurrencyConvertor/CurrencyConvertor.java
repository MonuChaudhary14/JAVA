package CurrencyConvertor;
import java.lang.Math;

import java.util.Currency;   // To use the Symbols
import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {

        System.out.println("Welcome to Currency Convertor");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of first currency");

        String first = sc.next();

        Currency(first);

        sc.close();
    }

    public static void Currency(String first){

        switch (first) {
            case "INR" -> {

                Rupees r = new Rupees();
                r.assign();
            }
            case "USD" -> {

                USD u = new USD();
                u.assign();
            }
            case "EUR" -> {

                EUR e = new EUR();
                e.assign();
            }
            case "JPY" -> {

                JPY j = new JPY();
                j.assign();
            }
            default -> {

                System.out.println("Please choose appropriate currency");
                Currency(first);
            }
        }
    }
}
