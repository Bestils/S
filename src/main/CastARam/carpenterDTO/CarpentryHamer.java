package main.CastARam.carpenterDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;
import main.CastARam.Hammer;

public class CarpentryHamer extends Hammer {

    SimpleStringProperty typeOfCrawl,typeOfHead;
    SimpleBooleanProperty isLessVibrant;


    public CarpentryHamer(Integer id, Double wage, Double price, String brand, String name, String material, String photo, String typeOfCrawl, String typeOfHead, Boolean isLessVibrant,String type) {
        super(id, wage, price, brand, name, material,photo,type);
        this.typeOfCrawl = new SimpleStringProperty(typeOfCrawl);
        this.typeOfHead =new SimpleStringProperty(typeOfHead);
        this.isLessVibrant = new SimpleBooleanProperty(isLessVibrant);
    }

    public String getTypeOfCrawl() {
        return typeOfCrawl.get();
    }

    public SimpleStringProperty typeOfCrawlProperty() {
        return typeOfCrawl;
    }

    public void setTypeOfCrawl(String typeOfCrawl) {
        this.typeOfCrawl.set(typeOfCrawl);
    }

    public String getTypeOfHead() {
        return typeOfHead.get();
    }

    public SimpleStringProperty typeOfHeadProperty() {
        return typeOfHead;
    }

    public void setTypeOfHead(String typeOfHead) {
        this.typeOfHead.set(typeOfHead);
    }

    public boolean isIsLessVibrant() {
        return isLessVibrant.get();
    }

    public SimpleBooleanProperty isLessVibrantProperty() {
        return isLessVibrant;
    }

    public void setIsLessVibrant(boolean isLessVibrant) {
        this.isLessVibrant.set(isLessVibrant);
    }
}
