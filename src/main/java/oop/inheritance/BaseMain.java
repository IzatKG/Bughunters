package oop.inheritance;

public class BaseMain {

    public static void main(String[] args) {
        Mers mers = new Mers();
        mers.start();
        mers.stop();

        Traktor traktor = new Traktor();
        traktor.start();
        traktor.stop();

        Duck duck = new Duck();
        duck.fly("Mr Duck");
        duck.swim();

        Dog dog = new Dog();
        dog.fly("Reks");
    }
}
