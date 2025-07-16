package methods;

public class Programme {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Timur";
        person.age = 27;
        person.height = 180.5;
        person.gender = "male";

        System.out.println("Name is : " + person.name);
        System.out.println("Height is : " + person.height);
        System.out.println("Age is : " + person.age);
        System.out.println("Gender is : " + person.gender);

        person.introduce();
        person.greet("Kanat");
        person.sayHello("Akyl");

        System.out.println(person.name);
        person.changeName("Aida");
        System.out.println(person.name);
    }
}
