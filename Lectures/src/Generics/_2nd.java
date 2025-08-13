package Generics;
import java.util.*;

class GenericData<T>{

    private T data;

    public GenericData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public String toString(){
        return data.toString();
    }

}

public class _2nd {

    public static void main(String[] args) {

    Data data = new Data("Monu");
    String x = (String) data.getObject();   // This only works when we have compatible data means it only works when we have object of String type in this case
    System.out.println(x);

    GenericData t = new GenericData("Information");   // Same as Object class because we have not defined any type
    /*You're using GenericData t = new GenericData("Information");
    without specifying a type parameter, which leads to a raw type warning.
     It's best to always specify the type, e.g., GenericData<String> t = new GenericData<>("Information");.
     */


    String y = (String)t.getData();
    System.out.println(y);
    /*
    String y = (String)t.getData();
Since t is declared without a specific type, Java assumes Object, requiring an explicit cast.
 However, if you declared t as GenericData<String>, no casting would be needed.
     */


    GenericData<String> s = new GenericData<String>/*Optional to use String*/("Hello");
    String z = s.getData();    // No need to type cast it because we have already given that is a String type
    System.out.println(z);

    List<GenericData<Object/* Best method is to use wild card ?*/>> elements = new LinkedList<>();   // We can also use String or any other Data type in place of Object, but then it will only accept String values
    elements.add(new GenericData("Monu"));
    elements.add(new GenericData<Object>('E'));   // This is also possible
    elements.add(new GenericData(25));
    /*
    List<GenericData<Object>> elements = new LinkedList<>();
    means it only accepts GenericData<Object>. However, when you do elements.add(new GenericData("Monu"));,
     the GenericData<String> is implicitly treated as GenericData<Object>. While this works here,
     it’s not a best practice because it can lead to unintended behavior.
     */

    for(Object object : elements){
        System.out.println(object);
    }

    // Another way

    for(GenericData<Object> info: elements){
        System.out.println(info);
    }
        /*elements is a List that contains objects of type GenericData<Object>.

        So, when we loop over elements, each item is of type GenericData<Object>, not just Object.
        */


    }

}

class MyClass {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

