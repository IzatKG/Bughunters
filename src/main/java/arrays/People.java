package arrays;

public class People {
    //instance variables
    String name;
    int age;
    String country;

    public People(String n, int a, String c) {
        name = n;
        age = a;
        country = c;
    }

    public void printInfo(){
        System.out.println("имя " + name + ", возраст: " + age + ",Страна - " + country);
    }




    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
