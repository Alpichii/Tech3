package oop.oop_part2.inheritance;

public class Boat extends Vehicle{

    public void sails(){
        System.out.println(getBrand() + " sails");
    }
}

/*
package oop.oop_part2.inheritance;

public class Boat extends Vehicle {

    public Boat() {
    }
    public void Boat(String brand, String color, int passengerCapacity){

        this.brand = brand;
        this.color = color;
        this.passengerCapacity = passengerCapacity;
    }

    private String brand;
    private String color;
    private int passengerCapacity;

    public void sails() {
        System.out.println(this.brand + " sails");
    }

    @Override
    public void makesNoise() {
        System.out.println(this.brand + " makes noise");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}

 */
