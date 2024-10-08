package Sept.Concepts.ClassAndObjects.Encapsulation.GetterSetter;

public class Car {
    private String color;
    private String model;
    private int noOfWheels;
    private long costOfPurchase;

    public Car(String color, String model, int noOfWheels, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.noOfWheels = noOfWheels;
        this.costOfPurchase = costOfPurchase;
    }

    // getter for color
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getNoOfWheels(){
        return this.noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels){
        this.noOfWheels = noOfWheels;
    }
}
