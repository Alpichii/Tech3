package casting;

public class CastingPrimitives {
    public static void main(String[] args) {

        byte b1 = 45; //1 byte of capacity -128 to 127
        byte b2 = 127;

        short s1 = 133; //2 byte of capacity -32768 to 32767

        //System.out.println((Short.MAX_VALUE));
        //System.out.println((Short.MIN_VALUE));

        int i1 =  32768; // 4 byte //--2147483648 to 2147483647
        int i2 = b1 + s1; //casting -storing a byte into an int - implicit
        int i3 = s1; //casting - storing a short into an int - upcasting

        //System.out.println((Integer.MAX_VALUE));
        //System.out.println((Integer.MIN_VALUE));

        float f1 = 167.34675F;
        double d1 = f1; //casting - storing a float into a double  - widening

        int i4 =  1;
        byte b4 = (byte)i4; //explicit casting - down-casting - narrowing


int i5 = 2147483647;
double d5 = i5;
        System.out.println(d5);

double d6 = 1;
int i6 = (int)d6;// explicit casting
        System.out.println(d6);



    }
}
