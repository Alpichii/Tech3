package enums;

public class Measures {

    // final static instance variables, you cannot change them
    public enum TShirtSize{
        LARGE,
        MEDIUM,
        SMALL,
        XLARGE
    }

    public enum Units{
        BYTE,
        KILOBYTE,
        MEGABYTE,
        GIGABYTE
    }

    public enum Gender{
        MALE,
        FEMALE
    }

    public static void main(String[] args) {
        System.out.println(TShirtSize.MEDIUM);

        Gender[] genders = Gender.values();

        for (Gender gender : genders) {
            System.out.println(gender);
        }
    }
}