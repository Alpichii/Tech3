package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {

        byte b = 14;
        short s = 198;
        int i = 400_000;
        long l = 4_837_568_347_658L;
        float f = 15.6F;
        double d = 3456.345;
        char c = '#';
        boolean b1 = false;

        String s1 = "" + b;
        System.out.println(s1 + 5); //solution: 145

        String s2 = "" + s;
        String s3 = "" + i;
        String s4 = "" + l;
        String s5 = "" + f;

        String s6 = Double.toString(d);
        String s7 = "" + d;

        String s8 = String.valueOf(b);
        String s9 = Character.toString(c);
        String s10 = String.valueOf(b1);
    }
}
