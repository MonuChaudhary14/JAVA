package String;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

      String name = "Monu";

        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name);

        System.out.println(name.indexOf('n'));

        System.out.println("  Monu  ".strip());

        System.out.println(Arrays.toString(name.split("n")));

    }

}
