package casting;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        /*
        boxing = autoboxing
        Autoboxing is known as storing primitive type into object/wrapper class
         */

        int age =  45;
        Integer objectAge = age; // autoboxing

        Double objectDouble = 23.45;
        double d = objectDouble; // unboxing

        Character objectC = 'C';
        char c = objectC;   //unboxing

        System.out.println(age);
        System.out.println(objectAge);





    }
}
