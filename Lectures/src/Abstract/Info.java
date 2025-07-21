package Abstract;

public class Info {

    public static void main(String[] args){

        Person monu = new Monu();

        monu.speak();
        monu.eat();

        Person p = new Person() {    // We have to implement the abstract method when using an abstract object
            @Override
            public void eat() {
                System.out.println("Person is eating");
            }
        };

        p.speak();
        p.eat();


    }

}
