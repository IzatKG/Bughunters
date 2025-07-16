package oop.inheritance;

public class Traktor implements Vehicle{

    @Override
    public void start() {
        System.out.println("TYR-TYR-TYR");
    }

    @Override
    public void stop() {
        System.out.println("Traktor stopped");
    }
}
