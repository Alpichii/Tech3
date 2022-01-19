package oop.oop_part1.blocks;

public class ClassOne {

    {
        System.out.println("This is instance block");
        System.out.println("This is inner instance block");
    }

    static {
        System.out.println("This is static block");
        System.out.println("Hello world");
    }


    public static void main(String[] args) {
        System.out.println("This is main block");
        ClassOne c1 = new ClassOne();

    }
}
