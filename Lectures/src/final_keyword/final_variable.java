package final_keyword;

public class final_variable {

    /*
    It is used to apply restrictions on variables, methods and class

    3 ways to use


    1.Final variable- A final variable cannot be reassigned after it is initialized
    If it's a reference type, the reference cannot change, but th object's internal state can
    We cannot use setter in final
    Constructor are not allowed if we are overriding the value of final variable

     */

    public static void main(String[] args) {

        final2 f = new final2();

        System.out.println(f.x);
//        f.x = 78;
        System.out.println(f.x);
    }


}

class final2{

    final public int x;   // If we do not initialize the value the we must have to make a constructor

    public final2(){
        x = 78;
    }

    public final2(int x){
        this.x = x;
    }



}
