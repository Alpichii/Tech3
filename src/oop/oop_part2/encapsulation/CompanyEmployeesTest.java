package oop.oop_part2.encapsulation;

public class CompanyEmployeesTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Leo Max", 25, Employee.Gender.MALE, "Chicago", "123");
        Employee emp2 = new Employee("John Doe", 27, Employee.Gender.MALE, "Miami", "24324");
        Employee emp3 = new Employee("Olha X", 35, Employee.Gender.FEMALE, "Dallas", "1234223");
        Employee emp4 = new Employee("Jennifer W", 56, Employee.Gender.FEMALE, "LA", "12234233");

        Company company1 = new Company();
        company1.addEmployee(emp1);
        company1.addEmployee(emp2);
        company1.addEmployee(emp3);
        company1.addEmployee(emp4);

        int i = 1;
        System.out.println(company1.getEmployees().size()); // 4
        for(Employee employee : company1.getEmployees()){
            //System.out.println(employee);
            if(!employee.getFullName().startsWith("O")){
                System.out.println("\n-----Employee info " + i++ + "-----\n");
                System.out.println(employee.getFullName());
                System.out.println(employee.getAge());
                System.out.println(employee.getGender());
                System.out.println(employee.getPhoneNumber());
                System.out.println(employee.getAddress());
            }
        }
    }
}