package oop;

import lombok.ToString;
@ToString
public final class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double engineVolume;
    private double mileage;
    private boolean isElectric;

    public Car(String brand, String model, int year, String color, double engineVolume, double mileage, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if( model != null && !model.isEmpty()){
            this.model = model;
        }else {
            System.out.println("Модель не может быть пустой!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2023) {
            this.year = year;
        } else {
            System.out.println("Sorry,Старая машина , не подходит!");
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void showInfo(){
        System.out.println("информация о машине");
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цвет: " + color);
        System.out.println("Оьем двигателя: " + engineVolume);
        System.out.println("Электромобиль : " + (isElectric? "Да" : "нет"));
    }
}
