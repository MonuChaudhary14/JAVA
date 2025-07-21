package File_Handling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Writing_In_File {

    public static void main(String[] args) {

//        FileWriter f = new FileWriter("example.txt");    We can also use this to write in a file


        try(BufferedWriter b = new BufferedWriter(new FileWriter("example.txt" , true)) ){  // It cannot create a folder
            // If we do not true the FileWriter then it will truncate the file then start writing
            b.write("Monu");
            b.write(" Chaudhary  ");

            b.close();   // Whenever we use try with resources there is no need to close the file because then the java will automatically close the file
        }
        catch(IOException e){
            System.out.println("Somthing went wrong");
        }

        // Another Method

         File file = new File("example.txt");
//         We can also give file in place of example.txt in FileWriter

        try {
            BufferedWriter b1 = new BufferedWriter(new FileWriter(file, true));

            b1.newLine();
            b1.write("jat");
            b1.newLine();
            b1.close();  // If we do not use close then it will not make changes in the file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // We prefer to use try with resources instead of try because if any Exception occur then the file will not be closed
        // We cannot also use finally block to close the file then the file will be out from the block in which it is made


        // 3rd method

        BufferedWriter b2 = null;

        try{
            b2 = new BufferedWriter(new FileWriter(file , true));

            b2.write("Ram Ram");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        finally {
            try {
                b2.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // It is not preferred because we have to create a try and catch block for close function
        // We can also throw an Exception in the method to remove try and catch block

    }

}
