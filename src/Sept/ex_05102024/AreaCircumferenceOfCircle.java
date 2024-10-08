package Sept.ex_05102024;

import java.util.Scanner;

public class AreaCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("Area of the Circle is %.2f\n", area);

        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of Circle is %.2f", circumference);

        input.close();
    }
}
