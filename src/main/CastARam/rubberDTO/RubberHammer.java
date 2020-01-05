package main.CastARam.rubberDTO;



import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import main.CastARam.Hammer;

public class RubberHammer extends Hammer {

   int headDiameter;

    public RubberHammer(int id, double wage, double price, String brand, String name, String material, int headDiameter) {
        super(id, wage, price, brand, name, material);
        this.headDiameter = headDiameter;
    }
}
