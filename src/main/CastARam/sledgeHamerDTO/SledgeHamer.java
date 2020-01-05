package main.CastARam.sledgeHamerDTO;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import main.CastARam.Hammer;

public class SledgeHamer extends Hammer {
    SimpleIntegerProperty headLenght, headWidth,handleDiameter; //its in milimeters

    public SledgeHamer(int id, double wage, double price, String brand, String name, String material, int headLenght, int headWidth, int handleDiameter) {
        super(id, wage, price, brand, name, material);
        this.headLenght =new SimpleIntegerProperty (headLenght);
        this.headWidth =new SimpleIntegerProperty (headWidth);
        this.handleDiameter = new SimpleIntegerProperty (handleDiameter);
    }
}
