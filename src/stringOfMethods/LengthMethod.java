package stringOfMethods;

public class LengthMethod {
    public static void main(String[] args) {
        /*
        -length() is used to find how many characters has
        -it is non-static
        -it is a return type method and returns an int which the number of characters String has
        -it is not taking any argument - non args
        NOTE: if you try to find the length of empty String which is " " , the result will be zero.
         */

        String company = "TechGlobal";
        String address = "Chicago";

        int companyLength = company.length(); // 10
        int addressLength = address.length(); // 7

        System.out.println(companyLength);
        System.out.println(addressLength);
    }
}
