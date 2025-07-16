package oop.abstracts;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.sayHello();
        shape.print("Default");
        ExampleInterface.staticMethod();

    }
}
