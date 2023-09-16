package Design06PrototipDesign;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date ilkDate1 = new Date();
        Belge belge1 = GenelEntityService.belgeOlustur((long)1,(long)0,(long)1);
        System.out.println(belge1);
        Date sonDate1=new Date();
        System.out.println("Geçen süre -> "+getSaniyeFarki(ilkDate1,sonDate1));

        Date ilkDate = new Date();
        Belge belge = GenelEntityService.belgeOlustur((long)1,(long)0,(long)1);
        System.out.println(belge);
        Date sonDate=new Date();
        System.out.println("Geçen süre -> "+getSaniyeFarki(ilkDate,sonDate));
        //burada belge olusturmanın maliyeti var ve bunu engelelemek için klonlama yapıcaz

        Date ilkDate2 = new Date();
        Belge belge2;
        try {
            belge2=belge.clone();
            System.out.println(belge2);
            belge2.setAdi("sdfasdf");
            belge2.getBelgeTuru().setAdi("sdfsadfsdf");
            Date sonDate2=new Date();
            System.out.println("Geçen süre -> "+getSaniyeFarki(ilkDate2,sonDate2));
            System.out.println(belge);
            System.out.println(belge2);
        }catch (Exception exception){
            exception.printStackTrace();
        }

    }
    private static  long getSaniyeFarki(Date ilkDate,Date sonDate){
        long time= 1000;
        return (sonDate.getTime()-ilkDate.getTime())/time;
    }

}
