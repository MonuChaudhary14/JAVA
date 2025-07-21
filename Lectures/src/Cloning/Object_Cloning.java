package Cloning;

import Exception_Handling.Custom_Exception;

public class Object_Cloning {


    public static void main(String[] args)throws CloneNotSupportedException {  // if we do not give interface method then it will show this error
        // Here exception is just given tell the compiler that we are giving an exception

        Human monu = new Human(19 , "Monu");
        Human twin = new Human(monu);   // This is a lot of time because of new keyword

//        We can use the clone method in object class to make copies in lang package named clonnable


        Human twwin = (Human)monu.clone();

        System.out.println(twwin.toString());

    }
}

class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name){
        this.age = age;
        this.name= name;
    }
    public Human(Human human){
        this.age = human.age;
        this.name = human.name;
    }

    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy-> In this , a copy of primitive data types are created
//        but for Object(non-primitive) it points to original object so if any changes occur in
//        non-primitive data type will be changed
//
//
//        return super.clone();
//    }

    // Deep copy-> In this same copy of non-primitive data types are created so if any changes occur in copy other changes will not occur in original
    public Object clone() throws CloneNotSupportedException{

        Human twin = (Human)super.clone();  // Shallow copy

        twin.name = new String(name); // Deep copy
        return twin;

    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
