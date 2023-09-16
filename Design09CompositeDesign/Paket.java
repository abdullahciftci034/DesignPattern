package Design09CompositeDesign;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Paket implements  Fiyatlanabilir{
    private  String isim;
    private List<Urun> urunList;

    public Paket(String isim) {
        this.isim = isim;
        urunList=new ArrayList<>();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }


    @Override
    public BigDecimal getFiyat() {
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        for (Urun  urun: this.urunList ) {
            bigDecimal.add(urun.getFiyat());
        }
        System.out.println(bigDecimal);
        return  bigDecimal;
    }
}
