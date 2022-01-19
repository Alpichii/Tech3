package expections;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String school = "TechGlobal";
        }
        catch (Exception e){
            System.out.println("Expection caught : " + e.getMessage());
        }
        finally{// will execute only if there is exception
            System.out.println("This is my last code of block");
        }

        System.out.println("\n===========Another Logic-===========\n");
        try {
            String school = "TechGlobal";
            System.out.println(school.charAt(15));
        }
        finally{// will execute only if there is exception
            System.out.println("This is my last code of block");
        }

    }
}
