package Design15CommandDesign;

import Design15CommandDesign.Islemler.*;

public class HesapMakinesi {
    public int Bolme(int sayi1, int sayi2){
        return new Bolme().islem(sayi1, sayi2);
    }
    public int Carpma(int sayi1, int sayi2){
        return new Carpma().islem(sayi1, sayi2);
    }
    public int Ciklarma(int sayi1, int sayi2){
        return new Cikarma().islem(sayi1, sayi2);
    }
    public int Toplama(int sayi1, int sayi2){
        return new Toplama().islem(sayi1, sayi2);
    }
    public int UssuAl(int sayi1, int sayi2){
        return new UssuAl().islem(sayi1, sayi2);
    }
}
