package Design09CompositeDesign;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Urun urun = new Urun("patates", BigDecimal.TEN);
        Urun urun1 = new Urun("domates", BigDecimal.TEN);
        Urun urun2 = new Urun("elma", BigDecimal.valueOf(100));
        Urun urun3 = new Urun("salatalık", BigDecimal.TWO);
        Urun urun4 = new Urun("soğan", BigDecimal.ONE);
        Urun urun5 = new Urun("mercimek", BigDecimal.ONE);
        Urun urun6 = new Urun("karpuz", BigDecimal.ONE);
        Urun urun7 = new Urun("kulaklık", BigDecimal.ONE);
        Urun urun8 = new Urun("şarj aleti", BigDecimal.ONE);

        Paket paket = new Paket("Sebze paketi");
        paket.getUrunList().add(urun1);
        paket.getUrunList().add(urun2);

        Paket teknolojipaket = new Paket("teknoloji paketi");
        paket.getUrunList().add(urun7);
        paket.getUrunList().add(urun8);



        Sepet sepet = new Sepet("Karisik sepet");
        sepet.getPaketList().add(paket);
        sepet.getUrunList().add(urun3);

        Sepet sepet1 = new Sepet("Cerez sepet");
        sepet.getPaketList().add(paket);
        sepet.getUrunList().add(urun3);

        Kumanya kumanya = new Kumanya("Beleş");
        kumanya.getSepetList().add(sepet1);
        kumanya.getSepetList().add(sepet);

        System.out.println(kumanya.getFiyat());


    }
}
