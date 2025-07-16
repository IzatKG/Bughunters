package oop.polimorfizm;

public class SecondHand extends Magazin{
    public SecondHand(String name, String otdel) {
        super(name, otdel);
    }

    @Override
    protected void sell() {
        System.out.println("У нас товары из Кореи");
    }

    @Override
    public void doTarget() {
        System.out.println("У нас нет скидки");
    }

}
