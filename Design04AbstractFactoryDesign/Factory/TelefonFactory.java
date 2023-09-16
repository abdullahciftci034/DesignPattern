package Design04AbstractFactoryDesign.Factory;

import Design04AbstractFactoryDesign.Model.TelefonS8;
import Design04AbstractFactoryDesign.Model.Abstract.Telefon;
import Design04AbstractFactoryDesign.Model.TelefonNote8;

public class TelefonFactory {
    public static Telefon getTelefon(String model, String batarya, int en, int boy){
        Telefon telefon=null;
        if(model.equals("s8")){
            telefon=new TelefonS8(model, batarya, en, boy);
        }else if(model.equals("note8")){
            telefon=new TelefonNote8(model, batarya, en, boy);
        }
        return telefon;
    }
}
