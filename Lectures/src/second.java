import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of day");

        int day = scanner.nextInt();

        switch (day) {  // it can only take primitive data types and string
            case 1:
            case 0:
                // For both 0 and 1, it gives the same output
                System.out.println("Today is Sunday");
                break;  // If we don't use break, it will print all the conditions after the true condition
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
        }

        // Important point
        // When we are working in multiple loops, and we want to break the outer loop from inside of another loop, we have to use a label

        outerloop: // Label name
        for (int i = 0; i < 5; i++) {
            innerloop:
            for (int j = 1; j < 12; j++) {
                if (j == 5) break innerloop; // We can also use only break in this case
                if (j == 6) break outerloop; // This will work when removing the upper line
                System.out.print(j + " ");
            }
        }
        System.out.println();  // we can use this to break line
        System.out.println("\n"); // this is also used to break line but it leave two lines

        // Creating and declaring an array
        int[] arr = new int[5];
        int arr1[] = {1,2,4,5,6}; // Not to declare the size at this type of declaration

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);  // arr.length

        //For each loop
        for(int q : arr){
            System.out.println(q);
        }

        int maxvalue = Integer.MAX_VALUE;  // Maximum Value of Integer
        int minvalue = Integer.MIN_VALUE;  // Minimum Value if Integer

        System.out.println(maxvalue);
        System.out.println(minvalue);

        //creating a 2-D array

        int arr2[][] = new int[4][5];
        int arr3[][] = {{1,2,3} , {4,5,6} , {7,8,9}};

        scanner.close();  // Close scanner after all inputs are taken
    }
}
