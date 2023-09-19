package Design24VisitorDesign;

import Design24VisitorDesign.Islemler.CovidHastaSayisiVisitor;
import Design24VisitorDesign.Islemler.GripHastaSayisiVisitor;
import Design24VisitorDesign.saglikbakanligi.*;

public class Main {
    public static void main(String[] args) {

        Hasta hasta=new Hasta("Abdullah", EnumHastalik.COVID, EnumHastalikDurumu.OlDU);
        Hasta hasta1=new Hasta("Adem", EnumHastalik.COVID, EnumHastalikDurumu.OlDU);
        Hasta hasta2=new Hasta("mehmet", EnumHastalik.COVID, EnumHastalikDurumu.OlDU);
        Hasta hasta3=new Hasta("Ayse", EnumHastalik.COVID, EnumHastalikDurumu.SAG);
        Hasta hasta4=new Hasta("Ali", EnumHastalik.COVID, EnumHastalikDurumu.OlDU);
        Hasta hasta5=new Hasta("Veli", EnumHastalik.COVID, EnumHastalikDurumu.OlDU);
        Hasta hasta6=new Hasta("Fatma", EnumHastalik.GRIP, EnumHastalikDurumu.SAG);
        Hasta hasta7=new Hasta("Zeynep", EnumHastalik.GRIP, EnumHastalikDurumu.OlDU);
        Hasta hasta8=new Hasta("Kadir", EnumHastalik.GRIP, EnumHastalikDurumu.OlDU);

        Hastahane hastahane=new Hastahane("Irmet hastahenesi");
        Hastahane hastahane1=new Hastahane("Çapa hastahenesi");
        Hastahane hastahane2=new Hastahane("İzmir devlet hastahenesi");

        hastahane.hastaEkle(hasta1);
        hastahane.hastaEkle(hasta2);
        hastahane.hastaEkle(hasta3);
        hastahane.hastaEkle(hasta4);
        hastahane1.hastaEkle(hasta5);
        hastahane1.hastaEkle(hasta6);
        hastahane1.hastaEkle(hasta7);
        hastahane2.hastaEkle(hasta8);


        Il il = new Il("İzmir");
        Il il1 = new Il("Istanbul");
        Il il2 = new Il("Tekirdağ");

        il.hastaneEkle(hastahane);
        il1.hastaneEkle(hastahane1);
        il2.hastaneEkle(hastahane2);


        Ulke turkiye=new Ulke("Türkiye");
        turkiye.IlEkle(il);
        turkiye.IlEkle(il1);
        turkiye.IlEkle(il2);

        Visitor visitor= new CovidHastaSayisiVisitor();
        System.out.println(turkiye.accept(visitor));
        Visitor visitor1= new GripHastaSayisiVisitor();
        System.out.println(turkiye.accept(visitor1));


    }
}
