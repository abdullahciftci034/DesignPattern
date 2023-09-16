package Design11FacedeDesign.Gecikme;

import Design11FacedeDesign.DateUtil;

import java.util.Date;

public class GecikmeZammiHesaplamService {
    public int gecikmeZammiHesapla(int tutar, Date vadeTarihi) {
        int gecikmeZammi=0;
        if(vadeTarihi.compareTo(new Date())>0){
            return gecikmeZammi;
        }
        gecikmeZammi=gecikmeZammiHesaplama( tutar,vadeTarihi);
        return gecikmeZammi;
    }

    private int gecikmeZammiHesaplama(int tutar, Date vadeTarihi) {
        float gecikmeZammiOrani = 0.16F;
        return (int)(DateUtil.gunFarkiHesapla(new Date(),vadeTarihi)*gecikmeZammiOrani);
    }
}
