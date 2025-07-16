package cycles;

public class FizzBuzz {
    // если число делится на 3 без остатков ---> Fizz
    // если число делится на 5 без остатков ---> Buzz
    // если число делится на 3 и 5 без остатков ---> FizzBuzz
    public static void main(String[] args) {

        String text = "Java is amazing!";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Количество символов 'a': " + count);
    }
}
