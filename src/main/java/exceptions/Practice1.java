package exceptions;

public class Practice1 {
    public static void checkAge(String name, int age) throws TooYongException {
        if (age < 18) {
            throw new TooYongException("Слишком молод!");
        }
        System.out.println(name + " зарегистрирован");
    }

    public static void main(String[] args) {
        try {
            checkAge("Tilek", -19);
            //  checkAge("Aida", 67);
            //checkAge("Akyl", 7);
        } catch (TooYongException e) {
            System.err.println("Ошибка регистрации: " + e.getMessage());

    }
}
}
