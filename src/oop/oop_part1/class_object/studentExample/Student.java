package oop.oop_part1.class_object.studentExample;

public class Student {

    public Student(String firstName, String lastName, int age, char gender, String dateOfBirth, double height,
                   double weight, String address, String phoneNumber, String email, String id){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender =  gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email =email;
        this.id = id;
    }

    String firstName;
    String lastName;
    int age;
    char gender;
    String dateOfBirth; // 11/11/2000   10.5
    double height;
    double weight;
    String address;
    String phoneNumber; // "312-123-3434"
    String email;
    String id;

    public String toString() {
        return "[" +
                "first Name: " + firstName + "," +
                "last Name: " + lastName + "," +
                "age: " + age + "," +
                "sex: " + gender + "," +
                "dOB: " + dateOfBirth + "," +
                "height: " + height + "," +
                "weight: " + weight + "," + "lbs" +
                " full Address: " + address + "," +
                "phone Number # " + phoneNumber + "," +
                "e-mail: " + email + "," +
                "student ID#: " + id + " " +
                "]";

    }
/*
TASK-2
Override toString() method to return object info formatted same as Car
 */
}
