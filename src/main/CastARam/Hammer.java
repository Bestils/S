package main.CastARam;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

public abstract class Hammer {

    private SimpleIntegerProperty id;
    private SimpleDoubleProperty wage,price;
    private SimpleStringProperty brand,name,material,type;
    private Image photo;


    public Hammer(int id, double wage, double price, String brand, String name,  String material,String photo,String type) {
        this.id = new   SimpleIntegerProperty(id);
        this.wage =new SimpleDoubleProperty(wage);
        this.price =new SimpleDoubleProperty(price);
        this.brand =new SimpleStringProperty(brand);
        this.name = new SimpleStringProperty(name);
        this.material =new SimpleStringProperty(material);
        this.photo = new Image(photo);
        this.type = new SimpleStringProperty(type);
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
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
