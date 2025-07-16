package stringBuilder;

import methods.Person;

public class MyStringBuilder {
    public static void main(String[] args) {
       //mutable(изменяемый)
        StringBuilder sbr = new StringBuilder("Hello");
        //append() - добавить

        sbr.append("World ");
        System.out.println(sbr);

        //insert()-вставка
        sbr.insert(5, ",");
        sbr.insert(12, "!!!");
        sbr.insert(12, "Hi");
        System.out.println(sbr);

        //delete()- удаления
        System.out.println(sbr.delete(3,6));

        //reverse() - перевернуть
        StringBuilder name = new StringBuilder("Aydin");
        name.reverse();
        System.out.println(name);

        String name1 = "Bakyt";
        StringBuilder reversedName = new StringBuilder(name1);
        reversedName.reverse();
        System.out.println(reversedName);
    }
}
