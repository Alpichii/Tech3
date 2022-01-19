package expections;

import java.util.Map;
import java.util.TreeMap;

public class TryCatchPractice2 {
    public static void main(String[] args) {
        // 11.28 class video
        int num = 10;
        try {
            System.out.println(num / 0);//StringIndexOutOfBoundsException - IndexOutOfBoundsException - Exception

        } catch (Exception exception) {
            System.out.println("The exception caught : " + exception.getMessage());
        }

        /*
        Create a TreeMap to store below data
        FirstName = Alex
        LastName = Robert
        PhoneNumber = +1 (312) 123-1234
        Address = Dallas TX
        Id = 123abcd
        null = 1234
        Try printing each entry using for each loop
        Catch any error and give message as "Error caught while processing data " + errorMessage
        */

        try{
            //1. Create TreeMap object
            Map<String, String> userInfo = new TreeMap<>();

            //2. put key value pairs in the created object
            userInfo.put("FirstName", "Alex");
            userInfo.put("LastName", "Robert");
            userInfo.put("PhoneNumber", "+1 (312) 123-1234");
            userInfo.put("Address", "Dallas TX");
            userInfo.put(null, "123"); // NullPointerException

            //3. print each key and value pair
            for(Map.Entry<String, String> entry : userInfo.entrySet()){
                System.out.println("Key = " + entry.getKey() + " --- " + "Value = " + entry.getValue());
            }
        }
        catch (Exception e){
            System.out.println("Error caught while processing data : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
    
    
    
    
    


    
    
    
    

