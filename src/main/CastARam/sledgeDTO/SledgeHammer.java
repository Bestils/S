package main.CastARam.sledgeDTO;

import javafx.beans.property.SimpleIntegerProperty;
import main.CastARam.Hammer;

public class SledgeHammer extends Hammer {

    SimpleIntegerProperty headLength, headWidth, handleLength; //its in milimeters


    public SledgeHammer(Integer id, Double wage, Double price, String brand, String name, String material, String photo, Integer headLenght, Integer headWidth, Integer handleLength, String type) {
        super(id, wage, price, brand, name, material,photo,type);
        this.headLength = new SimpleIntegerProperty(headLenght);
        this.headWidth = new SimpleIntegerProperty(headWidth);
        this.handleLength = new SimpleIntegerProperty(handleLength);
    }

    public int getHeadLenght() {
        return headLength.get();
    }

    public SimpleIntegerProperty headLenghtProperty() {
        return headLength;
    }

    public void setHeadLenght(int headLenght) {
        this.headLength.set(headLenght);
    }

    public int getHeadWidth() {
        return headWidth.get();
    }

    public SimpleIntegerProperty headWidthProperty() {
        return headWidth;
    }

    public void setHeadWidth(int headWidth) {
        this.headWidth.set(headWidth);
    }

    public int getHandleLength() {
        return handleLength.get();
    }

    public SimpleIntegerProperty handleLengthProperty() {
        return handleLength;
    }

    public void setHandleLength(int handleLength) {
        this.handleLength.set(handleLength);
    }
}
