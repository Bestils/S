package main.CastARam.rubberDTO;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import main.CastARam.Hammer;

public class RubberHammer extends Hammer {

    SimpleIntegerProperty headDiameter;


    public RubberHammer(Integer id, Double wage, Double price, String brand, String name, String material, String photo, Integer headDiameter,String type) {
        super(id, wage, price, brand, name, material,photo,type);
        this.headDiameter = new SimpleIntegerProperty(headDiameter);
    }

    public int getHeadDiameter() {
        return headDiameter.get();
    }

    public SimpleIntegerProperty headDiameterProperty() {
        return headDiameter;
    }

    public void setHeadDiameter(int headDiameter) {
        this.headDiameter.set(headDiameter);
    }
}
