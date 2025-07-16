package cycles;

public class Main {
    public static void main(String[] args) {
        // постфиксный инкремент a++

        int c = 3;
        System.out.println(c++);
        System.out.println(c);

        //префиксный инкремент ++a
        int b = 5;
        System.out.println(++b);
        System.out.println(b);


        // постфиксный декремент a--
        int n = 8;
        System.out.println(n--);//8
        System.out.println(n);//7

        // префиксный декремент --a
        int k = 10;
        System.out.println(--k);
        System.out.println(k);

      //  цикл for
        // for(инициализация;условие; итерация){ тело цикла }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++=");
        for (int i = 1; i <=5; i++){
            System.out.println(i);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        for (int i =1; i <=20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }


        System.out.println("________________________________________________");
        for (int l = 10; l >=1; l-- ){
            System.out.println("Обратный отсчет : " +l);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        // сумма чисел от 1 до 100
        int sum = 0;
        for (int i = 1; i <=100; i++){
            sum = sum +i;
            // 1 + 2 +3+ 4+ 5+ 6+ 7+ ......+ 100
        }
        System.out.println("Сумма от 1 до 100 = " + sum);


    }
}
