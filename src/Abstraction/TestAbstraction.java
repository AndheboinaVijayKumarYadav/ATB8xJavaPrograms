package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
       // Vehicle veh = new Vehicle(4) ;

        Car c = new Car();
        c.commute();
        c.makeStartSound();
    }
}
