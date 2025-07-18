package collection;

import java.util.*;

public class Testirovanie {
    public static void main(String[] args) {

        // Spisok studentov na kurse po QA
        ArrayList<String> students = new ArrayList<>();
        students.add("Akylbai");
        students.add("Aktan");
        students.add("Akyl");
        students.add("Akylbek");
        students.add("Aida");
        students.add("A");
        students.add("Aijan");
        students.add("Bakyt");
        students.add("Bekjan");
        students.add("Uulkan");
        students.add("Sanjar");
        students.add("Alina");
        students.add("Oleg");
        System.out.println(students);

        // kol'ichestvo studentov
        System.out.println("kol'ichestvo studentov: " + students.size());

        // est' li student Akylbai
        System.out.println("est' li student Akylbai? " + students.contains("Akylbai"));

        // sobrat v novai spisok imeni nachinayishie na "A"
        List<String> listA = students.stream()
                .filter(n -> n.startsWith("A"))
                .toList();
        System.out.println(listA);

        // podnyat vse imena na VVERHNI registr
        List<String> nameUpper = students.stream()
                .map(n  -> n.toUpperCase())
                .toList();
        System.out.println(nameUpper);

        // perebirat spisok
        for (String spisok : students){
            System.out.println(spisok);
        }

        // priobrazovat v set
        Set<String> setStudents = new HashSet<>(students);
        System.out.println(setStudents);

        // imena bol'she 5 simfolov
        List<String> name5 = students.stream()
                .filter(n -> n.length() > 5)
                .toList();
        System.out.println(name5);




    }
}
