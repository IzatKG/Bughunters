package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PractiseSet {
    public static void main(String[] args) {

        //Set -не принимает дубликаты
        // порядок может быть любым
        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Kia");
        cars.add("Audi");
        cars.add("Kia");

        System.out.println(cars);

        for (String car: cars){
            System.out.println(car);
        }

        System.out.println("++++++++++++++++++++++++++++++++++");


        //сохранят порядок добавления элементов
        LinkedHashSet<String> myCars = new LinkedHashSet<>();
        myCars.add("Toyota");
        myCars.add("Lexus");
        myCars.add("Kia");
        myCars.add("Audi");
        myCars.add("Kia");

        System.out.println(myCars);

        System.out.println("++++++++++++++++++++++++++++");
        // сортировка по алфавиту/числам
        Set<String> listOfCars = new TreeSet<>();
        listOfCars.add("Toyota");
        listOfCars.add("Lexus");
        listOfCars.add("Kia");
        listOfCars.add("Audi");
        listOfCars.add("Audi");

        System.out.println(listOfCars);
        listOfCars.remove("Kia");
        listOfCars.add("Mers");
        System.out.println(listOfCars);
        System.out.println(listOfCars.isEmpty());
        listOfCars.clear();

        System.out.println(listOfCars);
        System.out.println(listOfCars.isEmpty());
    }
}
