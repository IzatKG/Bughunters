package methods.returnMethod;

public class Practice {
    // return - что-то возвращает -число,строка,булевое значение...
    private void printSum(int a, int b){
        int sum = a+b;
        System.out.println("Sum of two numbers :" + sum);
    }

    public int sum(int a , int b){
        return a+b;
    }

    protected String greet(String name){
        return "Привет," + name;
    }

    boolean isEven( int number){
        return number % 2 == 0;
    }

    public int max(int c, int d){
        return (c >d)? c:d;
    }
    public int getLength(String text){
        return text.trim().replace(" ","").length();
    }

    protected double average(int a , int b , int c){
        return (a+b+c) /3;
    }
}
