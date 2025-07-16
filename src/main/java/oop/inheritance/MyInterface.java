package oop.inheritance;

public interface MyInterface {
    //описываем что объект может делать
    public static final String NAME = "Aktan";
  // значение нельзя изменить после инициализации
    double AMOUNT = 555;

    default void defaultMethod(){
        System.out.println("Это дефолтный метод с модификатором");
    }

    //абстрактные методы --> без тело
   // public abstract void start();
}
