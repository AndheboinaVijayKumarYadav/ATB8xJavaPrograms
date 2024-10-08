package Sept.Concepts.ClassAndObjects.Encapsulation;

public class Car {

    public String color;
    public String model;

    private double fuelLevel;
    private double costOfPurchase;

    int noOfWheels;

    Car(){

    }

    // parameterized constructor
    public Car(String color, String model, double fuelLevel, double costOfPurchase, int noOfWheels) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }
}
