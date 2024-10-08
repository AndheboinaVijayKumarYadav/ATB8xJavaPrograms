package Sept.ex_05102024;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the String1: ");
        String s1 = input.nextLine();

        System.out.println("Please enter the String2: ");
        String s2 = input.nextLine();

        String s3 = s1+" "+s2;

        String result = s1.concat(" ").concat(s2);

        System.out.println("String after concat is "+ result.toUpperCase());
        System.out.printf("String after concat using string format specifier is %S", s3);



    }
}
