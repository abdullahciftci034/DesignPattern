package Design09CompositeDesign;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet implements Fiyatlanabilir{
    private  String adi;
    private List<Urun> urunList;
    private  List<Paket> paketList;

    public Sepet(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<Urun>();
        this.paketList = new ArrayList<Paket>();
    }

    public BigDecimal getToplamFiyat(){
        BigDecimal toplamFiyat =BigDecimal.ZERO;

        for (Urun urun : urunList) {
            toplamFiyat=toplamFiyat.add(urun.getFiyat());
        }
        for (Paket paket: paketList){
            for (Urun urun: paket.getUrunList()){
                toplamFiyat=toplamFiyat.add(urun.getFiyat());
            }
        }
        return toplamFiyat;
    }




    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (Urun  urun: this.urunList ) {
            bigDecimal.add(urun.getFiyat());
            System.out.println("urunler");
        }
        for (Paket  paket: this.paketList ) {
            bigDecimal.add(paket.getFiyat());
            System.out.println("paketlist");
        }
        return  bigDecimal;
    }
}
