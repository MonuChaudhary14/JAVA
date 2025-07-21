package Java_Collection_Framework;
import java.util.*;

public class Mapss {

    public static void main(String[] args) {

    Map<String , String> map = new HashMap<>();
    map.put("Mon" , "1");
    map.put("Tues" , "2");
    map.put("Wednes" , "3");
    map.put("Thursday" , "4");
    map.put("Friday" , "5");
    map.put("Mon" , "15");
    map.put("Tues" , "5");  // It will replace the value of Tues with 5
    map.put("Monday" , "1");
    map.put(null , "5");  // It allows only one null key but there can be any number of null values

        System.out.println(map);

        Set<String> set = map.keySet();  // This will return the set of all keys
//        Collections c= (Collections) map.values();   Check it

        // 1st method to iterate
        for(String key : map.keySet()){

            System.out.println("Key: " + key + " , value: "+map.get(key));

        }

        System.out.printf("******\n");

        // 2nd method

        for(Map.Entry<String , String > entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , value: " + entry.getValue());
        }

        System.out.printf("******\n");

        // 3rd method

        Iterator<Map.Entry<String , String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String , String> temp = iterator.next();
            System.out.println("Key: " + temp.getKey() + " , value: " + temp.getValue());
        }

        Map<String , Integer> map1 = new TreeMap<>();   // TreeMap arrange them in ascending order

        map1.put("Jan" , 1);
        map1.put("Feb" , 2);
        map1.put("Mar" , 3);
        map1.put("Apr" , 4);
        map1.put("May" , 5);
        map1.put("Jun" , 6);
//      map1.put(null , 5);     It does not allow any null value
        System.out.printf("*****\n");

        System.out.println(map1);




    }

}

/*
map.remove(key)	Removes a key and its value
map.remove(key, value)	Removes key only if value matches
map.clear()	Removes all key-value pairs
Use Iterator	For safe removal while iterating
 */
