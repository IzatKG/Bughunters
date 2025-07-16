package oop.inheritance;

public interface Swimmable {
    static final String NAME = "Duck";

    void fly(String name);

    default void swim(){
        System.out.println(NAME + "плавает");
    }
}
