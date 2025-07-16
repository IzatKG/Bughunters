package collection;

import java.util.HashSet;
import java.util.Set;

public class FruitsMain {
    public static void main(String[] args) {
        Fruits lemon = new Fruits("lemon");

        Set<Fruits> newFruits =new HashSet<>();
        newFruits.add(new Fruits("Banana"));
        newFruits.add(new Fruits("cherry"));
        newFruits.add(new Fruits("apple"));
        newFruits.add(lemon);

        System.out.println(newFruits);
    }
}
