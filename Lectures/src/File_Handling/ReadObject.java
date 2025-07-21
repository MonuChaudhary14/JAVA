package File_Handling;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("example1.dat")){

            try(ObjectInputStream obj = new ObjectInputStream(fis)){

                Vehicle v1 = (Vehicle) obj.readObject();
                Vehicle v2 = (Vehicle) obj.readObject();
                System.out.println(v1);
                System.out.println(v2);

            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
        catch(IOException e){

        }

    }

}
