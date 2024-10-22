package Polymorphism.Overridding.Challenge;

public class Car extends Vehicle{
    Car(){
        super();
        System.out.println("I am car constructor");
    }

    @Override
    void service() {
        super.service();
        System.out.println("I am a Car service provider i.e. child");
    }
}
