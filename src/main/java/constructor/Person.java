package constructor;

public class Person {
    // конструктор - специальный метод
    // конструктор - имя совпадает с именем класса
    // конструктор - инициализировать поля объекта
    // конструктор - ничего не возвращает

    public String name;
    public int age;
    public double height;
    public String city;

//    public Person(){
//    } - пустой конструктор

    public Person(String name, int age, double height, String city) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.city = city;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age =age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", city='" + city + '\'' +
                '}';
    }
}
