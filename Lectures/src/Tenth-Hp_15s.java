public class Tenth {

    public static void main(String[] args) {

    testStatic obj1 = new testStatic();
        System.out.println("Obj1 :"+obj1.getStaticvalue());
        obj1.setStaticvalue(45);
        System.out.println("Obj1 :"+obj1.getStaticvalue());

    testStatic obj2 = new testStatic();
        System.out.println("Obj2: "+ obj2.getStaticvalue());
        obj1.setStaticvalue(78);
        System.out.println("obj2: "+ obj1.getStaticvalue());

        // We can also directly access the static elements with the class name

        System.out.println("This "+testStatic.getstaticvalue);


    }

}

class testStatic{
    // We can only mark a class static only when it is an inner class

    public static int staticvalue = 0;  // If we do not give it as static, all objects have its different value
    public static String getstaticvalue;

    // When we use static, then only one memory of the variable is created, so whatever the changes are done in this,then all changes appear
    public int getStaticvalue(){
        return staticvalue;
    }

    public void setStaticvalue(int staticvalue){
        this.staticvalue = staticvalue;
    }

}
