package memoryManagement;

public class Remote {

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " is garbage collected");
    }
}
