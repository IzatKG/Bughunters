package arrays;

public class BaseMain {
    public static void main(String[] args) {
        People aida = new People("Aida", 30, "KG");
        People bakyt = new People("Bakyt", 32, "KG");
        People aktan = new People("Aktan", 20, "KZ");
        People bekjan = new People("Bekjan", 35, "KG");


        People [] persons = {aida, bakyt, aktan, bekjan};
        for (People person:persons) {
            System.out.println(person);
        }

        aida.printInfo();
        bakyt.printInfo();
        aktan.printInfo();

        System.out.println(persons[0].name);
        System.out.println(persons[0].age);
        System.out.println(persons[0].country);
        System.out.println(persons[persons.length-2]);


    }
}
