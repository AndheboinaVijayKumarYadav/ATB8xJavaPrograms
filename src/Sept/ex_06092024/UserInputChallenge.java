package Sept.ex_06092024;

import java.util.Scanner;


public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter your name ");
        String userName = Input.nextLine();
        System.out.println("Welcome " + userName +" to Java Learning Path");
        System.out.println("Please enter a number ");
        int num1 = Input.nextInt();
        System.out.println("Please enter another number");
        int num2 = Input.nextInt();
        int result = num1 + num2;
        System.out.println("Magic the addition of two numbers you entered is "+ result);

    }
}
