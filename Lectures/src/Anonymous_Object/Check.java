package Anonymous_Object;

/*
An Anonymous object is an instance of the class that is created but not assigned to a reference variable
This means the object exists only for the duration of the statement and cannot be used later
 */

public class Check {

    public static void main(String[] args) {

        if(new Lock().getCode().equals("12345")){     // Here we have used an anonymous object
            System.out.println("The lock is open");
        }
        else{
            System.out.println("The lock is closed");
        }

    }

}
