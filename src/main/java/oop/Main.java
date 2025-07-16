package oop;

import static oop.Animal.speak;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", "Scotish Fold", 6);
        System.out.println("Name :" + cat.getName());
        System.out.println("Paroda :" + cat.getParoda());
        System.out.println("Weight : " + cat.getWeight());

        cat.setName("Мурзик");
        cat.setWeight(4);
        System.out.println(cat);

        Animal.speak();
        speak();

    }
}
