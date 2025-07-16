package constructor;

public class BaseMain {
    public static void main(String[] args) {
        Person person = new Person("Bekjan",30,180.3,"Bishkek");
        System.out.println(person);

        Person akyl = new Person("Akyl",25,178,"Tokmok");
        System.out.println(akyl);

        Person aida = new Person("Aida",25,170);
        System.out.println(aida);
    }
}
