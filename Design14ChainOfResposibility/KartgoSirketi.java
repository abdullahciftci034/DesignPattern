package Design14ChainOfResposibility;

public abstract  class KartgoSirketi {
    private EnumIl enumIl;
    private  KartgoSirketi sonrakiKartgoSirketi;

    public KartgoSirketi(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public KartgoSirketi getSonrakiKartgoSirketi() {
        return sonrakiKartgoSirketi;
    }

    public KartgoSirketi setSonrakiKartgoSirketi(KartgoSirketi sonrakiKartgoSirketi) {
        this.sonrakiKartgoSirketi = sonrakiKartgoSirketi;
        return this;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }

    public void setEnumIl(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public void kargola(EnumIl il){
        System.out.println(il);
        kargoSirketineGeldi();
        if(getEnumIl().equals(il)){
            teslimaldik(getEnumIl());
        }else if(getSonrakiKartgoSirketi() != null){
            sonrakiKargoSirketineGonderildiYazi(getSonrakiKartgoSirketi().getEnumIl());
            getSonrakiKartgoSirketi().kargola(il);
        }else{
            hizmetdisialan();
        }
    }

    private void kargoSirketineGeldi() {
        System.out.println(getEnumIl()+" Kargo sirketine geldi");
    }

    private void teslimaldik(EnumIl enumIl) {
        System.out.println(enumIl +" kargo sirekti teslim aldi.");
    }

    private void sonrakiKargoSirketineGonderildiYazi(EnumIl  enumIl ) {
        System.out.println("Sonraki kargo şirketine gonderildi: " +enumIl);
    }

    private void hizmetdisialan() {
        System.out.println("Hizmet dışı alan");
    }
}
