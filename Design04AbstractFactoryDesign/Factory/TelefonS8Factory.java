package Design04AbstractFactoryDesign.Factory;

import Design04AbstractFactoryDesign.Model.Abstract.Telefon;
import Design04AbstractFactoryDesign.Model.TelefonS8;

public class TelefonS8Factory {
    public static Telefon getTelefon(String model, String batarya, int en, int boy){
        return new TelefonS8(model, batarya, en, boy);
    }
}
