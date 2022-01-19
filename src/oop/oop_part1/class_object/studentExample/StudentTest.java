package oop.oop_part1.class_object.studentExample;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {
    /*
Create 5 student objects
Loop through each object with a collection and print all info
 */
    public static void main(String[] args) {
        Student student1 = new Student("Ally", "Danny", 21, 'F', "02/02/2000",
                5.6, 165.00, "566 Chicago st, Chicago, IL 60625", "(773)-111-1111",
                "Joeboon@gmail.com", "B595-3145-8987");
        Student student2 = new Student("Micheal", "Bond", 31, 'M', "02/02/1990",
                5.5, 175, "345 Dearborn st, Chicago, IL 60625", "(773)-222-2222",
                "micheal@gmail.com", "B234-4232-2132");
        Student student3 = new Student("Johnny", "Walker", 22, 'M', "02/02/1999",
                5.7, 177, "763 Michigan St, Chicago, IL 60627", "(773) - 333 - 3333",
                "johnnywalker@gmail.com", "J439-8541-3422");

        Student student4 = new Student("Jack", "Denial", 25, 'M', "02/02/2000",
                5.6, 180.20, "653 Chicago st, Chicago, IL 60625", "(773)-444-4444",
                "jackdenial@gmail.com", "D342-3213-3333");
        Student student5 = new Student("Tony", "Cash", 24, 'M', "02/02/1997",
                5.6, 190, "213 Lawrence st, Chicago, IL 60625", "(773)-555-5555",
                "johnnycash@gmail.com", "C234-2313-2131");

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));

        for (Student student : students) {
            System.out.println("Car's make and model = " + student.firstName + " " + student.lastName + student.age +
                    " " + student.gender + " " + student.dateOfBirth + " " + student.height + " " + student.weight +
                    " " + student.address + " " + student.phoneNumber + " " + student.email + " " + student.id);
        }
    }
}
