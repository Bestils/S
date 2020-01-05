package main.CastARam.stonerDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import main.CastARam.Hammer;

public class StonerHammer extends Hammer {

    SimpleBooleanProperty isHardened,isAmplified;

    public StonerHammer(int id, double wage, double price, String brand, String name, String material, boolean isHardened, boolean isAmplified) {
        super(id, wage, price, brand, name, material);
        this.isHardened = new SimpleBooleanProperty(isHardened);
        this.isAmplified =new SimpleBooleanProperty (isAmplified);
    }
}



