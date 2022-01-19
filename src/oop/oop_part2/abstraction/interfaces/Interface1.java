package oop.oop_part2.abstraction.interfaces;

public interface Interface1 {

    //Can Interface have instance variables?--- only
    public static final String name = "Tom";


    ///Abstract method - by default this is public abstract
    //Interface cannot have protected or default abstract methods
    void abstractMethods3(int i);

    //2. default method
    default void printHello(){
        System.out.println("Hello");
    }

    //3.static methods
    public static void printHi(){
        System.out.println("This is static method in Interface1 saying \"hi\"");
    }





}
