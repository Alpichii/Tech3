package oop.oop_part2.inheritance;

public class Vehicle {

    //TO-DO Encapsulate these information - and fix all the possible error with getters and setters
   private String brand;
    private String color;
   private  int passengerCapacity;

    public void makesNoise(){
        System.out.println("This vehicle makes noise");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", passengerCapacity=" + getPassengerCapacity() +
                '}';
    }


}