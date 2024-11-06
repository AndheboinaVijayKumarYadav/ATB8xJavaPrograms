package enums;

public class Testingenums {
    public static void main(String[] args) {
        Grade grade = Grade.A;
        // below line is not possible we can assign only values declared in enum grade class
        // grade = Grade.Z;
        // grade ="B";
        // basically convert the value to enum
        Grade grade1 = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}
