package arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        // arrays -массивы
        // структура данных, который хранить в себе набор элементов одного типа

        int[] numbers = {2, 4, 5, 8};
        System.out.println("Первый элемент в массиве :" + numbers[0]);
        System.out.println("Второй элемент в массиве :" + numbers[1]);
        System.out.println("Третий элемент в массиве :" + numbers[2]);
        System.out.println("Четвертый элемент в массиве :" + numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("++++++++++++++++++++++++++++++++++");

        int[] nums = new int[6];
        nums[0] = 5;
        nums[1] = 17;
        nums[2] = 30;
        nums[3] = 6;
        nums[4] = 12;
        nums[5] = 55;

        // for-each цикл
        for (int num : nums) {
            System.out.println(num);
        }

        //найти сумму всех элементов массива
        int[] dates = {1, 20, 14, 25, 6};
        System.out.println(sumOfArray(dates));


        String  [] fruits = {"banana", "orange", "mango", "kiwi", "watermelon"};
        System.out.println(fruits[0]);
        System.out.println(fruits[fruits.length-1]);

        for (String korzinka:fruits) {
            System.out.println(korzinka);
        }

        //развернуть массив
        for (int i = fruits.length-1; i >=0; i--) {
            System.out.println("Перевернутый массив : " + fruits[i]);
        }

        int [] arr = {10,3,8,15,16};
        for (int bucket: arr) {
            if(bucket >=10){
                System.out.println(bucket);
            }
        }

    }

    public static int sumOfArray(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum = sum + n;
        }
        return sum;
    }
}
