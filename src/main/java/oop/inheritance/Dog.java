package oop.inheritance;

public class Dog implements Swimmable, MyInterface, Vehicle{

    @Override
    public void fly(String name) {
        System.out.println(name + " not fly");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }


}
