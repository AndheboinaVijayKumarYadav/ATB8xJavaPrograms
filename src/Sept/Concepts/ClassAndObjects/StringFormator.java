package Sept.Concepts.ClassAndObjects;

public class StringFormator {
    public static void main(String[] args) {
        String name = "Vijay";
        int marks = 69;

        // Due to immutability of string
        // in String pool first My name is created - String 1
        // My name is vijay is created as String 2
        // My name is vijay , I have scored as String 3
        // My name is vijay, I have scored 69 as String 4
        // My name is vijay, I have scored 69 in Maths subject as String 5
        // in Memory these are created as separate strings
        System.out.println("My name is "+ name+", I have scored "+ marks+" in Maths subject");

        // to avoid waste of memory we use format specifiers
        System.out.printf("My name is %s, I have scored %d in Maths subject\n", name,marks);
        // in String pool only String is created i.e.
        // My name is Vijay, I have scored 69 in Maths subject
        System.out.printf("My name is %S, I have scored %d in Maths subject", name,marks);
    }
}
