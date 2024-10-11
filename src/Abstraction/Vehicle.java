package Abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTires;

    // implementing the interface Transport method getSetGo


    @Override
    public void getSetGo() {
        System.out.println("Method declared in Transport is implemented in vehicle");
    }

    // abstract method where child classes either they should implement this method or make themselves as abstract
    public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("going.....");
    }
}
