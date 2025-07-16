package oop.polimorfizm;

public class Printer {

    public  void scan(String text){
        System.out.println("Text :" + text);
    }
    public  void scan(String text, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println("Text :" + text);
        }
    }

    public  void scan(int time, String text ) {
        for (int i = 0; i < time; i++) {
            System.out.println("Text :" + text);
        }
    }
}
