package Design06PrototipDesign;

public class GenelEntityService {

    public   static Belge belgeOlustur(Long belgeTuruId,Long kategoryIdTuru, Long belgeId){
        Belge belge= GenelEntityService.getBelgeById(belgeId);
        belge.setKategory(GenelEntityService.getKategoryById(kategoryIdTuru));
        belge.setBelgeTuru(GenelEntityService.getBelgeTuruById(belgeTuruId));
        return  belge;
    }


    public static  BelgeTuru getBelgeTuruById(Long id){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        BelgeTuru  belgeTuru =new BelgeTuru();
        if(id == 0){
            belgeTuru.setAdi("Özel");
        }
        else if(id == 1){
            belgeTuru.setAdi("Kurumsal");
        }
        else{
            belgeTuru.setAdi("Genel");
        }
        return belgeTuru;
    }
    public static Kategory getKategoryById(Long id){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        Kategory  belgeTuru =new Kategory();
        if(id == 0){
            belgeTuru.setAdi("Finans");
        }
        else if(id == 1){
            belgeTuru.setAdi("Yapılacaklar");
        }
        else{
            belgeTuru.setAdi("Genel");
        }
        return belgeTuru;
    }
    public static Belge getBelgeById(Long id){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        Belge  belgeTuru =new Belge();
        if(id == 0){
            belgeTuru.setAdi("Kareli");
        }
        else if(id == 1){
            belgeTuru.setAdi("çizgili");
        }
        else{
            belgeTuru.setAdi("Genel");
        }
        return belgeTuru;
    }


}
