package Generics;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;

// We can make any generic method static

class Data{
    private Object object;

    public Data(Object object){
        this.object = object;
    }

    public String toString(){
        return object.toString();   // Here if we do (String) object because we cannot type cast object
//       to solve this we use the toString method of object class which is the parent of all class
    }

    public Object getObject(){
        return object;
    }

    public static void display(List list){  // We can directly give this to print a list
        for(Object o : list){
            System.out.println(o);
        }
    }

}

class Name{

    private String name;

    public Name(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}


public class _1st {

    public static void main(String[] args) {

    List<Data> list = new LinkedList<>();

    list.add(new Data(1));
    list.add(new Data("Monu"));
    list.add(new Data(265.65f));
    list.add(new Data(2678.346));
    list.add(new Data(new Name("Poonia")));  //new Name("Poonia") calls Name.toString() which returns "Poonia"


        System.out.println(list);

//   String s = new Data("Hello");      We cannot do this type cast because object cannot be converted into any data type

    Data x = new Data("Hello");
    Data y = new Data(new Name("Chaudhary"));   //  We can give class it because it is an object type        This is possible because class contain toString Method(check if it is Name OR Data)
//    Data y = new Data(new Name(25);   Because the class Name can only String we cannot give a Integer value
    String z = new Data("Hello World").toString();   // This is valid because toString() returns a String.
    System.out.println(x.getObject());
    System.out.println(y.getObject());  //Since y holds a Name object, Java calls Name.toString()

    Data.display(list);


    }

}
