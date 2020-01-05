package main.CastARam.carpenterDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import main.CastARam.Hammer;

public class CarpentryHamer extends Hammer {

    SimpleStringProperty typeOfCrawl,typeOfHead;
    SimpleBooleanProperty isLessVibrant;


    public CarpentryHamer(int id, double wage, double price, String brand, String name, String material, String typeOfCrawl, String typeOfHead, boolean isLessVibrant) {
        super(id, wage, price, brand, name, material);
        this.typeOfCrawl = new SimpleStringProperty(typeOfCrawl);
        this.typeOfHead =new SimpleStringProperty(typeOfHead);
        this.isLessVibrant = new SimpleBooleanProperty(isLessVibrant);
    }



}
