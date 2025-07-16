package operators;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // && - и (дабл амперсант)
        // ||- или ( дабл пайплайн)
        int age = 17;
        boolean hasPassport = true;

        if (age >=18 && hasPassport){
            System.out.println("Доступ разрешен");
        }else {
            System.out.println("Доступ запрещен");
        }

        Random random = new Random();
        //случайное число от -10 до 10
        int number = random.nextInt(21)-10;
        System.err.println("Сгенерировано число : " + number);

        if (number >0){
            System.out.println("Положительное число");
        }else if (number < 0){
            System.out.println("Отрицательное число");
        }else {
            System.out.println("Это ноль");
        }

        int generatedNumber = random.nextInt(10) + 1;
        System.err.println("Сгенерировано число : " + generatedNumber);

        int guess = 5;

        if(guess == generatedNumber){
            System.out.println("Угадал");
        }else {
            System.out.println("Не угадал");
        }

        int temp = random.nextInt(40)-10;
        System.err.println("Температура : " + temp + " °C");

        if (temp < 0){
            System.out.println("Мороз");
        }else if (temp <=15){
            System.out.println("Прохладно");
        }else {
            System.out.println("Жарко");
        }
    }
}
