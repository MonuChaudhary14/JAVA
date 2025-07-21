package Abstract;

public class Monu extends Person{

    public void speak(){     // It is not necessary to give this implementation because it is not a abstract method
        System.out.println("Monu is speaking");
    }

    @Override
    public void eat() {
        System.out.println("Monu is eating");
    }
}
