package Design11FacedeDesign;

import Design11FacedeDesign.Borc.Borc;
import Design11FacedeDesign.Borc.BorcTuru;
import Design11FacedeDesign.Borc.OdemeBilgilerDto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Borc borc = new Borc(10L, BorcTuru.NORMAl,DateUtil.tarihOlustur("12.03.2020"),100);
        TahsilatFacade  tahsilatFacade =new TahsilatFacade();

        OdemeBilgilerDto odemeBilgilerDto  =new OdemeBilgilerDto("abdullah","21312312312312",(long)10,(long)2023,112);

        tahsilatFacade.tahsilatYap(borc,odemeBilgilerDto);




    }
}
