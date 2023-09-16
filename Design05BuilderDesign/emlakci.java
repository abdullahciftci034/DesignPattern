package Design05BuilderDesign;

public class emlakci {
    public static void main(String[] args) {
        Ev ev1= new Ev();
        ev1.setIl("Tokat");
        ev1.setIlce("Yeşilyurt");
        ev1.setMahalle("Çıkrık");
        ev1.setBinaYili(1950);
        ev1.setBalkonSayisi(1);
        ev1.setBalkonSayisi(2);
        ev1.setTuvaletSayisi(2);
        ev1.setDublex(true);
        ev1.setEsyali(true);
        ev1.setHasOtopark(true);
        ev1.setHasCocukParki(false);
        //burda tek tek her seyi yazdik ve burda tek tek olusturduk

        //burada ise contructure yolu ile olusturduk
        Ev ev2=new Ev( "Tokat", "Yeşilyurt", "Çıkrık",
        1950, 1, 2,2,
        true, true, true,false);

        // burada ise opsiyonel olusturduk
        Ev ev3 =new Ev("Çıkrık",1950,1, 2, 2);


        //burada ise builder nesnesi ile cok daha opsiyonel olusturduk
        EvBuilder evBuilder =new EvBuilder();
        Ev builderIleOlusanEv=evBuilder.setBalkonSayisi(2).setBinaYili(1950).build();


        //burda ise sadece belli kismlari  opsiyonel olarak belirledik
        Ev tokattakiev =TokattakiEmlakci1("Kuşçu", 1990,  2, 2,false, false);
        Ev tekirdagdakied =TekirdagdakiEmlakci1("Baglik", 2010,  2, 2,true, false);
        Ev tekirdagdakied1 =TekirdagdakiEmlakci1("Fevzi passa", 2010,  2, 2,true, false);


        printEv(ev1);
        printEv(ev2);
        printEv(ev3);
        printEv(builderIleOlusanEv);
        printEv(tokattakiev);
        printEv(tekirdagdakied);
        printEv(tekirdagdakied1);




    }
    private static Ev TokattakiEmlakci1(String mahalle, int binaYili ,  int tuvaletSayisi, int banyoSayisi,boolean isEsyaliboolean ,boolean isOtopark){
        EvBuilder evBuilder =new EvBuilder();
        evBuilder.setIl("Tokat")
                .setBalkonSayisi(1)
                .setDublex(false)
                .setIlce("Yesilturt");

        // sadece opsiyonel olanlari belirledik
        evBuilder.setMahalle(mahalle)
                .setHasOtopark(isOtopark)
                .setBinaYili(binaYili)
                .setEsyali(isEsyaliboolean)
                .setTuvaletSayisi(tuvaletSayisi)
                .setBanyoSayisi(banyoSayisi);
        return evBuilder.build();
    }


    private static Ev TekirdagdakiEmlakci1(String mahalle, int binaYili ,  int tuvaletSayisi, int banyoSayisi,boolean isEsyaliboolean ,boolean isOtopark){
        EvBuilder evBuilder =new EvBuilder();
        evBuilder.setIl("Tekirdag")
                .setBalkonSayisi(1)
                .setDublex(false)
                .setIlce("Cerkezkoy");

        // sadece opsiyonel olanlari belirledik
        evBuilder.setMahalle(mahalle)
                .setHasOtopark(isOtopark)
                .setBinaYili(binaYili)
                .setEsyali(isEsyaliboolean)
                .setTuvaletSayisi(tuvaletSayisi)
                .setBanyoSayisi(banyoSayisi);
        return evBuilder.build();
    }
    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev eklendi -> " + ev);;
    }

}
