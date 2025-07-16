package methods.myStatic;

import java.util.Random;

public class Student {
    // Local variables
    // instance variables - поля класса
    // static variables
    // сигнатура метода -> имя метода + список параметров
    static String schoolName = "Bilimkana";
    public String name;

    static Random random = new Random();

    public static void showInfo() {
        System.out.println("Школа :" + schoolName);
    }

    // есть ли в строке !
    public static boolean containsExclamation(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '!') {
                return true;
            }
        }
        return false;
    }

    //Сумма всех чисел до n
    public static int sumOfNumbers() {
        int n = random.nextInt(100) + 1;
        System.out.println(n);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int maxOfThree(int a, int b , int c) {
        if( a>=b && a>=c){
            return a;
        } else if (b>=a && b>=c) {
            return b;
        }else {
            return c;
        }
    }
}
