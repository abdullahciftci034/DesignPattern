package Design24VisitorDesign.saglikbakanligi;

import java.util.ArrayList;
import java.util.List;

public class Il {
    private String adi;
    private List<Hastahane> hastahaneList;

    public Il(String adi) {
        this.adi = adi;
        this.hastahaneList=new ArrayList<>();
    }
    public void hastaneEkle(Hastahane hastahane){
        this.hastahaneList.add(hastahane);
    }
    public String accept(Visitor  visitor ){
        return visitor.visitIl(this);
    }
    @Override
    public String toString() {
        return "Il{" +
                "adi='" + adi + '\'' +
                ", hastahaneList=" + hastahaneList +
                '}';
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Hastahane> getHastahaneList() {
        return hastahaneList;
    }

    public void setHastahaneList(List<Hastahane> hastahaneList) {
        this.hastahaneList = hastahaneList;
    }
}
