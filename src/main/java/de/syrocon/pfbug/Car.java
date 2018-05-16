package de.syrocon.pfbug;

public class Car {

    private int id;
    private String brand;

    public Car(int id, String brand) {
        this.setId(id);
        this.setBrand(brand);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
