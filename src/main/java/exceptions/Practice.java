package exceptions;

import org.junit.jupiter.api.Test;

public class Practice {
    public int num;
    public int num1;
    public int result;


    // Throwable ----> Exception---> RuntimeException---> ArithmeticException

    @Test
    public void getArithmeticException() {
        num = 10;
        num1 = 0;

        try {
            result = num / num1;
        } catch (Exception exception) {
            System.err.println("Error: Oshibka");
        } finally {
            System.out.println("Etot block vypolnitsya vsegda");
        }
        System.out.println(result);
    }

    // try {
    //код
    //         } catch(){
    // обработка кода
    //           }finally{
    //           System.out.println("");
    //       }


    @Test
    public void getArrayIndexOutExceptionTest() {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers.length);

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Ty vyahel za ramki massiva");
        }
    }

    @Test
    public void getNullPointerException() {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException exception) {
            System.out.println(" Ty vyzyvaesh null");
        }
    }

    @Test
    public void getException() {
        String text = "1230";
        int number = Integer.parseInt(text);
        System.out.println(number);

        String text1 = "12.30";
        double num = Double.parseDouble(text1);
        System.out.println(num);

        double price = 45.20;
        String priceDouble = String.valueOf(price);
        System.out.println(priceDouble);

        //numberFormatterException
        String text3 = "abcd";
        try {
            int numbers = Integer.parseInt(text3);
        } catch (Exception exception) {
            System.out.println("You can not parse it");
        }
    }
}
