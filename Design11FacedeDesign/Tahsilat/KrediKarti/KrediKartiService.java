package Design11FacedeDesign.Tahsilat.KrediKarti;

import Design11FacedeDesign.Borc.OdemeBilgilerDto;

public class KrediKartiService {
    private KrediKartiControlService krediKartiControlService;

    public KrediKartiService() {
        this.krediKartiControlService = new KrediKartiControlService();
    }
    public boolean KrediKartiTahsilDene(OdemeBilgilerDto  odemeBilgilerDto , int odenecekTutar){
        boolean krediKartiGecerli = krediKartiControlService.isKrediKartiGecerli(odemeBilgilerDto);
        if( !krediKartiGecerli)
            return  false;
        boolean yeterliLimitVarmi=isYeterlimitVar(odemeBilgilerDto,odenecekTutar);
        if(!yeterliLimitVarmi)
            return  false;
        System.out.println("Kredi kartından odenecek tutar"+ odenecekTutar + "tahsil edilmistir.");
        return  true;
    }

    private boolean isYeterlimitVar(OdemeBilgilerDto odemeBilgilerDto, int odenecekTutar) {
        int limit = getKrediKartiLimit(odemeBilgilerDto.getKartUzerindekiIsım());
        if(odenecekTutar<limit)
            return true;
        return  false;
    }

    private int getKrediKartiLimit(String kartUzerindekiIsım) {
        if(kartUzerindekiIsım.equals("abdullah")){
            return 10;
        }else if(kartUzerindekiIsım.equals("mehmet")) {
            return 2000;
        } else if (kartUzerindekiIsım.equals("ali")) {
            return 1000;
        }
        System.out.println("Kisi bulunamadi");
        return 0;
    }

}
