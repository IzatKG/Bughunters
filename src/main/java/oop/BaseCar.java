package oop;

public class BaseCar {
    public static void main(String[] args) {
        Car lexus = new Car("Lexus", "570", 2024, "Black", 5.7, 30000, true);
        System.out.println(lexus);

        System.out.println(lexus.getEngineVolume());
        System.out.println(lexus.getBrand());

        lexus.setYear(2025);
        System.out.println(lexus);

        lexus.setModel(" ");
        System.out.println(lexus);

        //вызов метода
        lexus.showInfo();
    }
}
