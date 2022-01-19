package oop.oop_part1.blocks;

public class Computer {


    //Instance variables
    static final boolean hasRAM;
    String brand;
    String OS;

    //Instance initialization block (Non-static initialization block)


    //Static initialization block
    static {

        //This block will execute once and before even your test class - any code
        hasRAM = true;
    }

    {
        //This block will execute each time when a Computer object is created - before creation
        brand = "Apple";
        OS = "macOS";
        System.out.println("A computer object is created");
        if(brand.equalsIgnoreCase("apple")) System.out.println("Ohh, this is an Apple");
        else System.out.println("Well, it is not apple");
    }

    public Computer(){

    }
}






