package Classes;

public class Comparison {

    public static void main(String[] args) {

        String x = "Study";
        String y = "StudyMore";
        x += "More";
        System.out.println(x);
        System.out.println(y);

        System.out.println(x == y);

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        Code code1 = new Code("hi");
        Code code2 = new Code("hi");

        System.out.println(code1 == code2);
        System.out.println(code1.hashCode());
        System.out.println(code2.hashCode());
        System.out.println(code1.equals(code2));  // Without the compare function it will show false

    }

}

class Code{

    public String val1;

    public Code(String val1){
        this.val1 = val1;
    }

//    @Override    // Generated
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Code code = (Code) o;
//        return Objects.equals(val1, code.val1);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(val1);
//    }
}
