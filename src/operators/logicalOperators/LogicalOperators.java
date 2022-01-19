package operators.logicalOperators;

import org.w3c.dom.ls.LSOutput;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b1 = 5 > 3 && 2 > 0; // true AND true -> true
        System.out.println(b1);

        boolean b2 = 3 == 5 || 4 >= 5; //
        System.out.println(b2);

        boolean b3 = true == true && false != true;
        System.out.println(b3);

        boolean b4 = !true || !false;
        System.out.println(b4);

        boolean b5 = true || false && true;
        System.out.println(b5);

        boolean b6 = (!false || false) && (!false || true);

    }
}
