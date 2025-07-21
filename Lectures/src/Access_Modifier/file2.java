package Access_Modifier;

public class file2 {

    int x =  78;    // The access modifier is default , so it is only accessible within the package
    protected int y = 78;   // This can be used, and it is treated as default modifier without inheritance
    private int z = 13;   // We cannot use this any class of the package it can be only used inside the same class
    public int a = 46;   // This can be used by any file or class , even the classes outside the package can access it when imported



}
