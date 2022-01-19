package mutability;

public class mutability {
    public static void main(String[] args) {
        String name = "Jafeth"; // pool
        name += " Alex";
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Alex"); // Alex Jafeth345X
        sb.append(" Jafeth");
        sb.append(345);
        sb.append('X');

        System.out.println(sb);

        System.out.println(new StringBuffer("Hello").reverse());


        System.out.println("\n-------Some StringBuilder and StringBuffer methods------\n");
        //Some StringBuilder and StringBuffer methods
        StringBuilder smth = new StringBuilder();
        smth.append("hello");
        smth.append("123");
        smth.deleteCharAt(0);
        smth.delete(2, 4);
        smth.insert(2, "XXX");
        smth.replace(5, 8, "www");

        System.out.println(smth.reverse());


        // How to convert String to StringBuffer or StringBuilder
        String address = "Chicago";
        StringBuffer addressSB = new StringBuffer(address);
        addressSB.reverse();


        //Convert StringBuffer or StringBuilder back to String -> using toString() method
        String addressReversed = addressSB.toString();
        System.out.println(addressReversed);
    }
}
