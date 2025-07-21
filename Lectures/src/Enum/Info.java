package Enum;

public class Info {

    public static void main(String[] args) {

        Enum1 enumm = Enum1.MONDAY;

        System.out.println("Today is " + enumm);
        System.out.println(enumm.WEDNESDAY);
        System.out.println(Enum1.MONDAY);
        
        Enum2 enum2 = Enum2.MONDAY;
        System.out.println("Today is " + enum2);
        System.out.println(enum2.MONDAY.getValue());
        System.out.println(Enum1.valueOf("THURSDAY"));

        System.out.println();

        Month month = Month.APR;

        System.out.println(month);  // This will print APR
        for(Month m: month.values()) {
            System.out.println(m);
        }


        System.out.println(month.ordinal());  // This will print the position(index) of the constant



    }

}

enum Month implements val{   // They all extends java.lang.enum   class  and multiple inheritance is not allowed in java so enum cannot extend more classes
    JAN, FEB, MAR,APR, MAY, JUN, JUL, AUG, SEP, OCT,NOV, DEC;
    //These are enum constants
    // BY default they are public static final so we cannot create child enums
    // The type of all constants here are month


    // We can implement the interface

    Month(){   // It is not public or  protected ,     It is private and protected because when the constructor is public or protected it allow initilisation of more than one object

        System.out.println("Constructor is called for "+this);

    }   // When we invoke constructor , it call for all values(Check and find why)

    @Override
    public void getValue() {
        System.out.println("The value of today is "+this );
    }

    // Internally:- public static final Week Monday =  new Week();

//    No abstract methods are allowed we have to declare its value


}

interface val{

    int value = 5;

    void getValue();

}