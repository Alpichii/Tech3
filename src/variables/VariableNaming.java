package variables;

import org.w3c.dom.ls.LSOutput;

public class VariableNaming{
    public static void main(String[] args){

        /*
        All variable names starts with lowercase
        It is highly recommended to follow camelcase rule // number of students
        You CANNOT have space in the variable name
        You can only use _ (under score) and $ (dollar sign) in the variable names
        All digits 0-9 can be used in the variable name but not as first character

        Note: in one class, you connot have 2 variables with same exact name
       */

        int numberOfStudents = 15;
        int number = 1_374_627_345;
        double $myBalance = 20.0;

        System.out.println(number);

        int age = 45;
        int Age = 30;
        int AGE = 15;
        int aGe = 20;
        int agE = 7;
        int a_g_e = 45;

    }
}
