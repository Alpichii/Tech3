package oop.oop_part2.encapsulation;

public class Employee {

    public Employee(){

    }

    public Employee(String fullName, int age, Gender gender, String address, String phoneNumber){
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    //Declare instance variables as fullName, age, gender, address, phoneNumber

    private String fullName;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public enum Gender{
        FEMALE,
        MALE
    }


    //Encapsulate Write public setters and getters

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "[" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ']';
    }
}