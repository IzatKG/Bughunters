package map;

import java.util.HashMap;
import java.util.Map;

public class Practise {
    public static void main(String[] args) {
        // Map -структура данных принимает в себе пар ключ-значения

        Map<String, Integer> ages = new HashMap<>();
        ages.put("Bakyt", 30);
        ages.put("Aida", 22);
        ages.put("Uulkan", 25);
        ages.put("Tilek", 24);
        ages.put("Meder", 24);

        System.out.println(ages);

        // получить значение по ключу
        System.out.println(ages.get("Bakyt"));
        System.out.println(ages.get("Tilek"));

        // получить все ключи
        System.out.println(ages.keySet());

        //получить все значения
        System.out.println(ages.values());

        //remove() -удаляет запись по ключу
        System.out.println(ages.remove("Meder"));
        System.out.println(ages);

        // containsKey()- проверить наличие ключа
        System.out.println(ages.containsKey("Aida"));

        // containsValue()- проверить наличие значения
        System.out.println(ages.containsValue(22));

        // количества пар (общий размер мапа)
        System.out.println(ages.size());

        // clear()-удалить все
        //ages.clear();
       // System.out.println(ages);

        // перебор только ключей
        for(String name: ages.keySet()){
            System.out.println(name);
        }

        // перебор только значений
        for(int value: ages.values()){
            System.out.println(value);
        }

        //перебор всех пар
        for(Map.Entry<String, Integer> entry : ages.entrySet()){
            System.out.println(entry.getKey() + "---> " + entry.getValue());
        }

    }
}
