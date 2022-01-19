package operators.arithmeticOperations;

public class AnnualMonthlyWeeklySalary {
    public static void main(String[] args) {
        double salary = 90_000;

        System.out.println("Monthly salary is = $" + (salary / 12));
        System.out.println("Bi-weekly salary is = $" + (salary / 26));
        System.out.println("Weekly salary is = $" + (salary / 52));
    }
}

