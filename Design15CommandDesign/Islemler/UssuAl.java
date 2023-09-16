package Design15CommandDesign.Islemler;

import Design15CommandDesign.Islemler.Islemler;

public class UssuAl implements Islemler {
    @Override
    public int islem(int sayi1, int sayi2) {
        int sonuc=1;
        for(int i=1;i<=sayi2;i++){
            sonuc=sayi1*sonuc;
        }
        return sonuc;
    }
}
