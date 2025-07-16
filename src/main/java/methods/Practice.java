package methods;

public class Practice {
     private void printSum(int a, int b){
         int sum = a+b;
         System.out.println("Sum of two numbers :" + sum);
     }

     public void checkAge(int age){
         printSum(10,10);
         if(age<0){
             System.err.println("ERROR");
         } else if (age < 18) {
             System.out.println("Ты еще несовершеннолетний");
         } else if (age < 60) {
             System.out.println("Ты взрослый человек");
         } else  {
             System.out.println("Пенсионер");
         }
     }

     protected void checkEvenOdd() {
         for (int i = 1; i <= 20; i++) {
             if (i % 2 == 0) {
                 System.out.println("Четное");
             } else {
                 System.out.println("Нечетное");
             }
         }
     }

    public static void main(String[] args) {
        Practice object = new Practice();
        object.printSum(8,20);
    }
}
