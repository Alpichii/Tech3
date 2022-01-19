package projects;

import java.util.Scanner;

public class
        project02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Task1----------\n");
        System.out.println("\tTechGlobal is motivated to help individuals to start their careers in IT as Software \n" +
                "Development Engineers in Test. It requires no IT experience and welcomes all individuals from \n" +
                "different backgrounds.\n");
        System.out.println("\tWe are a group of experienced Software Development Engineers doing automation \n" +
                "testing for well-known US companies. Our mission is to provide you with real-world industry-\n" +
                "level experience and SDET training to guide you in a way that makes you a competitive \n" +
                "candidate to achieve your dreams. Through 6 months of compact course, you will be working \n" +
                "collaboratively with highly qualified instructors and mentors.");
        System.out.println("\n----------Task2----------\n");
        int seda, shukira, olha, bilal, alper;
        seda = 34;
        shukira = 29;
        olha = 28;
        bilal = 19;
        alper = 37;
        System.out.println("Seda's age is = " + seda +
                "\nOlha's age is = " + olha +
                "\nShukira's age is = " + shukira +
                "\nBilal's age is = " + bilal +
                "\nAlper's age is = " + alper);
        System.out.println("\n----------Task3----------\n");
        char t= 'T', e= 'e', c= 'c', h= 'h', g= 'G', l= 'l', o= 'o', b= 'b', a= 'a';
        System.out.print(t);
        System.out.print(e);
        System.out.print(c);
        System.out.print(h);
        System.out.print(g);
        System.out.print(l);
        System.out.print(o);
        System.out.print(b);
        System.out.print(a);
        System.out.print(l);

        System.out.println("\n----------Task4----------\n");
        int x, y, z, mult;
        System.out.println("Please enter 3 numbers");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        scanner.nextLine();
        mult = x * y * z;
        System.out.println(x + " * " + y + " * " + z + " is = " + mult);

        System.out.println("\n----------Task5----------\n");
        String first, last;
        System.out.println("What is your first name?");
        first = scanner.nextLine();

        System.out.println("What is your last name?");
        last = scanner.nextLine();

        System.out.println("What is your year of birth?");
        int birth = scanner.nextInt();
        scanner.nextLine();
        birth = 2021-birth;

        System.out.println(first + " " + last + "'s age is " + birth);

        System.out.println("\n----------Task6----------\n");
        String fullName;
        double weight;
        System.out.println("What is your full name?");
        fullName = scanner.nextLine();
        System.out.println("what is your weight?");
        weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(fullName + "'s weight is " + (weight * 2.205) + " lb");

        System.out.println("\n----------Task7----------\n");
        String s1, s2 , s3, s4, s5;
        int age1, age2 , age3, age4, age5;
        System.out.println("What is your full name?");
        s1 = scanner.nextLine();

        System.out.println("What is your age?");
        age1= scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your full name?");
        s2 = scanner.nextLine();

        System.out.println("What is your age?");
        age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your full name?");
        s3 = scanner.nextLine();

        System.out.println("What is your age?");
        age3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your full name?");
        s4 = scanner.nextLine();

        System.out.println("What is your age?");
        age4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your full name?");
        s5 = scanner.nextLine();

        System.out.println("What is your age?");
        age5 = scanner.nextInt();
        scanner.nextLine();

        int average = (age1 + age2 + age3 + age4 + age5) / 5;
        System.out.println(s1 + "'s age is " + age1);
        System.out.println(s2 + "'s age is " + age2);
        System.out.println(s3 + "'s age is " + age3);
        System.out.println(s4 + "'s age is " + age4);
        System.out.println(s5 + "'s age is " + age5);
        System.out.println("The average age in the group is " + average);
    }
}






/*
package homeworks.project;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------Task1----------\n");
        System.out.println("\tTechGlobal is motivated to help individuals to start their careers in IT as Software \n" +
                "Development Engineers in Test. It requires no IT experience and welcomes all individuals from \n" +
                "different backgrounds.\n");
        System.out.println("\tWe are a group of experienced Software Development Engineers doing automation \n" +
                "testing for well-known US companies. Our mission is to provide you with real-world industry-\n" +
                "level experience and SDET training to guide you in a way that makes you a competitive \n" +
                "candidate to achieve your dreams. Through 6 months of compact course, you will be working \n" +
                "collaboratively with highly qualified instructors and mentors.");

        System.out.println("\n-------Task-2---------\n");
        int seda, shukira, olha, bilal, alper;
        seda = 34;
        shukira = 29;
        olha = 28;
        bilal = 19;
        alper = 37;
        System.out.println("Seda's age is = " + seda +
                "\nShukira's age is = " + shukira +
                "\nOlha's age is = " + olha +
                "\nBilal's age is = " + bilal +
                "\nAlper's age is = " + alper);





        String fullName;
        double weight;
        System.out.println("What is your full name?");
        fullName = scanner.nextLine();
        System.out.println("what is your weight?");
        weight = scanner.nextDouble();
        System.out.println(fullName + "'s weight is " + (weight * 2.205) + " lb");
    }
}
*/