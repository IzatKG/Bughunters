package oop.abstracts;

public interface ExampleInterface {
    //1) константа ---> модификаторы static и final redundent
  static final int NUMBER = 124;

    //2) методы с модификатором default
    default void print(String text){
        privateMethod();
        System.out.println("Это метод default от интерфейса " + text);
    }

    // 3) статичные методы
    static void staticMethod(){
        System.out.println("Static method in interface");
    }

    //4) приватные методы--->
    private void privateMethod(){
        System.out.println("This a private method from interface");
    }

    //5) абстрактные методы ----> модификатор abstract не обязательно
    abstract void sayHello();
}
