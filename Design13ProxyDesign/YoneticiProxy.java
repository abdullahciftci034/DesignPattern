package Design13ProxyDesign;

public class YoneticiProxy {
    private GercekYonetici gercekYonetici;
    private String kullaniciAdi;
    private String sifre;

    public YoneticiProxy(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.gercekYonetici = new GercekYonetici();
    }

    public int getCiro(){
        if(isKullanciYoneticimi())
            return this.gercekYonetici.getCiro();
        throw new IllegalArgumentException();
    }
    private boolean isKullanciYoneticimi(){
        if (!CalisanMi(kullaniciAdi))
            return false;
        if(!passwordControl(CalisanUtil.getKullaniciAdiCalisanMap().get(kullaniciAdi),sifre))
            return false;
        return isYonetici(CalisanUtil.getKullaniciAdiCalisanMap().get(kullaniciAdi));
    }

    private  boolean CalisanMi(String kullaniciAdi){
        if(CalisanUtil.getKullaniciAdiCalisanMap().get(kullaniciAdi)!=null)
            return true;
        System.out.println("Calisan degilsiniz.");
        return false;
    }
    private boolean passwordControl(Calisan calisan,String sifre) {
        if(calisan.getSifre().equals(sifre))
            return true;
        System.out.println("Sifre yanlis");
        return  false;
    }

    private  boolean isYonetici(Calisan calisan){
        if(calisan.isYonetici())
            return true;
        System.out.println("Yonetici Degilsin");
        return  false;
    }


}
