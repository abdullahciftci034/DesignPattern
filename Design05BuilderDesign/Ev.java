package Design05BuilderDesign;

public class Ev {
    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int balkonSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;


    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;

    public Ev(String il, String ilce, String mahalle, int binaYili, int balkonSayisi, int banyoSayisi, int tuvaletSayisi, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.binaYili = binaYili;
        this.balkonSayisi = balkonSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.hasOtopark = hasOtopark;
        this.hasCocukParki = hasCocukParki;
    }

    // opsiyonel yaptik
    public Ev(String mahalle, int binaYili, int balkonSayisi, int banyoSayisi, int tuvaletSayisi) {
        this.mahalle = mahalle;
        this.binaYili = binaYili;
        this.balkonSayisi = balkonSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public Ev() {
    }


    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isHasCocukParki() {
        return hasCocukParki;
    }

    public void setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYili=" + binaYili +
                ", balkonSayisi=" + balkonSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                '}';
    }
}
