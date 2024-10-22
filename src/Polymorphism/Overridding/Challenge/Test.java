package Polymorphism.Overridding.Challenge;

public class Test {
    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        veh.service();

        System.out.println(" below is curring the car class service");
        Car car = new Car();
        car.service();
    }
}
