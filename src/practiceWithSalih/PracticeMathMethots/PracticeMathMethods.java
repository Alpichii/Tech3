package practiceWithSalih.PracticeMathMethots;

public class PracticeMathMethods {
    public static void main(String[] args) {
        System.out.println("-----task1------");

        String s1 = "5", s2 = "10";
        String s3 = "12", s4 = "3";

int intS1 = Integer.parseInt(s1);
int intS2 = Integer.parseInt(s2);
int intS3 = Integer.parseInt(s3);
int intS4 = Integer.parseInt(s4);

        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (intS1 + intS2) +
                "\nProduct of " + s1 + " and " + s2 + " is = " + (intS1 * intS2) +
                "\nDivision of " + s1 + " and " + s2 + " is = " + ((double)intS1 / (double)intS2) +
                "\nSubtraction of " + s1 + " and " + s2 + " is = " + (intS1 - intS2) +
                "\nRemainder of " + s1 + " and " + s2 + " is = " + (intS1 % intS2) + "\n" +
                "\nSum of " + s3 + " and " + s4 + " is = " + (intS3 + intS4) +
                "\nProduct of " + s3 + " and " + s4 + " is = " + (intS3 * intS4) +
                "\nDivision of " + s3 + " and " + s4 + " is = " + (intS3 / intS4) +
                "\nSubtraction of " + s3 + " and " + s4 + " is = " + (intS3 - intS4) +
                "\nRemainder of " + s3 + " and " + s4 + " is = " + (intS3 % intS4));

        System.out.println("-----task2------");

        String ss1 = "200", ss2 = "-50";
int intSS1 = Integer.parseInt(ss1);
int intSS2 = Integer.parseInt(ss2);

        System.out.println("The greatest value is = " + (Math.max(intSS1, intSS2)) + "\nThe smallest value is = " +
                (Math.min(intSS1, intSS2)) + "\nThe average of those is = " + (intSS1 + intSS2) / 2 +
                "\nThe absolute difference of them = " + Math.abs(intSS1 - intSS2));

        System.out.println("-----task3------");





    }
}
