package methods;

public class Animal {
    //public - доступен отовсюду
    //private - только внутри этого класса
    //protected - внутри пакета и у наследников
    //package-private - только в пакете ( по умолчанию)

    public String name;
    private String poroda;
    protected int age;
    String type;

 public void printInfo(){
     System.out.println("Name: " + name);
     System.out.println("Возраст: " + age);
     System.out.println("Тип : " + type);
 }

 protected void voice(){
     String text;
     System.out.println("woo-wooooo");
 }
}
