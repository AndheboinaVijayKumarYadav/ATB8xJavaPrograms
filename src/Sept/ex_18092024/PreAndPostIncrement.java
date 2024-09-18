package Sept.ex_18092024;

public class PreAndPostIncrement {
    public static void main(String[] args) {
//        int a = 10;
        // System.out.println(a++ + a); output is 21
//
//        int a = 10;
//        System.out.println(--a + a-- + a);  // No syntax error
//        System.out.println(a);
//        int a = 10;
//        System.out.println(  --a + a++ + a--);
//        System.out.println(a);
        int a = 10;
        System.out.println(  a-- + a--  + a--);
        System.out.println(a);
    }
}
