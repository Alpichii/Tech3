package memoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

        Remote remote1 = new Remote();
        Remote remote2 = new Remote();

        System.out.println("\nBefore reassigning\n");
        System.out.println(remote1); // location -> @6ff3c5b5
        System.out.println(remote2); // location -> @3764951d


        System.out.println("\nAfter reassigning\n");
        remote1 = remote2; // remote1 object is losing reference and garbage collected
        System.gc(); // Explicitly calling garbage collection 1st way

        System.out.println(remote1); // @3764951d
        System.out.println(remote2); // @3764951d

        System.out.println("\nANOTHER EXAMPLE\n");

        Phone phone1 = new Phone();
        System.out.println(phone1); // @4b1210ee

        phone1 = null; // Garbage collection happens implicitly
        Runtime.getRuntime().gc(); // 2nd way of calling garbage collection explicitly

        System.out.println(phone1);
    }
}