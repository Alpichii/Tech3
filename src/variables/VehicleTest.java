package variables;

import oop.oop_part2.inheritance.Boat;
import oop.oop_part2.inheritance.Plane;
import oop.oop_part2.inheritance.Train;
import oop.oop_part2.inheritance.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleTest {
    public static void main(String[] args) {
        Train train = new Train();
        Plane plane = new Plane();
        Boat boat = new Boat();

        List<Vehicle> vehicles = new ArrayList<>(Arrays.asList(train, boat, plane));

        boat.setBrand("SunDeck");
        boat.setColor("White");
        boat.setPassengerCapacity(12);

        train.setBrand("Atlas");
        train.setColor("Black");
        train.setPassengerCapacity(500);

        plane.setBrand("Air-Bus");
        plane.setColor("White");
        plane.setPassengerCapacity(300);

        /*
        System.out.println(train);
        System.out.println(plane);
        System.out.println(boat);

        train.makesNoise();
        plane.makesNoise();
        boat.makesNoise();
         */

        for (Vehicle vehicle : vehicles) {
            System.out.println("\n----Vehicle info----\n");
            System.out.println(vehicles);
            System.out.println(train);
            System.out.println(boat);
            System.out.println(plane);
            vehicle.makesNoise();

            System.out.println("\n-----Each info----\n");
            System.out.println(vehicle.getBrand());
            System.out.println(vehicle.getColor());
            System.out.println(vehicle.getPassengerCapacity());
            System.out.println();
        }

        train.goesOnTrails();
        plane.makesNoise();
        boat.sails();


    }
}