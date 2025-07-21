package String;

public class String_Builder {

    public static void main(String[] args) {

    StringBuilder builder = new StringBuilder(); // It is muitable
    // This will not create new String instead it make changes in the same method

    for(int i = 0 ; i < 26 ; i++){
        char ch = (char)('a' + i);
        builder.append(ch);
    }

        System.out.println(builder.toString());

        builder.reverse();
        builder.deleteCharAt(1);

    }

}
