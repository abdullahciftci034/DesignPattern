package Design13ProxyDesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalisanUtil {
    public static List<Calisan>  calisanList(){
        List<Calisan> calisanList =new ArrayList<>();

        calisanList.add(new Calisan("abdullah","123",true));
        calisanList.add(new Calisan("ayse","123",false));
        calisanList.add(new Calisan("mehmet","1234",true));
        return calisanList;
    }
    public static Map<String,Calisan> getKullaniciAdiCalisanMap(){
        Map <String,Calisan > stringCalisanMap=new HashMap<>();
        calisanList().forEach(e->stringCalisanMap.put(e.getKullaniciAdi(),e));
        return stringCalisanMap;
    }
 }
