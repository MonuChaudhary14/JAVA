package File_Handling;
import javax.imageio.metadata.IIOMetadataNode;
import java.io.*;
import java.util.Scanner;

public class Read_From_File {
    public static void main(String[] args) {

     File file = new  File("example.txt");

//     FileReader f = new FileReader("example.txt");  This method can also be used to read the file

     try(BufferedReader b = new BufferedReader(new FileReader(file))){

         String line;

         while( (line = b.readLine()) != null){
             System.out.printf(line);
         }
     } catch (IOException e) {
         throw new RuntimeException(e);
     }

    // Another Method

    try(Scanner sc = new Scanner(new File("example.txt"))){

        String line;

        while(sc.hasNext()){
            line = sc.nextLine();
            System.out.printf(line);
        }
    }
    catch(IOException e){
        throw new RuntimeException(e);
    }


    if(file.delete()){   // This is used to delete the file
        System.out.println("File deleted");
    }
    else{
        System.out.println("File not deleted");
    }




    }

}

/*

Difference between Buffered Class and Scanner Class

Buffered Class                                  Scanner Class
Buffered Class is Synchronous              It is not Synchronous

It should be used with in multiple         It should be avoided in multiple
threaded application                          threaded application

Large Buffer(8KB byte buffer)              Smaller Buffer(1KB char buffer)

BufferedReader is a bit faster             Scanner is little slower, As scanner does
as BufferedReader simply reads               parsing of input data
sequences of characters


 */
