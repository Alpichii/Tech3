package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {
        String price ="199.00";
        double d = Double.parseDouble(price);
        System.out.println(d > 0);

        String myAge = "29";
        System.out.println(Integer.parseInt(myAge) + 5);

    String isRainy = "true";
    boolean b = Boolean.parseBoolean(isRainy);

        System.out.println(b == false);

        // parse vs valueOf Methods
        String balance = "25.5";
        double d5 = Double.valueOf(balance) + 10;












    }
}
