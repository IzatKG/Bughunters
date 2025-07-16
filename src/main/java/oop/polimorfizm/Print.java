package oop.polimorfizm;

public class Print {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.add(4,5,10));

        MathUtils mathUtils = new MathUtils();
        System.out.println(mathUtils.square(1.5));
        System.out.println(mathUtils.square(4));

        Printer print = new Printer();
        print.scan("PRIVET", 5);
        print.scan(3,"Salam");


        SecondHand secondHand = new SecondHand(
                "Sela",
                "Одежды");

        secondHand.doTarget();

    }
}
