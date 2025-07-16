package oop.polimorfizm;

public abstract class Magazin {
    private String name;
    private String otdel;
    private boolean set;

    public Magazin(String name, String otdel) {
        this.name = name;
        this.otdel = otdel;
    }

    public Magazin(String name, String otdel, boolean set) {
        this.name = name;
        this.otdel = otdel;
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }

    public boolean isSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }

    protected abstract void  sell();

    public void doTarget(){
        System.out.println("У нас скидки! на 70%");
    }

    public final void pay(){
        System.out.println("Pay for the clothes");
    }
}
