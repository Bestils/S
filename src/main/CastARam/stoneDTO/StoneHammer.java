package main.CastARam.stoneDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import main.CastARam.Hammer;

public class StoneHammer extends Hammer {

    SimpleBooleanProperty isHardened, isAmplified;


    public StoneHammer(Integer id, Double wage, Double price, String brand, String name, String material, String photo, Boolean isAmplified, Boolean isHardened, String type) {
        super(id, wage, price, brand, name, material, photo, type);
        this.isHardened = new SimpleBooleanProperty(isAmplified);
        this.isAmplified = new SimpleBooleanProperty(isHardened);

    }
    public boolean isIsHardened() {
        return isHardened.get();
    }

    public SimpleBooleanProperty isHardenedProperty() {
        return isHardened;
    }

    public void setIsHardened(boolean isHardened) {
        this.isHardened.set(isHardened);
    }

    public boolean isIsAmplified() {
        return isAmplified.get();
    }

    public SimpleBooleanProperty isAmplifiedProperty() {
        return isAmplified;
    }

    public void setIsAmplified(boolean isAmplified) {
        this.isAmplified.set(isAmplified);
    }
}
