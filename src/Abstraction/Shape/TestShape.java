package Abstraction.Shape;

public class TestShape {
    public static void main(String[] args) {
        // below code will throw error because abstract class cannot be instantiated
        // Shape sh = new Shape();
        Circle cir = new Circle(3.4);

        System.out.printf("Area of the circle with radius %.2f is %.2f",cir.getRadius(),cir.calculateArea());
    }
}
