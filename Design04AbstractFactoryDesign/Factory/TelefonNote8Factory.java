package Design04AbstractFactoryDesign.Factory;

import Design04AbstractFactoryDesign.Model.Abstract.Telefon;
import Design04AbstractFactoryDesign.Model.TelefonNote8;

public class TelefonNote8Factory {
    public static Telefon getTelefon(String model, String batarya, int en, int boy){
        return new TelefonNote8(model, batarya, en, boy);
    }
}
