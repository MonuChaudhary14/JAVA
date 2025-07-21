package Array_List_Creation;

// In ArrayList, it creates an array of some size

// If the size is full, then it will create a new array of double size of previous and copy all the elements in it

// It takes constant time( O(1) )  on an average

import java.util.ArrayList;
import java.util.Arrays;


public class Generic_Array_List<T> {

    private Object[] data;     // we have not initialised it because when the array is full then we will change the reference
    private static int DEFAULT_SIZE = 10;  // We make it static because it is not going to change for different objects
    private int size;

    public Generic_Array_List() {
        this.data = new Object[DEFAULT_SIZE];    // We cannot provide it T because Generics occurs at runtime, but we did not know the value of T at runtime
    }

    public void add(T num){

        if(this.isFull()){
            resize();
        }

        data[size++] = num;

    }

    private boolean isFull(){
        return size == data.length;
    }

//    private int[] resize(){          Not good method
//
//        int[] newData = new int[data.length * 2]];
//
//        for(int i = 0; i < data.length;i++){
//
//            newData[i] = data[i];
//
//        }
//
//        return newData;
//    }

    private void resize(){

        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];

        }

        data = temp;
    }


    public Object removeAtindex(int num){

        Object temp = data[num];
        for(int i = num; i <data.length-1; i++){
            data[i] = data[i+1];
        }
        return temp;
    }

    public T remove(){    // we are not removing this element and when a new element is given it will override the prev value

        T removed = (T)data[size--];
        return removed;

    }

    public T get(int index){

        return (T)data[index];

    }

    public int size(){
        return size;
    }

    public void set(int index , T num){
        data[index] = num;
    }


    //    public String toString() {     // Try to make a custom to string method which prints the elements upto the size not upto default value
//        return "Array_List{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
    @Override
    public String toString(){
        String result = "";
        result += "Array_List{";
        for (int i = 0; i < size; i++) {
            result += data[i];
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "], size = " + size;

        return result;
    }

    public static void main(String[] args) {

        Array_List list = new Array_List();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.remove();
        System.out.println(list.size());

        System.out.println(list);

        ArrayList<String> lis1 = new ArrayList<>();

        lis1.add("Monu");
        lis1.add("Tom");
        lis1.add("Jack");
        System.out.println(lis1);







    }

}
