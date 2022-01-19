package oop.oop_part1.class_object.fruitExample;

public class Fruit {


    public Fruit(){

    }

    public Fruit(String name, String color, String shape, boolean isSweet, boolean isRollable){

        this.name = name;
        this.color = color;
        this.shape = shape;
        this.isSweet = isSweet;
        this.isRollable = isRollable;

    }



    //Can you tell me one feature that every fruit has
    final static boolean hasColor = true;

    //Instance variables
    String name;
    String color;
    String shape;
    boolean isSweet = true;
    boolean isRollable = true;
/*
    public Fruit(String name, String color, String shape, boolean isSweet, boolean isRollable) {
        this.name = name;
        this.color = color;
        this.shape = shape;
        this.isSweet = isSweet;
        this.isRollable = isRollable;

    }
*/

    //Override toString() method - behavior - method
    public String toString() {
        return "[" +
                "name: " + name + ", " +
                "hasColor: " + hasColor + ", " +
                "color: " + color + ", " +
                "shape: " + shape + ", " +
                "isSweet: " + isSweet + ", " +
                "isRollable: " + isRollable +
                "]";
    }
}