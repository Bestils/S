package CastARam.StolarskieDAO;

import CastARam.Mlot;

public class StolarskiMlotek extends Mlot {

    String pazur;
     String dodatki;
     Boolean mniejszeWibracje;
     String wbijak;

    public StolarskiMlotek(int ID, String marka, String nazwa, int twardosc, int waga, int cena, String material, String pazur, String dodatki, Boolean mniejszeWibracje, String wbijak) {
        super(ID, marka, nazwa, twardosc, waga, cena, material);
        this.pazur = pazur;
        this.dodatki = dodatki;
        this.mniejszeWibracje = mniejszeWibracje;
        this.wbijak = wbijak;
    }

    public String getPazur() {
        return pazur;
    }

    public void setPazur(String pazur) {
        this.pazur = pazur;
    }

    public String getDodatki() {
        return dodatki;
    }

    public void setDodatki(String dodatki) {
        this.dodatki = dodatki;
    }

    public Boolean getMniejszeWibracje() {
        return mniejszeWibracje;
    }

    public void setMniejszeWibracje(Boolean mniejszeWibracje) {
        this.mniejszeWibracje = mniejszeWibracje;
    }

    public String getWbijak() {
        return wbijak;
    }

    public void setWbijak(String wbijak) {
        this.wbijak = wbijak;
    }
}
