import java.util.Scanner;
public class PascalTriangle {

    public static void main(String[] args) {

    int n;
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    int spaces = num;

    int number = 1;

    for(int i = 0; i < num; i++){

        for(int j = 1; j <= spaces; j++){
            System.out.print(" ");
        }
        number = 1;
        for(int k = 0; k <= i; k++){

            System.out.print(number+ " ");
            number = number*(i-k)/(k+1);

        }
        spaces--;
        System.out.println();
    }



    }
}
