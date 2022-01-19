package oop.oop_part1.class_object.carExample;

public class CarTest3 {
    public static void main(String[] args) {
        Car.drives();
        Car.accelerates();
        Car.brakes();

        Car car1 = new Car();

        car1.make = "Tesla";
        car1.model = "Model S";
        car1.autoParks();

    }
}