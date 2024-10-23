package ExceptionAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.println("Please enter two numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        try{
            int result = num1/num2;
            System.out.printf("Division of two numbers %d/%d is %d",num1,num2,result);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by Zero is not possible");
        }
        catch (Exception e){
            System.out.println(e);
        }

        // we can use | in catch instead of writing multiple catches
        try{
            int result = num1/num2;
            System.out.printf("Division of two numbers %d/%d is %d",num1,num2,result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Divide by Zero is not possible");
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
