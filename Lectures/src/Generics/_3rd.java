package Generics;
import java.util.*;

/*  Commonly Used Notation

T- Type
E- Element
K- Key
N- Number
V- Value
 */

public class _3rd {

    public static void main(String[] args) {

        Generic<Integer,String> d = new Generic<>(4, "Monu");

        System.out.println(d);

        System.out.println("Key = "+d.getkey()+ " ,Value = "+d.getvalue());

        d.display("Monu",46);

    }

}

class Generic<K , V>{

    private K key;
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

    public <E,N> void display(E element , N number){
        System.out.println("Element "+element+" is "+number);
    }

}
