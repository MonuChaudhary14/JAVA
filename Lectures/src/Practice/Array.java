package Practice;

import java.util.Arrays;
import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {

        int arr[];
        int[] array = new int[10];

        arr = new int[5];

        int[] a = {1, 2, 34, 5, 5};

        System.out.println(Arrays.toString(a));

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.println(arrayList.get('A'));

//        System.out.println(Arrays.toString(arrayList));  This cannot be done because Arrays.toString requires an array

        ArrayList<Number> arrayList1 = new ArrayList<>();

        arrayList1.get(3);
        arrayList1.get(4);
        arrayList1.get(5);

        arrayList1.get(2);

        arrayList1.remove(1);


    }

}
