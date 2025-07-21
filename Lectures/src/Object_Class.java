import com.sun.security.jgss.GSSUtil;

public class Object_Class {

    // All the classes are the child class of Object class
    int num;

    public static void main(String[] args) {

    Object_Class obj = new Object_Class();

    Object_Class obj2 = obj;

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());   // Both have same hashcode


        System.out.println(obj.getClass());  // We get 'this' instance      getclass is final so we cannot override it  and it is stored in heap
        System.out.println(obj.getClass().getName());


        Person p1 = new Person();
        Student s1 = new Student();


        System.out.println(s1 instanceof Student);
        System.out.println(p1 instanceof Student);
        System.out.println(s1 instanceof Person);
        System.out.println(p1 instanceof Person);
        System.out.println(p1 instanceof Object);


    }

    public int hasCode(){
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Object_Class{}";
    }

    @Override
    public int hashCode() {    // It is a random number which is created by an algorithm which identifies whether the objects are same or not(It is not the address)
        return super.hashCode();
    }

    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    public boolean equals(Object obj) {
        return this.num == ((Object_Class)obj).num;   // we have to typecast  it to this
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Object_Class() {
    }
}

class Person {
    int age;
}
class Student extends Person {
    int num;
}
