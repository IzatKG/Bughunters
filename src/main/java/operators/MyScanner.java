package operators;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль :");
        String role = scanner.nextLine();
        System.out.print("Введите пароль :");
        String password = scanner.nextLine();
        if (role.equals("Admin") && password.equals("123456")){
            System.out.println("Операция успешно");
        }else {
            System.err.println("System error");
        }

//        System.out.println("What is your name ?");
//        String name = scanner.nextLine();
//        System.out.println("How old are you ?");
//        int age = scanner.nextInt();
//        System.out.println("Hi, " +name + " welcome " + " are you really " + age + " year?");
    }
}
