package Lamda_Expression;
import java.util.*;

public class For_Each_loop_Using_Lambda {

    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1,5,3,7,8,9);   // This will take all the parameters and return an arraylist with these parameters

        list.forEach(i -> System.out.println(i));

        List<Info> l = Arrays.asList(new Info("Monu") , new Info("Chaudhary"));

        l.forEach(temp -> {
            System.out.println(temp.getName());
            System.out.println("******");
            if(temp.getName().equals("Chaudhary")){
                System.out.println("Ram Ram");
            }
        });
    }
}

class Info{

    private String name;

    public Info(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public String getName() {
        return name;
    }
}
