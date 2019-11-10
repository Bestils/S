package CastARam.KamieniarskieDAO;

import CastARam.Mlot;

public class KamieniarskiMlotek extends Mlot {

    Boolean hartowany;
    Boolean wzmacniany;
    String glowica;
    String norma;

    public KamieniarskiMlotek(int ID, String marka, String nazwa, int twardosc, int waga, int cena, String material, Boolean hartowany, Boolean wzmacniany, String glowica, String norma) {
        super(ID, marka, nazwa, twardosc, waga, cena, material);
        this.hartowany = hartowany;
        this.wzmacniany = wzmacniany;
        this.glowica = glowica;
        this.norma = norma;
    }

    public Boolean getHartowany() {
        return hartowany;
    }

    public void setHartowany(Boolean hartowany) {
        this.hartowany = hartowany;
    }

    public Boolean getWzmacniany() {
        return wzmacniany;
    }

    public void setWzmacniany(Boolean wzmacniany) {
        this.wzmacniany = wzmacniany;
    }

    public String getGlowica() {
        return glowica;
    }

    public void setGlowica(String glowica) {
        this.glowica = glowica;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }
}



