package Static_Element;

public class Static {

    public static void main(String[] args) {
        // In Static, these elements share same memory location,so if any changes occur then it occur in all
        testStatic obj1 = new testStatic();
        System.out.println("Obj1 :" + testStatic.getStaticvalue());    // This is a static method so we can directly use it to its Class name
        obj1.setStaticvalue(45);
        System.out.println("Obj1 :" + obj1.getStaticvalue());         // This is a non-static method so we cannot directly use it without object of the class

        testStatic obj2 = new testStatic();
        System.out.println("Obj2: " + obj2.getStaticvalue());
        obj1.setStaticvalue(78);
        System.out.println("obj2: " + testStatic.getStaticvalue());

        // We can also directly access the static elements with the class name

        System.out.println("This " + testStatic.getstaticvalue);


    }

}

class testStatic {
    // We can only mark a class static only when it is an inner class

    public static int staticvalue = 0;  // If we do not give it as static, all objects have its different value
    public static String getstaticvalue;

    // When we use static, then only one memory of the variable is created, so whatever the changes are done in this,then all changes appear
    public static int getStaticvalue() {
        return staticvalue;
    }

    public void setStaticvalue(int staticvalue) {
        testStatic.staticvalue = staticvalue;
    }
    // getter and setter can be static

}
