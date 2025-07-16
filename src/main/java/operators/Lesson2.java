package operators;

import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        // Тернарный оператор - < условие> ? <true> : <false>

        int age = 17;
        String result = (age >= 18) ? "Взрослый" : "Несовершеннолетний";
        System.out.println(result);
        System.out.println((age >= 18) ? "Взрослый" : "Несовершеннолетний");

        int a = 5;
        int b = 6;
        int max = (a>b)? a : b;
        System.out.println(max);

        Random random = new Random();
        int num = random.nextInt(100)+1;;
        System.out.println("Random number : " + num);
        String res = (num % 2 == 0)? "Четное" : "Нечетное";
        System.out.println(res);
    }
}
