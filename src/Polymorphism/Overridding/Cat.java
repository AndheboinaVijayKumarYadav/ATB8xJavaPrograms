package Polymorphism.Overridding;

public class Cat extends Animal {

    Cat(){
        super();
        System.out.println("Cat constructor");
    }

    @Override
    void sound(){
        super.sound();
        System.out.println("meow meow...");
    }

}
