package Java_Collection_Framework;
import java.util.*;

public class Set2 {

    public static void main(String[] args) {

        Comparator<Data <Integer, String> > comparator = new Comparator<>(){

            public int compare(Data<Integer , String> obj1  ,  Data<Integer , String> obj2){
              if(obj1.getKey() < obj2.getKey()){
                  return -1;
              }
              else if(obj1.getKey() > obj2.getKey()){
                  return 1;
              }
              return 0;
            }
        };


        Set<Data<Integer , String>> set = new TreeSet<>(comparator);   // Here Set contains the object of Data class

        // We cannot use TreeSet directly here because it sorts the data which does not work on custom object without a custom comparator
        // We need a custom comparator to sort the list
        set.add(new Data<>(1 , "Mon"));
        set.add(new Data<>(2 , "Tues"));
        set.add(new Data(3 , "Wednes"));   // It is optional to use '<>' in this

//        System.out.println(set);

        for(Data<Integer, String> data : set){
            System.out.println(data);
        }

    }


}

class Data<K extends Integer, V extends String>{

    private K key;
    private V value;

    public Data(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return key.toString() + " : " + value.toString();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
