package CastARam;

public abstract class Mlot{

    int ID;
    String marka;
    String nazwa;
    int twardosc;
    int waga;
    int cena;
    String material;


    public Mlot(int ID, String marka, String nazwa, int twardosc, int waga, int cena, String material) {
        this.ID = ID;
        this.marka = marka;
        this.nazwa = nazwa;
        this.twardosc = twardosc;
        this.waga = waga;
        this.cena = cena;
        this.material = material;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getTwardosc() {
        return twardosc;
    }

    public void setTwardosc(int twardosc) {
        this.twardosc = twardosc;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}