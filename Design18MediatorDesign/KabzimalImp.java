package Design18MediatorDesign;

import Design18MediatorDesign.halci.Halci;
import Design18MediatorDesign.uretici.Uretici;

import java.util.ArrayList;
import java.util.List;

public class KabzimalImp implements Kapzimal{
    private List<Halci> halciList;
    private List<Uretici> ureticiList;


    @Override
    public void halciyeSat(Uretici uretici) {
        Halci halci= getEnUygunHalci(uretici.getUrun());
        System.out.println(uretici.getIsim()+", "+uretici.getUrun()+" urununu "+ halci.getFiyat()+" fiyatından "+ halci.getIsım() +" halcisine sattı" );
    }


    @Override
    public void ureticidenAl(Halci halci) {
        Uretici  uretici=getEnUygunUretici(halci.getUrun());
        System.out.println(halci.getIsım()+" halcisi "+uretici.getIsim()+" ureticisinden, fiyati: "+uretici.getFiyat()+" olan "+uretici.getUrun()+" urununu aldi.");
    }

    private Halci getEnUygunHalci(EnumUrun urun) {
        Halci enUygunHalci=null;
        for (Halci halci: this.halciList ) {
            if(halci.getUrun().equals(urun)){
                if(enUygunHalci==null) {
                    enUygunHalci=halci;
                } else if (enUygunHalci.getFiyat()<halci.getFiyat()) {
                    enUygunHalci=halci;
                }
            }
        }
        return enUygunHalci;
    }
    private Uretici getEnUygunUretici(EnumUrun urun) {
        Uretici enUygunUretici=null;
        for (Uretici uretici: this.ureticiList ) {
            if(uretici.getUrun().equals(urun)){
                if(enUygunUretici==null) {
                    enUygunUretici=uretici;
                } else if (enUygunUretici.getFiyat()>uretici.getFiyat()) {
                    enUygunUretici=uretici;
                }
            }
        }
        return enUygunUretici;
    }

    @Override
    public void UreticiEkle(Uretici uretici){
        this.ureticiList.add(uretici);
    }
    @Override
    public void HalciEkle(Halci halci){
        this.halciList.add(halci);
    }
    public KabzimalImp() {
        this.halciList = new ArrayList<>();
        this.ureticiList = new ArrayList<>();
    }

    public List<Halci> getHalciList() {
        return halciList;
    }

    public void setHalciList(List<Halci> halciList) {
        this.halciList = halciList;
    }

}
