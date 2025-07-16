package methods.returnMethod;

public class BaseMain {
    public static void main(String[] args) {
        Practice object = new Practice();
        System.out.println(object.sum(15,15));
        System.out.println(object.greet("Azamat"));
        System.out.println(object.isEven(11));
        System.out.println(object.max(8,10));
        System.out.println(object.getLength("  Ja va"));
        System.out.println(object.average(3,5,9));
    }
}
