package expections;

public class TestPermissions {
        public static void main(String[] args) {
            Permissions permission = new Permissions();

            permission.checkAge(19);

            try{
                permission.checkAge(15);
            }
            catch (Exception e){
                System.out.println("Exception caught : " + e.getMessage());
            }


            try{
                permission.checkIn(345);
            }
            catch (Exception e){
                System.out.println("Exception caught : " + e.getMessage());
            }
            System.out.println("End of the program!");
        }
    }

