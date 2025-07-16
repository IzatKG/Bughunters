package methods.myStatic;

import static methods.myStatic.Student.maxOfThree;

public class Main {
    public static void main(String[] args) {
        Utils.sayHello();
        System.out.println(Utils.count);

        System.out.println("Школа всех студентов :" + Student.schoolName);

        Student.showInfo();
        System.out.println(Student.containsExclamation("Welcome to School!"));
        System.out.println("Сумма всех чисел : " + Student.sumOfNumbers());

        System.out.println(maxOfThree(78,12,13));
    }
}
