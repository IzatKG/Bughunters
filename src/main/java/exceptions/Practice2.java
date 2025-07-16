package exceptions;

public class Practice2 {
    public static void main(String[] args) {
        try {
            String number = null;
            int result = Integer.parseInt(number);
            int x = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (NullPointerException e) {
            System.out.println("Строка была null");
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так!!!");
        }finally {
            System.out.println("FINALLY");
        }



       // Поменять местами две переменные
        int a = 3;
        int b = 8;

        int conteiner = a;
        a = b;
        b = conteiner;

        System.out.println(a);
        System.out.println(b);
    }
}
