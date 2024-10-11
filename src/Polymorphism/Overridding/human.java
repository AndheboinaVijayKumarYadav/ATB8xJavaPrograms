package Polymorphism.Overridding;

public class human extends Animal {
    human(){
        super();
    }

    @Override
    void sound() {
        System.out.println("I am human I can make any sound");
    }
}
