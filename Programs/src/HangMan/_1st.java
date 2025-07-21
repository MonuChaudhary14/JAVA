package src.HangMan;

// I will create a array of character(create a map(char, boolean) because we also contain same values) of same size as that of the random string and after every guess I will update the value of array and then print it

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class _1st {

    static void print(char[] list){

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();

    }

    static boolean check (char[] list){
        for(int i = 0; i < list.length; i++){
            if(list[i] == '_'){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {

        String[] words = {
                "cat", "dog", "sun", "tree", "book", "ball", "fish", "milk", "cake", "road",
                "bird", "apple", "bread", "chair", "clock", "cloud", "table", "water", "grass", "light",
                "rain", "shoe", "paper", "phone", "plant", "smile", "train", "mouse", "house", "pencil",
                "river", "flower", "sugar", "hat", "car", "boat", "star", "heart", "fork", "shirt",
                "orange", "banana", "lemon", "door", "window", "horse", "egg", "key", "lamp", "tree",
                "cup", "plate", "soap", "bike", "glass", "bridge", "family", "fire", "money", "beach",
                "moon", "sand", "grass", "honey", "lunch", "pizza", "peach", "party", "brush", "blanket",
                "cookie", "garden", "happy", "pillow", "summer", "winter", "picture", "simple", "energy", "yellow",
                "purple", "shadow", "friend", "school", "teacher", "student", "music", "button", "holiday", "smile",
                "circle", "square", "candle", "week", "month", "night", "movie", "dinner", "dance", "travel"
        };

        System.out.println("Welcome the Hang Man");

        Random random = new Random();

        int index = random.nextInt(words.length);

        String ans  = words[index];

        Scanner sc = new Scanner(System.in);

        int position;

        char[] c = new char[ans.length()];

        for(int i = 0; i < ans.length(); i++){
            c[i] = '_';
        }
//        System.out.println(ans);

        int lives = 5;

        System.out.println("Lives = " + lives);

        System.out.println();

        System.out.println("Guess the word");

        while (lives > 0) {
            print(c);


        char ch = sc.next().charAt(0);

        position = ans.indexOf(ch);

            if(position != -1){
                for(int i = 0; i < ans.length(); i++){
                    if(ans.charAt(i) == ch){
                        c[i] = ch;
                    }
                }
//                print(c);
                if(check(c)){
                    break;
                }
            }
            else{
                System.out.println("OOPS! Wrong");
                lives--;
                System.out.println("Lives = " + lives);
            }

        }

        if(lives > 0){
            System.out.println("Hooray! You guessed the word");
        }
        else{
            System.out.println("You lost! The word was "+ans);
            System.out.println("Try again");
        }

    }

}
