package methods;

import static methods.myStatic.Student.maxOfThree;

public class Print {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.type = "wild";
        obj.name = "Волк";
        obj.age = 5;
       // obj.poroda - приватный модификатор

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.type);
        obj.printInfo();
        obj.voice();

        System.out.println(maxOfThree(45,86,23));
    }
}
