package oop.oop_part2.encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = new Company();

        //get information
        System.out.println(company1.getName());
        System.out.println(company1.getAddress());
        System.out.println(company1.getPhone());

        //System.out.println(Company.totalNumberOfEmployee);
        System.out.println(Company.getInstagramProfile());


        System.out.println(Company.getImagesOnMaps());

        Company.addImageOnMaps(2);

        System.out.println(Company.getImagesOnMaps());

        System.out.println(Company.getTotalNumberOfEmployee()); // 5
        Company.setTotalNumberOfEmployee("admin", "Abcd123!", -30);
        System.out.println(Company.getTotalNumberOfEmployee()); // 3
    }
}