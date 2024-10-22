package WrapperClasses;

public class Demo {
    public static void main(String[] args) {
        //  not allowed
        //  Integer first = new Integer(44);

        Integer first = Integer.valueOf(55);
        System.out.println(first);

        // automatic conversion right value is converted to object by Java
        Integer second = 55;
        Integer third = Integer.valueOf("56");
        System.out.println(third);

        // this is allowed
        Integer fourth = null;

        // Autoboxing - automatic conversion from primitive to wrapper
        Integer fifth = 34;
        System.out.println(fifth);

        // Unboxing - automatic conversion from wrapper to primitive
        int num = fifth;



    }
}
