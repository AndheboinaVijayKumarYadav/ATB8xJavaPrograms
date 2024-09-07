package Sept.ex_06092024;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter your name ");
        String userName = Input.nextLine();
        System.out.println("Thanks for joining the Course " + userName);
        System.out.println(userName + " Please tell me your age");
        int userAge = Input.nextInt();
        System.out.println("Your age is " + userAge);
    }
}
