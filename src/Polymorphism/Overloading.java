package Polymorphism;

public class Overloading {

    public static int sum(int a, int b){
        return a+b ;
    }

    public static String sum(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(Overloading.sum(a,b));
        String name = "manasa";
        String location = " Hyderabad";

        System.out.println(Overloading.sum(name,location));

    }
}
