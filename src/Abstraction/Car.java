package Abstraction;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void getSetGo() {
        super.getSetGo();
    }

    @Override
    public void makeStartSound() {
        System.out.println("Abstract method added in parent class is implemented");
    }
}
