package Design11FacedeDesign.Tahsilat.KrediKarti;

import Design11FacedeDesign.Borc.OdemeBilgilerDto;
import Design11FacedeDesign.DateUtil;

import java.util.Date;

public class KrediKartiControlService {
    public boolean isKrediKartiGecerli(OdemeBilgilerDto odemeBilgilerDto){
        odemeBilgilerDto.getSonKullanmaAy();
        odemeBilgilerDto.getSonKullanmaYil();
        long yıl = DateUtil.tarihinYili();
        long gun = DateUtil.tarihinAyi();

        if( odemeBilgilerDto.getSonKullanmaYil() >  DateUtil.tarihinYili()){
            return true;
        } else if (odemeBilgilerDto.getSonKullanmaYil() ==  DateUtil.tarihinYili()){
            if(odemeBilgilerDto.getSonKullanmaAy() > DateUtil.tarihinAyi()){
                return true;
            }
        }
        return  false;
    }
}
