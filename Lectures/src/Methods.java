public class Methods {

    public static void main(String[] args) {

        int start = 1;
        int end = 10;

        loop(start, end);
        System.out.println();
        loop(5);    // We cannot give it a float value because the function only takes int and, float cannot be implicitly typecast into int(when float function is commented)
        loop(8.5f);  // Without 'f' it will treat it as a double so it will not be used in float function

    }

    public static void loop(int start, int end) {    // We can directly call these methods inside the main

        for (; start <= end; start++) {    // static is used so that the method can be used directly without creating an object of the class
            System.out.println(start);     // public is used so that when it is inherited this method can be used

        }
    }

    // Method overloading

    static void loop(float num) {   // int is implicitly typecasted to float


        for (; num > 0; num--) {

            System.out.println(num);

        }
    }

    public static void loop(int val) {
        for (int i = 1; i <= val; i++) {

            System.out.println(i);

        }
    }
}
