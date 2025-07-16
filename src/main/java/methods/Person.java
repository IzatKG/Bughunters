package methods;

public class Person {
    // поля класса
    public String name;
    public double height;
    int age;
    String gender;

    void introduce() {
        System.out.println("Hi,I'm " + name + " and I'm " + age + " years old.");
    }

    // --> ()- параметры метода
    // --> {} - тело метода
    void greet(String otherName) {
        System.out.println("Hi " + otherName + " I'm " + name);
    }

   public void sayHello(String name){
       System.out.println("Привет, " +name);
   }

   public void changeName(String newName){
        name = newName;
   }
}
