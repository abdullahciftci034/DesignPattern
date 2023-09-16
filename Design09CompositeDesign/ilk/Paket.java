package Design09CompositeDesign.ilk;

import java.util.ArrayList;
import java.util.List;

public class Paket {
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
}
