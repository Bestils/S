package main.CastARam.shoppingCartDTO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.CastARam.Hammer;

public class ShoppingCart {

    ObservableList<Hammer> cartItems ;

    public ShoppingCart(ObservableList<Hammer> cartItems) {
        this.cartItems = cartItems;
    }

    public ObservableList<Hammer> getCartItems() {
        return cartItems;
    }

    public void addItem(Hammer hammer) {
        cartItems.add(hammer);
    }

}
