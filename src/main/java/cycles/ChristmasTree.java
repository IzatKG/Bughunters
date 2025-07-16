package cycles;

public class ChristmasTree {
        public static void main(String[] args) {
            int height = 5; // высота елки

            for (int i = 1; i <= height; i++) {
                // печатаем пробелы
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }
                // печатаем звездочки
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                // перенос строки
                System.out.println();
            }
        }
    }

