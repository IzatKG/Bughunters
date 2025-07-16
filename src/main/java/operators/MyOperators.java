package operators;

public class MyOperators {
    public static void main(String[] args) {
    //if-else --> условный оператор
        int age = 15;

        if(age >= 18 ) {
            System.out.println("Вы совершеннолетний!");
        } else {
            System.out.println("Вам еще нет 18 лет!");
        }

        // оценка
        int grade = 86;

        if( grade >= 85 ){
            System.out.println("Отлично!");
        } else if (grade >= 75){
            System.out.println("Хорошо!");
        }else if (grade >= 60){
            System.out.println("Удовлетворительно!");
        }else {
            System.out.println("Неудовлетворительно!");
        }
    }
}
