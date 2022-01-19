package oop.oop_part2.abstraction;

public abstract class Phone {

    //Every phone's behaviors - methods - functions
    //Abstract class is created to be inherited by child classes
    //It defines what child classes should do, but it does not any clue
    //about how to do it!!!
    //We can create abstract methods that tell child what to do





    public Phone(){

    }

    public Phone(String brand, String color, int storage, double price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    //instance variables
    public String brand;
    public String color;
    public int storage;
    public double price;


    //RULE: any child MUST implement body for these abstract method
    public abstract void call();
    public abstract void text();
    public abstract void ring();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }


}
