package main.mjolnir.KamieniarskieDAO;

import main.mjolnir.Hammer;

public class KamieniarskiMlotek extends Hammer {

    Boolean isHardened;
    Boolean isAmplified;
    String head;
    String norm;

    public KamieniarskiMlotek(int ID, String marka, String nazwa, int twardosc, int waga, int cena, String material, Boolean isHardened, Boolean isAmplified, String head, String norm) {
        super(ID, marka, nazwa, twardosc, waga, cena, material);
        this.isHardened = isHardened;
        this.isAmplified = isAmplified;
        this.head = head;
        this.norm = norm;
    }

    public Boolean getIsHardened() {
        return isHardened;
    }

    public void setIsHardened(Boolean isHardened) {
        this.isHardened = isHardened;
    }

    public Boolean getIsAmplified() {
        return isAmplified;
    }

    public void setIsAmplified(Boolean isAmplified) {
        this.isAmplified = isAmplified;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getNorm() {
        return norm;
    }

    public void setNorm(String norm) {
        this.norm = norm;
    }
}



