package main.CastARam.StolarskieDAO;

import main.CastARam.Hammer;

import java.util.List;

public class CarpentryHamer extends Hammer {

    String typeOfCrawl;
    List<String> additions;
    Boolean isLessVibrant;
    String typeOfHead;

    public CarpentryHamer(int ID, String brand, String name, int hardness, int wage, int cena, String material) {
        super(ID, brand, name, hardness, wage, cena, material);
    }
}
