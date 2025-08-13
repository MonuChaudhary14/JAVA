package Generics;

public class Bounded_Type_Parameters {

    public static void main(String[] args) {

    Information<Integer, Naam> i = new Information<>(5, new Naam("Monu"));
        System.out.println(i);
    }

}

class Information<K extends Integer/*Super Class    '&' can be used to bound more */ , V extends Naam>{      // extends means K must be an Integer or a subclass of Integer
    // for V -->  It must be Naam or a subclass of Naam Class
    private K key;
    private V value;

    public Information(K key  , V value){
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
        return "Key = " + key + " , Value = " + value;
    }

    public <E ,N extends Number> void display(E element , N number){
        System.out.println("Element "+element+" is "+number);
    }

}

class Naam{

    private String name;

    public void set(String name){
        this.name = name;
    }

    public Naam(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}
