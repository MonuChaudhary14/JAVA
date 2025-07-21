package Lamda_Expression;
import java.util.*;

public class Comparator_Using_Lambda {

    public static void main(String[] args) {

    List<Data> list = new ArrayList<>();

    list.add(new Data("Monu"));
    list.add(new Data("Chaudhary"));
    list.add(new Data("Poonia"));
    list.add(new Data("Jat"));

//    Collections.sort(list); We are using a custom data so we cannot sort it directly
//    We have to use a comparable interface or comparator

//        Collections.sort(list , new Comparator<Data>() {   // As there is only one method so we can convert it into lambda expression
//            public int compare(Data o1, Data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(list , (Data  o1 /* It is optional to use Data*/ , Data o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(list, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        Collections.sort(list , (o1, o2) -> {
            if(o1.getName().length() > o2.getName().length()){
                return 1;
            }
            else if(o1.getName().length() < o2.getName().length()){
                return -1;
            }
            else{
                return 0;
            }
        });

    list.forEach(i -> System.out.println(i.getName()));

        System.out.println("******");

    for(Data temp : list){
        System.out.println(temp.getName());
    }


    }

}

class Data{

    String name;

    public Data(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data [name=" + name + "]";
    }
}
