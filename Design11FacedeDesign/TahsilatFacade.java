package Design11FacedeDesign;

import Design11FacedeDesign.Borc.Borc;
import Design11FacedeDesign.Borc.OdemeBilgilerDto;
import Design11FacedeDesign.Gecikme.GecikmeZammiHesaplamService;
import Design11FacedeDesign.Tahsilat.KrediKarti.KrediKartiService;
import Design11FacedeDesign.Tahsilat.TahsilatControlService;

public class TahsilatFacade {
    private GecikmeZammiHesaplamService gecikmeZammiHesaplamService;
    private TahsilatControlService tahsilatControlService;
    private KrediKartiService krediKartiService;

    public TahsilatFacade() {
        this.gecikmeZammiHesaplamService = new GecikmeZammiHesaplamService();
        this.tahsilatControlService = new TahsilatControlService();
        this.krediKartiService = new KrediKartiService();
    }
    public boolean tahsilatYap(Borc borc, OdemeBilgilerDto odemeBilgilerDto){
        if(!tahsilatControlService.isTahsilataUygunmu(borc))
            return false;

        int odenecekTutar=borc.getBorcTutari()+gecikmeZammiHesaplamService.gecikmeZammiHesapla(borc.getBorcTutari(), borc.getVadeTarihi());
        System.out.println("Bilgi : Kredi kartından  " + odenecekTutar + " Tl deneniyor.");
        return krediKartiService.KrediKartiTahsilDene(odemeBilgilerDto,odenecekTutar);
    }
}
