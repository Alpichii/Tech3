package oop.oop_part1.class_object.carExample;

public class Car {

    public Car(){

    }

    public Car(String make, String model, String trim, String color, int year, Double engineSize, boolean hasSunRoof) {


        this.make = make;
        this.model = model;
        this.trim = trim;
        this.color = color;
        this.year = year;
        this.engineSize = engineSize;
        this.hasSunRoof = hasSunRoof;

    }

    final static boolean hasWindow = true;
    //Declaring Attributes
    String make;
    String model;
    String trim;
    String color;
    int year;
    double engineSize;
    boolean hasSunRoof;

    /*
    Behaviours of car
    drive()
    brake()
    accelerate()
    convertible()
    autoPark()
     */
    public static void drives(){
        System.out.println("Car drives");
    }
    public static void brakes(){
        System.out.println("Car brakes");
    }
    public static void accelerates(){
        System.out.println("Car accelerates");
    }
    public void autoParks(){
        System.out.println("Car accelerates");
    }


    public String toString(){ //toString overrides the location to be in child class insteAD OF og location in parent class
        //body - implementation
        return "[" +
                "make " + make +
                ", model = " + model +
                ", trim = " + trim +
                ", color = " + color +
                ", year = " + year +
                ", engineSize = " + engineSize +
                ", hasSunRoof = " + hasSunRoof +
                "]";
    }
}