package in.vijaycoding.utils;

import in.vijaycoding.geometry.Circle;
import in.vijaycoding.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5.5);
        Rectangle rectangle1 = new Rectangle(10,5);

        double circleArea = Math.PI * Math.pow(circle1.radius,2);
        int rectangleArea = rectangle1.length * rectangle1.breadth;

        System.out.printf("Area of Circle with radius %.2f is %.2f",circle1.radius,circleArea);
        System.out.printf("\nArea of Rectangle with length %d and breadth %d is %d", rectangle1.length,rectangle1.breadth,rectangleArea);



    }
}
