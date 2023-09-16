package Design05BuilderDesign;

public class EvBuilder {

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

    public Ev build(){
        return new Ev(il, ilce, mahalle, binaYili, balkonSayisi,  banyoSayisi, tuvaletSayisi, isDublex, isEsyali, hasOtopark, hasCocukParki);
    }

    public EvBuilder setIl(String il) {
        this.il = il;
        return  this;
    }
    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return  this;
    }
    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return  this;
    }
    public EvBuilder setBinaYili(int binaYili) {
        this.binaYili = binaYili;
        return  this;
    }
    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return  this;
    }
    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return  this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return  this;
    }
    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return  this;
    }
    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return  this;
    }
    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return  this;
    }
}
