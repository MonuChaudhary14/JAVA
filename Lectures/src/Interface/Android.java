package Interface;

public class Android implements Phone, Android_16{

    public String name(){

        return "IQOO Z9";

    }

    public String model(){
        return "Android";
    }

    @Override
    public String feature() {
        return "AI Eraser";
    }

    public String security(){
        return "Enhanced";
    }
}
