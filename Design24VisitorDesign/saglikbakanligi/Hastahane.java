package Design24VisitorDesign.saglikbakanligi;

import java.util.ArrayList;
import java.util.List;

public class Hastahane {
    private String adi;
    private List<Hasta> hastaList ;

    public Hastahane(String adi) {
        this.adi = adi;
        this.hastaList=new ArrayList<>();
    }
    public void hastaEkle(Hasta hasta){
        this.hastaList.add(hasta);
    }
    public String accept(Visitor  visitor ){
        return visitor.visitHastahane(this);
    }
    @Override
    public String toString() {
        return "Hastahane{" +
                "adi='" + adi + '\'' +
                ", hastaList=" + hastaList +
                '}';
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hasta> getHastaList() {
        return hastaList;
    }

    public void setHastaList(List<Hasta> hastaList) {
        this.hastaList = hastaList;
    }
}
