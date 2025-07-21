package Java_Collection_Framework;

import java.util.*;

class Naam implements Comparable<Naam>{

    private String name;

  @Override
  public String toString() {
    return "Naam{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Naam naam = (Naam) o;
    return Objects.equals(name, naam.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }

  public String getName() {
    return name;
  }

  public Naam(String name) {
    this.name = name;
  }


  @Override
  public int compareTo(Naam o) {
    return name.compareTo(o.getName());
  }
}

public class Binary_Search {

    public static void main(String[] args) {

      Set<String> set = new HashSet<>();
      set.add("Monu");
      set.add("Chaudhary");
      set.add("Poonia");

      List<String> list = new ArrayList<>();
      list.addAll(set);

      Collections.sort(list);

      System.out.println(list);
      System.out.println(Collections.binarySearch(list, "Chaudhary"));


      Set<Naam> set1 = new HashSet<>();
      set1.add(new Naam("Monu"));
      set1.add(new Naam("Chaudhary"));
      set1.add(new Naam("Poonia"));

      List<Naam> list1 = new ArrayList<>();
      list1.addAll(set1);
      Collections.sort(list1);
      System.out.println(list1);
      System.out.println(Collections.binarySearch(list1 , new Naam("Monu")));



    }
}
