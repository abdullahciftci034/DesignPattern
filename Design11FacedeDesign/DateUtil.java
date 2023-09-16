package Design11FacedeDesign;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date getTarihinGunu(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateStr=simpleDateFormat.format(new Date());
        Date date=null;
        try {
            date=simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }
    public static int gunFarkiHesapla(Date ilkTarih,Date sonTarih){
        return  ilkTarih.compareTo(sonTarih);
    }
    public static Long tarihinYili(){
        return  Long.valueOf(new SimpleDateFormat("yyyy").format(new Date()));
    }
    public static Long tarihinAyi(){
        return  Long.valueOf(new SimpleDateFormat("MM").format(new Date()));
    }
    public static Date tarihOlustur(String str){
        Date date;
        try {
             date = new SimpleDateFormat("dd.MM.yyyy").parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

}
