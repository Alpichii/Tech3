package oop.oop_part2.inheritance;

public class Train extends Vehicle {

    public Train() {

    }

    public void Train(String brand, String color, int passengerCapacity) {
        this.brand = brand;
        this.color = color;
        this.passengerCapacity = passengerCapacity;

    }
   private String brand;
    private String color;
    private int passengerCapacity;

    public void goesOnTrails(){
        System.out.println(getBrand() + " goes on trails");
    }

    @Override
    public void makesNoise() {
        System.out.println(getBrand() + " makes noise");
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", passengerCapacity=" + getPassengerCapacity() +
                '}';
    }
}



