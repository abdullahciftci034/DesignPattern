package Design10DecoratorDesign;

public class RaporUtil {

    public static String GetCizgiliMetin(String metin) {
        String [] satirlist=metin.split("\n");
        metin="";
        for (String m: satirlist){
            String cizgiliSatir=SatiraCizgiEkle(m);
            metin+=cizgiliSatir;
        }
        return metin;
    }

    private static String SatiraCizgiEkle(String m) {
        if(m.trim().length()==0){
            m="\n";

        }else{
            m="\n-"+m;
        }
        return m;
    }

    public static String RaporSigdir(String metin, int genislik) {
        String [] satirlist=metin.split("\n");
        metin="";
        for (String m: satirlist) {
            String cizgiliSatir = (m);
            if (m.length() < genislik) {
                metin += m + "\n";
            } else {
                metin+=MetinSigdir(m,genislik);
            }
        }
        return metin;
    }

    private static String MetinSigdir(String m, int genislik) {
        String[] parts = m.split("(?<=\\G.{"+genislik+"})");
        m="";
        for (String metin: parts){
            m+=metin+"\n";
        }
        return m;
    }

    public static String imzaEkle(String metin) {
       return metin+= "\n Auther: Abdullah Çiftçi ";
    }
}
