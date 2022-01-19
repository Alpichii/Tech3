package oop.oop_part2.inheritance;

public class Plane extends Vehicle{

    public void fly(){
        System.out.println(getBrand() + " plane flies");
    }
}


/*
package oop.oop_part2.inheritance;

public class Plane extends Vehicle{

 public void Plane(){

 }

 public void Plane(String brand, String color, int passengerCapacity){
     this.brand = brand;
     this.color = color;
     this.passengerCapacity = passengerCapacity;
 }

 public String brand;
 public String color;
 public int passengerCapacity;

    public void fly(){
        System.out.println(this.brand + " plane flies");
    }

    @Override
    public void makesNoise() {
        System.out.println(this.brand + " makes noise");
    }



    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}

 */