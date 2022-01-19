package oop.oop_part2.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Applicant {

    public Applicant() {

    }

    public Applicant(String firstName, String lastName, String emailAddress, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAge(age);
    }

    //Create instance variables firstName, lastName, emailAddress, age
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private static int totalApplicants;
    private static List<Applicant> applicants = new ArrayList<>();

    //Encapsulate all the instance variables

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { // "", "123"
        if(isText(firstName)) this.firstName = firstName;
        else throw new IllegalArgumentException("Please write a valid name!!!");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(isText(lastName)) this.lastName = lastName;
        else throw new IllegalArgumentException("Please write a valid last name!!!");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if(isEmailAddressValid(emailAddress)) this.emailAddress = emailAddress;
        else throw new IllegalArgumentException("Email is not valid!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) throw new IllegalArgumentException("Age cannot be less than zero!!!");
        else if(age < 18 || age > 55) throw new IllegalArgumentException("Age is not allowed to apply!!!");
        else this.age = age;
    }

    public static int getTotalApplicants() {
        return totalApplicants;
    }

    public static void addApplicant(Applicant applicant) {
        totalApplicants++;
        applicants.add(applicant);
    }

    public static List<Applicant> getApplicants() {
        return applicants;
    }

    private static boolean isEmailAddressValid(String emailAddress){
        if(emailAddress.contains(" ") || !emailAddress.contains("@") || !emailAddress.contains(".")) return false;
        if(emailAddress.length()-1 != emailAddress.replace("@", "").length()) return false;

        String part1 = emailAddress.substring(0, emailAddress.indexOf("@"));
        String part2 = emailAddress.substring(emailAddress.indexOf("@")+1, emailAddress.lastIndexOf("."));
        String part3 = emailAddress.substring(emailAddress.lastIndexOf(".")+1);

        return part1.length() >= 2 && part2.length() >= 2 && part3.length() >= 2;
    }

    private static boolean isText(String text){
        if(text.trim().isEmpty()) return false;
        else{
            for (char c : text.toCharArray()) {
                if(!Character.isLetter(c) && !Character.isWhitespace(c)) return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", age=" + age +
                '}';
    }
}