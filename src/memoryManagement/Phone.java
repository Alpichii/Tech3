package memoryManagement;

public class Phone {

    @Override
    protected void finalize() throws Throwable {
        //Some code to do proper clean up
        System.out.println(this + " is garbage collected!!!");
    }
}
