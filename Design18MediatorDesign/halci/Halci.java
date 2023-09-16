package Design18MediatorDesign.halci;

import Design18MediatorDesign.EnumUrun;
import Design18MediatorDesign.Kapzimal;

public class Halci {
    private String Isım;
    private EnumUrun urun;
    private int fiyat;
    private Kapzimal kapzimal;


    public void urunAl(){
        this.kapzimal.ureticidenAl(this);
    }
    public Halci(String isım, EnumUrun urun, int fiyat, Kapzimal kapzimal) {
        Isım = isım;
        this.urun = urun;
        this.fiyat = fiyat;
        this.kapzimal = kapzimal;
        this.kapzimal.HalciEkle(this);
    }

    public Kapzimal getKapzimal() {
        return kapzimal;
    }

    public void setKapzimal(Kapzimal kapzimal) {
        this.kapzimal = kapzimal;
    }

    public String getIsım() {
        return Isım;
    }

    public void setIsım(String isım) {
        Isım = isım;
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
