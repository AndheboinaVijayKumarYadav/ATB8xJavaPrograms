package Sept.ex_18092024;

public class WideningNarrowingConcept {
    public static void main(String[] args) {
        // Example for widening with Implicit and explicit is
// implicit
        byte b1 = 13;
        int a = b1;
// explicit
        byte b = 15;
        int a1 = (int) b;
        //Example for Narrowing with Implicit and explicit is
// implicit
        int a2 = 89;
       // byte b4 = a2; // this will throw the error as implicit is not possible narrowing
// Explicit
        int a3 = 100;
        byte b3 = (byte) a3; // Narrowing explicit is possible but loss of data will happen
    }
}
