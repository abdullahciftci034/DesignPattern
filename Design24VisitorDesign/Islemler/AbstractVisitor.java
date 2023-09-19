package Design24VisitorDesign.Islemler;

import Design24VisitorDesign.saglikbakanligi.*;

public abstract class AbstractVisitor  implements Visitor {
    @Override
    public String visitHastahane(Hastahane hastahane) {
        return String.valueOf(hastaSayisiHesapla(hastahane, this));
    }

    @Override
    public String visitIl(Il il) {
        return String.valueOf(hastaSayisiHesapla(il, this));
    }

    @Override
    public String visitUlke(Ulke ulke) {
        return String.valueOf(hastaSayisiHesapla(ulke, this));
    }
    public int hastaSayisiHesapla(Ulke ulke, Visitor visitor){
        int hastaSayisi=0;
        for (Il il: ulke.getIlList()) {
            hastaSayisi+=hastaSayisiHesapla(il,visitor);
        }
        return hastaSayisi;
    }
    public int hastaSayisiHesapla(Il il, Visitor visitor){
        int hastaSayisi=0;
        for (Hastahane hastahane: il.getHastahaneList()) {
            hastaSayisi+=hastaSayisiHesapla(hastahane,visitor);
        }
        return hastaSayisi;
    }
    public int hastaSayisiHesapla(Hastahane hastahane, Visitor visitor){
        int hastaSayisi=0;
        for (Hasta hasta: hastahane.getHastaList()) {
            if(visitor.hastaSonuc(hasta))
                hastaSayisi++;
        }
        return hastaSayisi;
    }
}
