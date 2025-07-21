package Enum;

public enum Enum1 {

    SUNADAY , MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;   // No need to add semicolon at the end(Check)

}

enum Enum2 {
    SUNDAY(5), MONDAY(3), TUESDAY(2);

    private int value;

    public int getValue() {
        return value;
    }

    Enum2(int value){
        this.value = value;
    }
}
