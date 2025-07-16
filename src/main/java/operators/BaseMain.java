package operators;

import java.util.Random;

public class BaseMain {
    public static void main(String[] args) {
        // switch-case
        Random random = new Random();
        int day = random.nextInt(7)+0;
        System.out.println("Generated day number : " + day);

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                  break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong date number");
        }
    }
}
