package map;

import java.util.HashMap;
import java.util.Map;

public class Practise3 {
    public static void main(String[] args) {
        // каждый ключ уникален
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Lexus");
        map.put(1,"BMW"); // перезаписывается
        map.put(3,"Audi");
        map.put(4,"Mers");

        System.out.println(map);


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"Lexus");
        map1.put(2,"BMW"); // перезаписывается
        map1.put(3,"Audi");
        map1.put(4,"Mers");
        map1.put(5,"Mers");

        System.out.println(map1);



        Map<String, Integer> ages = new HashMap<>();
        ages.put(null, 30);
        ages.put(null, 22);
        ages.put("Uulkan", 25);
        ages.put("Tilek", 24);
        ages.put("Meder", 24);

        System.out.println(ages);
    }


}
