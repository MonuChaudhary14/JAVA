package Anonymous_Inner_Class;

// A non-static(member) inner class is tied to an instance of the outer class. It can access all the members of the outer class even private members

public class Inner_Class {

    public static void main(String[] args) {

    Lock lock = new Lock(){

        @Override    // This is called as anonymous because it is used only once (The implementation inside the object is anonymous)
        public boolean isLocked(String key) {
            if (key.equals("Monu")) {
                System.out.println("Door is locked");
                return true;
            } else {
                System.out.println("Door is not locked");
                return false;
            }
        }
    };


    lock.isLocked("Monu");


    // Another method

        new Lock(){
            @Override    // This is called as anonymous because it is used only once (The implementation inside the object is anonymous)
            public boolean isLocked(String key) {
                if (key.equals("Monu")) {
                    System.out.println("Door is locked");
                    return true;
                } else {
                    System.out.println("Door is not locked");
                    return false;
                }
            }
        }.isLocked("Chaudhary");

    }

}

abstract class Lock{

    public abstract boolean isLocked(String key);
    public void test(){

        System.out.println("Test");

    }

}
