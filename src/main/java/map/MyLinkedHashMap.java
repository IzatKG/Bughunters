package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyLinkedHashMap {
    static LinkedHashMap<String, String> countries;

    //сохраняет порядок добавления элементов
    public static void main(String[] args) {
        countries = new LinkedHashMap<>();
        countries.put("Bishkek", "KG");
        countries.put("Astana", "KZ");
        countries.put("Moskva", "RU");
        countries.put("Parij", "FR");

        System.out.println(countries);
        System.out.println(countries.containsValue("KZ"));
        System.out.println(countries.containsKey("Moskva"));
        System.out.println(countries.remove("Parij"));
        System.out.println(countries);


        // сортировка по ключам
        Map<String, Integer> map = new TreeMap<>();
        map.put("Mers", 21);
        map.put("BMW", 90);
        map.put("Lexus", 57);
        map.put("Lada", 10);
        // map.put(null, 15); не принимает null ключи

        System.out.println(map);
    }
}
