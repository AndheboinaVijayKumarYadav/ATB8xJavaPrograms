package Sept.Concepts.ClassAndObjects.Encapsulation;

public class AccessTest {
    public static void main(String[] args) {
        Car swift = new Car();

        // we can provide values to instance variables that are public
        swift.color ="Blue";
        swift.model ="Swift123";

        // default modifier variables can be access within the package
        // if we try to access outside the package it will not grant access
        swift.noOfWheels = 4;

        // we cannot provide values to instance variables that are private
        // to initialize private variables we can user constructor or Getter/Setter methods
        // swift.fuelLevel = "2.3";
        System.out.println(swift);

        Car maruthi = new Car("red","maruthi456",1,10000,4);
        System.out.println(maruthi);
    }
}
