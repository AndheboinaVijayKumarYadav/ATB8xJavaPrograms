package Sept.Concepts.ClassAndObjects.GetterSetterTest;

import Sept.Concepts.ClassAndObjects.Encapsulation.GetterSetter.Car;

public class AccessTest {
    public static void main(String[] args) {
        Car maruthi = new Car("Red","maruthi500",4,60000);

        System.out.println(maruthi.getColor());
    }
}
