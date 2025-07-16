package oop;

public class Animal {
    //ООП
    //инкапсуляция->
    private String name;
    private String paroda;
    private double weight;

    public Animal(String name, String paroda, double weight) {
        this.name = name;
        this.paroda = paroda;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getParoda() {
        return paroda;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    protected static void speak(){
        System.out.println("Make sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", paroda='" + paroda + '\'' +
                ", weight=" + weight +
                '}';
    }

}
