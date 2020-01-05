package main.CastARam;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public abstract class Hammer {

    SimpleIntegerProperty id;
    SimpleDoubleProperty wage,price;
    SimpleStringProperty brand,name,material;

    public Hammer(int id, double wage, double price, String brand, String name,  String material) {
        this.id = new   SimpleIntegerProperty(id);
        this.wage =new SimpleDoubleProperty(wage);
        this.price =new SimpleDoubleProperty(price);
        this.brand =new SimpleStringProperty(brand);
        this.name = new SimpleStringProperty(name);
        this.material =new SimpleStringProperty(material);
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public double getWage() {
        return wage.get();
    }

    public SimpleDoubleProperty wageProperty() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage.set(wage);
    }

    public double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public String getBrand() {
        return brand.get();
    }

    public SimpleStringProperty brandProperty() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand.set(brand);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getMaterial() {
        return material.get();
    }

    public SimpleStringProperty materialProperty() {
        return material;
    }

    public void setMaterial(String material) {
        this.material.set(material);
    }
}
