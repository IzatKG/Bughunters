package cycles;

public class Task1 {
    public static void main(String[] args) {
        // таблица умножения на 5
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }

        //Квадрат
        for (int i = 1; i <= 20; i++) {
            System.out.println("Квадрат " + i + "=" + (i * i));
        }

        String text = "Qa Engineer";
        for (int i = 0; i < text.length()-1; i++) {
            System.out.println("Text : " + text.charAt(i));
        }

        String name = "Aktan";
        StringBuilder reversedName = new StringBuilder(name);
        System.out.println(reversedName.reverse());


    }
}
