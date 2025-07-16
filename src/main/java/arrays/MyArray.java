package arrays;

public class MyArray {
    public static void main(String[] args) {

        double [] prices = {9.99, 15.2, 20.0, 14.1};
        System.out.println("Второй элемент внутри массива : " + prices[1]);
        System.out.println("Последний элемент в массиве :" + prices [prices.length-1]);

        for (double price: prices) {
            System.out.println("Цена :" + price);
        }

        // массив символов
        char [] symbols = {'A','B','C','H'};
        for (char symbol:symbols) {
            System.out.println("Буквы :" + symbol);
        }

        for(int i = symbols.length-1; i >=0; i-- ){
            System.out.println("В обратном порядке :" + symbols[i]);
        }

        boolean [] passedTest = {true, false, false, true};
        for (boolean test: passedTest) {
            System.out.println(test);
        }
    }
}
