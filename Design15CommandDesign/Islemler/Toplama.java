package Design15CommandDesign.Islemler;

import Design15CommandDesign.Islemler.Islemler;

public class Toplama implements Islemler {
    @Override
    public int islem(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
}
