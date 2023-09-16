package Design11FacedeDesign.Yapilandirma;

import Design11FacedeDesign.DateUtil;

import java.util.Date;

public class YapilandirmaControlService {
    public boolean isYapilandirmaBozulmali(Date vadeTarihi){

        long gunFarki = DateUtil.gunFarkiHesapla(vadeTarihi,new Date());

        boolean isYapilandirmaBozulmali=gunFarki>90;

        if(isYapilandirmaBozulmali){
            System.out.println("Borcun yapilandirmasi bozulmali, tahsil edilemez");
        }
        return isYapilandirmaBozulmali;
    }
}
