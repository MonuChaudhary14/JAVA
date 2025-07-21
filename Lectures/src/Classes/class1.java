package Classes;

public class class1 {   // By default it is private so it can be used inside the package

    //A static block runs only once when the class is loaded into memory, even before the main() method.
    // They are mainly used to initialize the static variables

    static{
        System.out.println("This block of code will execute before the main block and it is shown in the output");
    }

    public static void main(String[] args){

        class2.name = "Monu Chaudhary";
//        class2.id = 500;  this is protected  and also it is not static

        //Creating an object
        class2 info = new class2();
        info.naam = "Ketan Chaudhary";

        class2 info2 = new class2(50 , 50 , "Monu chaudhary" , "Ketan Chaudhary");

        int id = info2.getId();
        int salary = info2.display();


    }

}
