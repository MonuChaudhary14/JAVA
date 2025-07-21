package Exception_Handling;

public class Custom_Exception extends Exception {

        public Custom_Exception(String message){
            super(message);
            System.out.println("This is Custom_Exception");
        }
}
