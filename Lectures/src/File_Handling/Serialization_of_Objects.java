package File_Handling;

import java.io.*;

public class Serialization_of_Objects{

    public static void main(String[] args) {

    Vehicle bike = new Vehicle("Bike"  ,45 );
    Vehicle car = new Vehicle("Car"  ,78 );

      try(FileOutputStream fos = new FileOutputStream("example1.dat")){

          try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {  // Since this try block is inside a try block so the outer catch block can handle the Exception

              obj.writeObject(bike);
              obj.writeObject(car);
              System.out.println("File Operation is successful");

          }
          /*catch (FileNotFoundException e){
              e.printStackTrace();
          }*/

    }
      catch(IOException e){
      e.printStackTrace();}
    }

}

class Vehicle implements Serializable{

//    private static final serialVersionUID =

    private final String type;
    private final int number;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }
    public String toString() {
        return "Vehicle [type=" + type + ", number=" + number + "]";
    }

}

