package Design09CompositeDesign;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements  Fiyatlanabilir {
    private String adi;
    private List<Urun> urunList;
    private List <Paket> paketList;
    private  List <Sepet> sepetList;

    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList=new ArrayList<Urun>();
        this.paketList=new ArrayList<Paket>();
        this.sepetList=new ArrayList<Sepet>();
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

    public List<Sepet> getSepetList() {
        return sepetList;
    }

    public void setSepetList(List<Sepet> sepetList) {
        this.sepetList = sepetList;
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (Urun  urun: this.urunList ) {
            bigDecimal.add(urun.getFiyat());
        }
        for (Paket  paket: this.paketList ) {
            bigDecimal.add(paket.getFiyat());
        }
        for (Sepet  sepet: this.sepetList ) {
            System.out.println("Sepet Listesi");
            bigDecimal.add(sepet.getFiyat());
        }
        return  bigDecimal;
    }
}
