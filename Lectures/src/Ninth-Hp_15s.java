public class Ninth {

    public boolean islocked(String key){

        class Lock{     // Local Inner Class

            public boolean islocked(String key){

                if(key.equals("MonuChaudhary")){
                    return false;
                }
                else{
                    return true;
                }

            }

        }
        return new Lock().islocked(key);
    }

    public static void main(String[] args) {  // This args value is stored in edt configuration feature with the name as program arguments

    /*
    Java Object Class

    Object class is present in java.lang package. Every class in java is directly or indirectly derived from the object class.
     If a class does not extend any other class, then it is a direct child of Object class and
     if it extends another class, then it is indirectly derived. Therefore, the object class methods are available to all Java classes.
    Hence, object class acts as a root of the inheritance hierarchy in any Java program.

     */

        Ninth door = new Ninth();
        System.out.println("The door is locked "+door.islocked("Hello"));

//        if(door.islocked(args[0])){  // To use command line argument we have to give its value in edit configuration box (to check open configuration and see the value of it)
//            System.out.println("Door is locked");
//        }
//        else{
//            System.out.println("Door is unlocked");
//        }


      Models m = new Models("Honda" , 2024);
        Models m1 = new Models("Honda" , 2024);
            Models m2 = new Models("Suzuki" , 2020);


        //Both return the same result
        System.out.println(m);
        System.out.println(m.toString());

        System.out.println(m == m1);


        System.out.println(m.equals(m1));


        System.out.println(m.hashCode());
        System.out.println(m2.hashCode());


        /*
        Java Polymorphism

        Polymorphism allows us to perform a single action in different ways.
         In other words, polymorphism allows you to define one interface and have multiple implementations.

         Types:-

         1.Compile-time/ Static  polymorphism --> In this two classes have same functions whose have same name and parameters so is decided in run-time.
         2.Runtime/ Dynamic polymorphism --> In this there are two functions which have different parameters so it is decided on compile time


         */
        // Example of Polymorphsim
        Models models; // This is also possible in java ,this will create a reference of model and we assign the value(which class it contains)
        // like we have a class which is parent class of other classes, and we do not know about it then we can assign the class name to this models which will work same,
        // this is helpful when we have multiple child class we want to access them from the name of parent class

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        p.display();   // This will call the function of Parent class
        c.display();   // This will call the function of Child Class
        pc.display();  // This will call the function of Child Class because the object is of child class

        // If the type of the reference variable is of Parent class and object is of Child Class then the method of child class is called

//        models = new Supercar();  // Find out the reason why it shows error
//
//        models.getname("Supra");
//
//        Models Supra = new Supercar();  // We can also create object of child class from parent class
//
//        Supra.getName("Supra");
//        Supra.display();

    }
}

class Models{

    protected  int year;   // by using protected only parent class and child class can access them
    public String model;

    public Models(String model , int year){

        this.model = model;
        this.year = year;

    }

    class Supercar extends Models{

        String name;

        public Supercar(String model, int year) {
            super(model, year);
        }

        public void getName(String name) {
            this.name = name;
        }

        public void display(){
            System.out.println(name);
        }

    }

   /*
    public String toString(){   // This override the default function of object class.
        return " Car is "+ model + "and year is "+year;
    }

    */
    @Override
    public boolean equals(Object obj){
        Models that = (Models)obj;

        if(this.model.equals( that.model) && this.year == that.year){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode(){

       int initialnumber = 31;

       initialnumber += year;
       initialnumber += model.hashCode();
       return initialnumber;

    }



}

class Parent{

    int age;

    void display(){
        System.out.println("This is the age of Parent: "+age);
    }

}

class Child extends Parent{

    void display(){
        System.out.println("This is the age of Child: " + age);
    }

}


