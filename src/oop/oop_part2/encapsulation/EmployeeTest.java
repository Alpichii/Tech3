package oop.oop_part2.encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        //Set info for emp1
        emp1.setFullName("John Doe");
        emp1.setAge(25);
        emp1.setAddress("Chicago");
        emp1.setPhoneNumber("(123) 123 1234");
        emp1.setGender(Employee.Gender.MALE);

        //Get info for emp1
        System.out.println(emp1.getFullName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getPhoneNumber());
        System.out.println(emp1.getGender());
    }
}