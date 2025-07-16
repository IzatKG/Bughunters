package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Aida", "UUlkan", "Akyl", "Akylbay", "Tilek");
        List<String> sortedNames = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                sortedNames.add(name.toUpperCase());
            }
        }
        System.out.println(sortedNames);


        //stream() ---> создает поток из коллекции
        // filter() ---> фильтрует элементы
        // map() ---> преобразует элементы
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Stream API " + result);


        List<Integer> numbers = Arrays.asList(4, 5, 7, 2, 6, 9);
        List<Integer> evenNums = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .map(n -> n / 2)
                .toList();

        System.out.println("Even numbers " + evenNums);


        //dictinct() - удаляет дубликаты
        List<String> words = List.of("Tv", "Copy", "Apple", "Tv", "Samsuns", "Redmi", "Redmi");
        List<String> bezDuplicatov = words.stream()
                .distinct()
                .toList();
        System.out.println(bezDuplicatov);


        // count()-Uulkan
        // sorted()-Aida
        // anyMatch()-Akyl
        // allMatch()-Akylbai
        // forEach()-Akylbai
        // limit()-Akyl
    }
}
