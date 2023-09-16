package Design03FactoryDesign;

public class TelefonFactory {
    public static Telefon getTelefon(String model,String batarya,int en,int boy){
        Telefon telefon=null;
        if(model.equals("s8")){
            telefon=new TekefonS8(model, batarya, en, boy);
        }else if(model.equals("note8")){
            telefon=new TelefonNote8(model, batarya, en, boy);
        }
        return telefon;
    }
}
