package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        /*
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();
        Driver driver3 = new Driver();

        System.out.println(driver1); // @6ff3c5b5
        System.out.println(driver2); // @3764951d
        System.out.println(driver3); // @4b1210ee

        Driver driver1 = Driver.getDriver();
        Driver driver2 = Driver.getDriver();
        Driver driver3 = Driver.getDriver();

        System.out.println(driver1); //@6ff3c5b5
        System.out.println(driver2); //@6ff3c5b5
        System.out.println(driver3); //@6ff3c5b5
        */

        Diamond d1 = Diamond.getDiamond();
        Diamond d2 = Diamond.getDiamond();
        Diamond d3 = Diamond.getDiamond();
        Diamond d4 = Diamond.getDiamond();
        Diamond d5 = Diamond.getDiamond();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}