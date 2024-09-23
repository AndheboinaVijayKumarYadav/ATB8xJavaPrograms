package Sept.ex_23092024;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 1st number");
        int num1 = input.nextInt();
        System.out.println("Please enter the 2nd number");
        int num2 = input.nextInt();
        System.out.println("Please enter the operation you want perform +/-*%");
        String operation = input.next();

        switch (operation){
            case "+":
                System.out.println("Addition of two numbers is "+ (num1+num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Division of two numbers is " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                }
            case "-":
                System.out.println("Sub of two numbers is "+ (num1-num2));
                break;
            case "*":
                System.out.println("Mul of two numbers is "+ (num1*num2));
                break;
            case "%":
                System.out.println("Modulus of two numbers is "+ (num1%num2));
                break;
            default:
                System.out.println("Please enter the valid operation");
                break;
        }

        input.close();
    }
}
