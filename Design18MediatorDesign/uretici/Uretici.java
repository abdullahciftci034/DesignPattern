package Design18MediatorDesign.uretici;

import Design18MediatorDesign.EnumUrun;
import Design18MediatorDesign.Kapzimal;

public class Uretici {
    private String isim;
    private EnumUrun urun;
    private int fiyat;
    private Kapzimal kapzimal;


    public void urunSat(){
        this.kapzimal.halciyeSat(this);
    }
    public Uretici(String isim, EnumUrun urun, int fiyat,Kapzimal kapzimal) {
        this.isim = isim;
        this.urun = urun;
        this.fiyat = fiyat;
        this.kapzimal=kapzimal;
        this.kapzimal.UreticiEkle(this);
    }

    public Kapzimal getKapzimal() {
        return kapzimal;
    }

    public void setKapzimal(Kapzimal kapzimal) {
        this.kapzimal = kapzimal;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public EnumUrun getUrun() {
        return urun;
    }

    public void setUrun(EnumUrun urun) {
        this.urun = urun;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
