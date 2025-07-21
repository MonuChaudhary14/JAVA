package Interface;

public interface Phone {    // It is a reference type that defines a contract for classes to follow.
    // It contains abstract methods(methods without implementation) and static or default methods

    // It is not compulsory to give access specifier to the methods or members. By default, they are public

    String name();    // We cannot make them protected and private
    public String model();    // Optional to use public

    String year = "2006";
    String IMEI = "7849819818";
    int val = 50;   // This is same as "  public static final int val = 50;

}
