package operators;

import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inter first number :");
        int num = scan.nextInt();

        System.out.print("Inter second number :");
        int num2 = scan.nextInt();

        scan.nextLine();
        int result;
        System.out.print("Actions :");
        String action = scan.nextLine();

        switch (action){
            case "-" :
                result = num - num2;
                System.out.println("Result :" +result);
                break;
            case "+" :
                result = num + num2;
                System.out.println("Result :" +result);
                break;
            case "*" :
                result = num * num2;
                System.out.println("Result :" +result);
                break;
            case "/" :
                if(num2 != 0) {
                    result = num / num2;
                    System.out.println("Result :" +result);
                }else{
                    System.out.println("You can not divide by zero!");
                }
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
