package oop.oop_part2.encapsulation;

public class ApplicantTest {
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant();
        applicant1.setFirstName("Elon Reeve");
        applicant1.setLastName("Musk");
        applicant1.setEmailAddress("musk@spacex.com");
        applicant1.setAge(35);

        Applicant.addApplicant(applicant1);

        Applicant applicant2 = new Applicant("John", "Doe", "johndoe@gmail.com", 25);
        Applicant.addApplicant(applicant2);

        Applicant applicant3 = new Applicant("Alper", "Uluslu", "leo@gmail.com", 34);
        Applicant.addApplicant(applicant3);

        System.out.println("\n\n-----Printing Total Applicants Info------\n");
        System.out.println("Total number of applicants = " + Applicant.getTotalApplicants());
        System.out.println("The applicants list = " + Applicant.getApplicants());


        System.out.println("\n\n-----Printing Applicant Info one by one as object------\n");
        for(Applicant applicant : Applicant.getApplicants()){
            System.out.println(applicant);
        }


        System.out.println("\n\n-----Printing Each Info of Applicant Info one by one as data------\n");

        for(Applicant applicant : Applicant.getApplicants()){
            System.out.println(applicant.getFirstName());
            System.out.println(applicant.getLastName());
            System.out.println(applicant.getEmailAddress());
            System.out.println(applicant.getAge());
            System.out.println();
        }
    }
}