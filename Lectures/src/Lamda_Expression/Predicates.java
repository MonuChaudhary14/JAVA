package Lamda_Expression;

/*
n Java, a Predicate is a functional interface that represents a boolean-valued function (i.e., it takes an argument and returns true or false).
 It is commonly used in filtering, validation, and conditional checks.

The Predicate interface is part of the java.util.function package
 */

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
//import java.util.function.    // There are many predicates which can be use

public class Predicates {

    public static void main(String[] args) {

        IntPredicate predicate = new IntPredicate() {

            public boolean test (int value) {
                if(value < 18){
                    return true;
                }
                else{
                    return false;
                }
            }
        };

        System.out.println(predicate.test(12));

        DoublePredicate p = value -> {
            if(value > 18.0){
                return true;
            }
            else{
                return false;
            }
        };

        IntPredicate p1 = value -> value < 18;       // Here value is the input parameter which is compulsory to give
        IntPredicate p2 = value-> value < 20;
        Predicate<Integer> p3  = value -> value < 18;

        System.out.println(p1.test(12));

        System.out.println(p.and((DoublePredicate) p1).test(12));
        System.out.println(p1.and(p2).test(12));
        System.out.println(p1.or(p2).test(12));

//        IntPredicate p4 = (int number) -> 18 < 0;  This is also possible
        

        System.out.println(p1.negate().test(12));
    }
}
