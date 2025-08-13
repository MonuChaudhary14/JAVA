package Generics;
import java.util.*;

/*  Commonly Used Notation

T- Template
E- Element
K- Key
N- Number
V- Value
 */

public class _3rd {

    public static void main(String[] args) {

        Generic<Integer,String> d = new Generic</*Integer, String*/>(4, "Monu");

        System.out.println(d);

        System.out.println("Key = "+d.getkey()+ " ,Value = "+d.getvalue());

        d.display("Monu",46);

    }

}

class Generic<K , V>{    // We can also give T1 , T2 also

    private K key;   // We can also make it array
    private V value;

    public Generic(K key  , V value){  
        this.key = key;
        this.value = value;
    }

    public K getkey(){
        return key;
    }

    public V getvalue(){
        return value;
    }

    public String toString(){
        return key + " = " + value;
    }

    public static <E,N> void display(E element , N number){  // A generic method or any method in a generic class can be declared as static
        System.out.println("Element "+element+" is "+number);
    }

}
