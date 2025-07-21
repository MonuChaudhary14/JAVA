package Classes;

public class class2 {

    private int salary;
    protected int id = 5;  // This is also possible, and we can also make a constructor to initialise it
    static public String name;    // static is used to initialise it directly in main class of class1(to use directly without making object)
    String naam;


    // Constructor

    public class2() {
        // This is the default constructor which is created by java
        salary = 1000000;
        naam = "Monu chaudhary";
        name = "Ketan Chaudhary";
        id = 65464646;
    }

    public class2(int salary , int id , String name , String naam){  // If we create a constructor then we java will not create a default constructor
        // This constructor is called as parameterized constructor
        this.salary = salary;
        this.id = id;
        class2.name = name;   // This cannot be used on static member
        this.naam = naam;

    }



    public int getId() {
        return id;
    }

    public static String getName() {   // This is the getter for name
        return name;
    }

    // Setter
    public void setSalary(int salary){
        this.salary = salary;     // this keyword refers to the current object of the class
    }

    //Getter
    public int display(){
        return salary;
    }




}
