package oop.accessModifiers.package1;

public class Mercedes {

    //default constructor
    public Mercedes(){

    }

    //Instance variables
    /*
    model, color, year, price
     */
    public final static String make = "Mercedes";
    public String model;
    String color;
    int year;
    double price;


    //method drive

    public void drive(){
        System.out.println(make + " is driving");
    }
}
