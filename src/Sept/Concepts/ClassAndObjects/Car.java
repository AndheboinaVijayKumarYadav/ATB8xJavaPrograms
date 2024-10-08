package Sept.Concepts.ClassAndObjects;

public class Car {
    int noOfWheels;
    String name;
    int noOfDoors;
    String company;

    // Constructor
    public Car(int noOfDoors, int noOfWheels, String name, String company) {
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
        this.name = name;
        this.company = company;
    }

    // We can override the toString Method


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", name='" + name + '\'' +
                ", noOfDoors=" + noOfDoors +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // Creating a reference to class
        Car swift = new Car(4,4,"Swift","Maruthi");

        // calling toString method which is already present by default
        System.out.println(swift.toString());
        // output will be ClassName@Hashcode

        // when we try to print the class also toString method is called by default
        System.out.println(swift);
        // output will be ClassName@Hashcode

    }
}
