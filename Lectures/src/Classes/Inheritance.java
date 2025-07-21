package Classes;
import java.util.*;  // This is used to import all the files present in java.util package

public class Inheritance {

    public static void main(String[] args) {

        System.out.println("Enter the details of the child");

        Child child = new Child();
        Child child1 = new Child(2007, 12);

//        Scanner sc = new Scanner(System.in);
//
//        child1.name = sc.next();
//        child1.age = sc.nextInt();
//
//        child.display();

        System.out.println(child1);   // Without toString method we get the address value of the object

//        sc.close();
    }

}

class Parent{

    public int age;
    public String name;

    public String toString(){
        return name + " " + age;
    }

}

class Child extends Parent{

    int year;
    int month;
    int date;

    public Child(){
        year = 2006;
        month = 2;
        date = 14;
        name = "Monu Chaudhary";
        age = 19;
    }

    public Child(int year, int month){
        this.year = year;
        this.month = month;
    }

    @Override    // This tells that there is a method in the parent class, and we are changing it
    public String toString() {
        return "The date of the birth of the child "+name+" is "+year+"/"+month+"/"+date + " "+super.toString();  // Here it is optional to use super.toString , it will run the toString method of parent class
    }

    void display(){

        System.out.println("The details of the child is ");

        System.out.println(name);
        System.out.println(age);

    }

    // Method Overriding

    // If there is a same method in parent as well as child class we the method of the child class executed instead of parent class

    // Types of INHERITANCE

    // Single , Multi level , Hierarchical , Multiple(Not allowed in java because if two class contain a method with same name and parameters then the app will crash


    

}
