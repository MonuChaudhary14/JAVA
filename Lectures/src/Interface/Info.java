package Interface;

public class Info {

    public static void main(String[] args){

        Phone iphone = new Iphone();     // We can make an object of Iphone using phone also,  we can also use Iphone here

        System.out.println(iphone.model());
        System.out.println(iphone.name());
        System.out.println(Phone.val);   // These both are the static variables so we can use directly without using creating an object of the class
        System.out.println(Iphone.IMEI);

        Phone android = new Android();

        System.out.println(android.model());
        System.out.println(android.name());

//        System.out.println(android.security());  // We cannot use security because it is a feature of Android 16 not phone we have to use Android in place of Phone to access both

    }

}
