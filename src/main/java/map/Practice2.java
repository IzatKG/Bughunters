package map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice2 {
    //Написать функцию, принимающую на вход Map<String, Integer> persons,
    //имя и возраст.
    //Результат функции имена персон, возраст
    // которых от 18 до 40 в виде List<String>

    public static List<String> filterPersonAge(Map<String, Integer> persons){

        List<String> listOfNames = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : persons.entrySet()){
            int age = entry.getValue();
            if(age >= 18 && age <= 40){
                listOfNames.add(entry.getKey());
            }
        }
        return listOfNames;
    }

    public static void main(String[] args) {

        Map<String,Integer> persons = new HashMap<>();
         persons.put("Mira", 39);
         persons.put("Dana", 17);
         persons.put("Ulan", 40);
         persons.put("Akyl", 19);
         persons.put("Rinat", 50);

        List<String> filteredNames = filterPersonAge(persons);
        System.out.println(filteredNames);
    }
}
