package Array;

public class Arrays {

    public static void main(String[] args) {

        // Initialization of Array

        // 2 methods

        String[] names = {"Monu" , "Chaudhary" , "Poonia"};

        System.out.println(names);   // Base Address (Address of first elememt)

        String[] name;
        name = new String[10];   // As these values are not assigned so by default they contain 0
        name[0] = "Hello";
        name[1] = "Monu";
        name[2] = "Chaudhary";
        name[3] = "Poonia";


        // For each loop in java
        for(String s : name){
            System.out.println(s);
    }

        // Passing Array to Function
        Arrays a = new Arrays();    // Here the reference of the array is done. The address of array is passed to function
        // so if any change occur in value in function , then it will be displayed in the main function
        a.display(name);




        // Issues with Array
        // Once the size of the array is declared , it cannot be changed

}

void display(String[] name){

        for(String s : name){
            System.out.println(s);
        }

}




}
