package oop.oop_part2.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Company {

    //default constructor
    public Company(){

    }

    //instance variables of the Company
    private static int totalNumberOfEmployee = 5;
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        totalNumberOfEmployee++;
    }

    public static int getTotalNumberOfEmployee(){
        return totalNumberOfEmployee;
    }

    public static void setTotalNumberOfEmployee(String username, String password, int number){
        if(username.equals("admin") && password.equals("Abcd123!")){
            if(number >= 0) totalNumberOfEmployee = number;
            else throw new IllegalArgumentException("The total number of employee cannot be less than zero!!!");
        }
        else throw new IllegalArgumentException("Either username or password is incorrect!!!");
    }

    //We should provide access for people to read it
    private String address = "Des Plaines";
    private String name = "TechGlobal";
    private String phone = "(312) 123-1234";

    //Provide public access through get methods
    public String getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    private static String instagramProfile = "https://www.instagram.com/techglobal.school/";

    public static String getInstagramProfile(){
        return instagramProfile;
    }
    //Everyone can add image but no one can delete it
    private static int imagesOnMaps = 10;

    public static int getImagesOnMaps(){
        return imagesOnMaps;
    }

    public static void addImageOnMaps(int number){
        if(number > 0) imagesOnMaps += number;
        else throw new IllegalArgumentException("You entered an invalid number!!!");
    }
}