package main.mjolnir.GumoweDAO;



import main.mjolnir.Hammer;

public class GumowyMlotek extends Hammer {

   Float srednicaObucha;
   int masaObucha;
   String normy;
   Gietkosci gietkosc;



    public GumowyMlotek(int ID, String marka, String nazwa, int twardosc, int waga, int cena, String material, Float srednicaObucha, int masaObucha, String normy, Gietkosci gietkosc) {
        super(ID, marka, nazwa, twardosc, waga, cena, material);
        this.srednicaObucha = srednicaObucha;
        this.masaObucha = masaObucha;
        this.normy = normy;
        this.gietkosc = gietkosc;
    }

    public Float getSrednicaObucha() {
        return srednicaObucha;
    }

    public void setSrednicaObucha(Float srednicaObucha) {
        this.srednicaObucha = srednicaObucha;
    }

    public int getMasaObucha() {
        return masaObucha;
    }

    public void setMasaObucha(int masaObucha) {
        this.masaObucha = masaObucha;
    }

    public String getNormy() {
        return normy;
    }

    public void setNormy(String normy) {
        this.normy = normy;
    }

    public Gietkosci getGietkosc() {
        return gietkosc;
    }

    public void setGietkosc(Gietkosci gietkosc) {
        this.gietkosc = gietkosc;
    }
}
