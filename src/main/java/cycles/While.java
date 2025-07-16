package cycles;

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // while
        int x = 0;
        while (x < 7) {
            System.out.println(x);
            x++;
        }

        int n = 20;
        while (n > 0) {
            System.out.println(n);
            n--;
        }

        Scanner scan = new Scanner(System.in);
        String text = "";

        while (!text.equals("exit")) {
            System.out.println("Введите что-нибудь(или 'exit')");
            text = scan.nextLine();
        }
        System.out.println("Выход из программы");


        Random random = new Random();
        int roll = 0;
        while (roll != 6){
            roll = random.nextInt(6)+1;
            System.out.println("Выпало :" +roll);
        }
        System.out.println("Выпала шестерка!");
    }
}