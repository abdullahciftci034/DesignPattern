package Design14ChainOfResposibility;

public class SBMKargo {
    public static KartgoSirketi  KargolaZincir(){
        KargoSirketiAnkara kargoSirketiAnkara = new KargoSirketiAnkara();
        KargoSirketiAntalya kargoSirketiAntalya = new KargoSirketiAntalya();
        KargoSirketiCankiri kargoSirketiCankiri = new KargoSirketiCankiri();
        KargoSirketiIstanbul kargoSirketiIstanbul = new KargoSirketiIstanbul();
        KargoSirketiKars kargoSirketiKars = new KargoSirketiKars();

        KartgoSirketi kartgoSirketi= kargoSirketiCankiri.setSonrakiKartgoSirketi(
                        kargoSirketiAnkara.setSonrakiKartgoSirketi(
                                kargoSirketiAntalya.setSonrakiKartgoSirketi(
                                        kargoSirketiKars.setSonrakiKartgoSirketi(
                                                kargoSirketiIstanbul))));

        return kartgoSirketi;

    }

    public static void main(String[] args) {
        KargolaZincir().kargola(EnumIl.ANKARA);
        KargolaZincir().kargola(EnumIl.ISTANBUL);
        KargolaZincir().kargola(EnumIl.CANKIRI);
        KargolaZincir().kargola(EnumIl.KARS);



    }
}
