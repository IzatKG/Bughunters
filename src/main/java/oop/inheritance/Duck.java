package oop.inheritance;

public class Duck implements Swimmable{
    //полиморфизм
    @Override
    public void fly(String name) {
        System.out.println(name + " летит в теплые края");
    }

    @Override
    public void swim() {
        System.out.println("Mr Duck плавает");
    }
}
