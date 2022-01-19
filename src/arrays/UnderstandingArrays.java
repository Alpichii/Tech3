package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String student1 = "Momen";
        String student2 = "Seda";
        String student3 = "Jafeth";
        String student4 = "Feyza";
        String student5 = "Olha";
        String student6 = "Alper";

        String[] students = new String[6]; // 1. Creating an Array object of String and adding elements one by one
        students[0] = "Momen";
        students[1] = "Seda";
        students[2] = "Jafeth";
        students[3] = "Feyza";
        students[4] = "Olha";
        students[5] = "Alper";


        System.out.println(student6);
        System.out.println(student1);

        System.out.println(students[0]); // Momen
        System.out.println(students[3]); // Feyza
        System.out.println(students[5]); // Alper
        System.out.println(students[-2]); // ArrayIndexOutOfBoundException

    }
}
