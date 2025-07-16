package hunters;

//типы данных
public class DataTypes {
    public static void main(String[] args) {
        //переменная - контейнер со значениями

        //примитивные типы-->
        //byte: хранит целое число от -128 до 127 (занимает 1 байт)
        byte a = 5;

        System.out.println(a);

        // short: хранит целое число от -32768 до 32767 (занимает 2 байт)
        short b = 8;
        short k = 327;
        System.out.println(b);

        //int:хранит целое число от -2147483648 до 2147483647 (занимает 4 байт)
        int c = 7;
        System.out.println(c);

        //long:хранит целое число от -9223372036854808 до 9223372036854807 (занимает 8 байт)

        long g = 1;
        System.out.println(g);
        long p = 2;
        System.out.println(p);

        //double: хранит число с плавающей точкой от -+4.9*10-324
        // до -+1.7976931348623157*10308 ( занимает 8 байт)
        double v = 8.5125469887325;

        //float : хранит число с плавающей точкой от -3.4*1038
        // до 3.4*1038 ( занимает 4 байт)
        float x = 78.5456325f;

        //char: хранит одиночный символ
        char d = 'j';
        System.out.println(d);

        //boolean : хранит значение true и false
        boolean isActive = true;
        boolean isAdam = false;
        System.out.println(isActive);
        System.out.println(isAdam);


        //Ссылочный тип --->
        //String --текстовая строка
        String name = "Akyl";
        System.out.println(name);
        System.out.println("Bakyt");
    }
}

