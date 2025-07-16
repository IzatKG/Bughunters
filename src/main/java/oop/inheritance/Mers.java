package oop.inheritance;

public class Mers implements Vehicle{

    //переопределение
    @Override
    public void start() {
        System.out.println("Mers завелась, woon-woon!");
    }

    @Override
    public void stop() {
        System.out.println("Mers stopped");
    }


}
