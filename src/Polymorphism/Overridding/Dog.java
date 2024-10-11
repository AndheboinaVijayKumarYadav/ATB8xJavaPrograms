package Polymorphism.Overridding;

public class Dog extends Animal{

    Dog(){
        super();
    }

    @Override
    void sound() {
        System.out.println("Boew boew...");
    }
}
