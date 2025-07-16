package string;

public class MyString {

    public static void main(String[] args) {
        // immutable (неизменяемый)
        String name = "Tom";
        String lastName = "Smith";
        String fulName = name + " " + lastName;
        System.out.println(fulName);

        //length()- количество символов в строке
        int length = lastName.length();
        System.out.println("Количество символов :" + length);

        //charAt() - получить символ по индексу
        //             0123
        String text = "Java";
        System.out.println(text.charAt(0));

        //substring()-возвращает часть строки
        String text1 = "Hello world";
        System.out.println("Substring :" + text1.substring(3));
        System.out.println("Substring :" + text1.substring(5));
        System.out.println("Substring :" + text1.substring(6));
        System.out.println("Substring :" + text1.substring(2, 7));
        System.out.println("Substring :" + text1.substring(0, 6));

        //concat()-склеивания
        String str = "Aida";
        String str1 = "Akeleeva";
        System.out.println(str.concat(" ").concat(str1));


        //equals()-сравнения содержимого строк
        String a = "Aktan"; //--->String pool
        String b = "Aktan";
        String c = new String("Aktan");
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a == b);


        String text2 = new String("Java");
        String text3 = new String("Java");

        System.out.println(text2.equals(text3));
        System.out.println(text2 == text3);

        //replace()-заменить
        String st = " I like Java";
        String newText = st.replace("Java", "Python");
        System.out.println(newText);

        String changed = st.replace('a','e');
        System.out.println(changed);

        //indexOf() - ищет позицию символа
        String sk = "I know Java";
       // int indexA = sk.indexOf('a');
        System.out.println(sk.indexOf('a'));
        System.out.println(sk.indexOf("Java"));

        //contains()-содержится ли в строке определенный символ или подстрока
        System.out.println(sk.contains("Java"));
        System.out.println(sk.contains("Python"));
        System.out.println(sk.contains("t"));

        //startWith()-проверяет начинается ли строка с определенного символа или текста
        System.out.println(sk.startsWith("I"));
        System.out.println(sk.startsWith("i"));

        //endWith()-
        System.out.println(sk.endsWith("Java"));
        System.out.println(sk.endsWith("t"));
    }
}
