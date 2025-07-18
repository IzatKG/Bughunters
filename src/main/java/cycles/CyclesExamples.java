package cycles;

import java.util.Scanner;

// цикл For
public class CyclesExamples {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Число: " + i);
        }
  // цикл while


            Scanner scanner = new Scanner(System.in);
            int number;

            System.out.println("Введите число (0 для выхода):");
            number = scanner.nextInt();

            while (number != 0) {
                System.out.println("Вы ввели: " + number);
                System.out.println("Введите число (0 для выхода):");
                number = scanner.nextInt();
            }

            System.out.println("Программа завершена.");
    }
}
