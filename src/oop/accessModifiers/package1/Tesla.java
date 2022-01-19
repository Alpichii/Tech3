package oop.accessModifiers.package1;

class Tesla {

    private Tesla(){

    }

    final static String make = "Tesla";
    String model;
    String color;
    int year;
    private double price;

    private void drive(){
        System.out.println(price + " is the price of Tesla");
        System.out.println(make + " is driving");
    }

    public static void main(String[] args) {
        Tesla t1 = new Tesla();
    }
}