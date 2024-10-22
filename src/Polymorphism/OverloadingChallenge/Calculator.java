package Polymorphism.OverloadingChallenge;

public class Calculator {

    public Calculator() {
    }

    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b+ c;
    }

    double add(double a, double b, double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int sum = cal.add(4,5);
        double sum1 = cal.add(2.3,4.5,6.7);
        System.out.printf("Sum of two numbers is %d", sum);
        System.out.printf("\nSum of two numbers is %.2f", sum1);
    }
}
