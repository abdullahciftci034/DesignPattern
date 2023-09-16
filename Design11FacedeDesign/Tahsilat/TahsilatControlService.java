package Design11FacedeDesign.Tahsilat;

import Design11FacedeDesign.Borc.Borc;
import Design11FacedeDesign.Borc.BorcTuru;
import Design11FacedeDesign.Hukuksal.HukuksalControlService;
import Design11FacedeDesign.Hukuksal.HukuksalSurecEntityService;
import Design11FacedeDesign.Yapilandirma.YapilandirmaControlService;

public class TahsilatControlService {
    private YapilandirmaControlService yapilandirmaControlService;

    private HukuksalControlService hukuksalControlService;

    public TahsilatControlService() {
        this.yapilandirmaControlService = new YapilandirmaControlService();
        this.hukuksalControlService = new HukuksalControlService(new HukuksalSurecEntityService());
    }

    public boolean isTahsilataUygunmu(Borc borc){
        if(BorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())){
            if(yapilandirmaControlService.isYapilandirmaBozulmali(borc.getVadeTarihi()))
                return false;
        }
        if (hukuksalControlService.isHukuksalIslem(borc.getId()))
            return  false;
        return  true;
    }
}
