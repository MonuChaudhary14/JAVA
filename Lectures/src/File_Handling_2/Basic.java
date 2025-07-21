package File_Handling_2;

import com.sun.security.jgss.GSSUtil;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic {

    public static void main(String[] args) {

    try(InputStreamReader isr = new InputStreamReader(System.in)){

        System.out.print("Enter some letter");
        int letters = isr.read();

        while(isr.ready()){
            System.out.println((char)letters);
            letters = isr.read();
        }
//        isr.close();  // No need to write this because try catch block will automatically close it
        System.out.println();
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }

        System.out.println();


    try(FileReader fr = new FileReader("example.txt")){

            int letters = fr.read();  // Why it is not printing the last character
            // Read returns the integer value
            while(fr.ready()){
                System.out.print((char)letters);
                letters = fr.read();
            }
//        fr.close();  // No need to write this because try catch block will automatically close it
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

}
