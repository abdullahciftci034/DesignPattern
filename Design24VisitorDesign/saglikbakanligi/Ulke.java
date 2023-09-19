package Design24VisitorDesign.saglikbakanligi;

import java.util.ArrayList;
import java.util.List;

public class Ulke {
    private String adi;
    private List<Il> ilList;

    public Ulke(String adi) {
        this.adi = adi;
        this.ilList=new ArrayList<>();
    }
    public void IlEkle(Il il){
        this.ilList.add(il);
    }
    public String accept(Visitor  visitor ){
       return visitor.visitUlke(this);
    }
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Il> getIlList() {
        return ilList;
    }

    public void setIlList(List<Il> ilList) {
        this.ilList = ilList;
    }
}
