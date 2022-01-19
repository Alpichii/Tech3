package singleton;

public class Driver {

    private static final Driver driver = new Driver();

    private Driver(){

    }

    public static Driver getDriver(){
        return driver;
    }
}