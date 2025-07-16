package collection;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        String name = "Akyl";
        int number = 555;

        // создал лист и добавил студентов
        List<String> studentsName = new ArrayList<>();
        studentsName.add("Aida");
        studentsName.add("Akylbai");
        studentsName.add("Sanzhar");
        studentsName.add("Akyl");
        studentsName.add("Akylbek");
        studentsName.add("Akylbek");
        studentsName.add("Akylbek");

        System.out.println(studentsName);

        // получить элемент
        System.out.println(studentsName.get(1));
        System.out.println(studentsName.get(0));

        // удалить по индексу
        System.out.println(studentsName.remove(2));
        System.out.println(studentsName);
        System.out.println(studentsName.add("Sanzhar"));
        System.out.println(studentsName);

        //размер списка ---> size()
        System.out.println(studentsName.size());

        //изменить элемента по индексу --set()
        System.out.println(studentsName.set(1,"Alina"));
        System.out.println(studentsName);

        //проверка--> есть ли элемент
        System.out.println(studentsName.contains("Aidar"));

        //перебор
        for (String names: studentsName) {
            System.out.println(names);
        }
    }


}
