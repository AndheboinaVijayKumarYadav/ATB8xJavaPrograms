package Sept.ex_13092024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the first number");
        int num2 = input.nextInt();

        System.out.println("Addition of two number is "+ (num1 + num2));
        System.out.println("Multiplication of two number is "+ (num1 * num2));
        System.out.println("Division of two number is "+ (num1 / num2));
        System.out.println("Modulus of two number is "+ (num1 % num2));
    }
}
