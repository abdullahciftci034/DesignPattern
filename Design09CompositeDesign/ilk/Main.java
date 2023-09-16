package Design09CompositeDesign.ilk;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Urun urun = new Urun("patates", BigDecimal.TEN);
        Urun urun1 = new Urun("domates", BigDecimal.TEN);
        Urun urun2 = new Urun("elma", BigDecimal.valueOf(100));
        Urun urun3 = new Urun("salatalık", BigDecimal.TWO);
        Urun urun4 = new Urun("soğan", BigDecimal.ONE);

        Paket paket = new Paket("Sebze paketi");
        paket.getUrunList().add(urun1);
        paket.getUrunList().add(urun2);

        Sepet sepet = new Sepet("Karisik sepet");
        sepet.getPaketList().add(paket);
        sepet.getUrunList().add(urun3);

        System.out.println( sepet.getToplamFiyat());

    }
}
