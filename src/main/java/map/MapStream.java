package map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("Aibek", 30);
        people.put("Babur", 17);
        people.put("Aijan", 22);
        people.put("Zaman", 15);
        people.put("Arayim", 32);
        people.put("Belek", 18);

        people.entrySet().stream()
                .filter(entry -> entry.getValue() > 18)
                .forEach(entry ->
                        System.out.println(entry.getKey()
                        + " is " + entry.getValue()
                        + " years old"));
    }
}