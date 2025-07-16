package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
// список, в котором элементы связаны между собой как цепочка

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("яблоко");
        fruits.add("банан");
        fruits.add("вишня");

        fruits.add(1,"слива");

        fruits.addFirst("клубника"); // в начало
        fruits.addLast("ананас"); // в конец

        fruits.removeFirst();
        fruits.removeLast();
        System.out.println(fruits);

        List<Integer> colors = new LinkedList<>();

    }
}
