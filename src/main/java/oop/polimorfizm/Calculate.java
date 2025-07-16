package oop.polimorfizm;

public class Calculate {
    // overloading --> перегрузка методов
    // один и тот же метод с разными параметрами и порядок параметров
    // возвращаемый тип не влияет на перегрузку
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b, double c){
        return a + b + c;
    }
}
