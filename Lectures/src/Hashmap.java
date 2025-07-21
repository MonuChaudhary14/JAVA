import java.util.HashMap;
import java.util.Map;  // In this program, this is used to implement for each loop in HashMap ways
import java.util.Set;
import java.util.*;

public class Hashmap {

    public static void main(String[] args) {

       /*
       HashMap-These are an unordered map which it is not necessary that order as the same order of insertion

       It is used to value with a key like if we want to use to make to a pair of data types at the same time

       Like name and roll number
        */

        HashMap<String , Integer> map = new HashMap<>();  // At this point map is empty
        // String is the key and Integer is value like Monu 50

        // INSERTION
        map.put("Monu Chaudhary" , 1);
        map.put("Ketan Chaudhary" , 2);
        map.put("Prachi Chaudhary" , 3);

        System.out.println(map);  // It is used to print the whole map

        map.put("Monu Chaudhary" , 10);  // This updates the previous value. If the key does not exists, then it creates a new one

        //SEARCH
        if(map.containsKey("Monu Chaudhary")){   // This return true if the key is present
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("Monu Chaudhary"));   // This is used to get the value of the key

        System.out.println(map.get("Monu"));  // This returns NULL because the key does not exist

        for(int val : map.values()){   // This is used to give the value of the map keys

            System.out.print(val+" \n");

        }
        System.out.println();
        // Another value
//        map.entrySet()  This means map is converted into a set
        for( Map.Entry<String , Integer>e : map.entrySet()){
            System.out.print(e.getKey());  // This is used to print the keys
            System.out.println(" "+e.getValue()); // This is used to print the values
        }
        System.out.println();
        System.out.println(map.size());  // This is used to find the number of elements in the map
        // Another Method

        Set<String> keys = map.keySet();   // This gives the set of all keys

        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("Monu Chaudhary");  // This will the remove the key as well as the value



    }

}
