package Design04AbstractFactoryDesign;

import Design04AbstractFactoryDesign.Factory.TelefonNote8Factory;
import Design04AbstractFactoryDesign.Factory.TelefonS8Factory;
import Design04AbstractFactoryDesign.Model.Abstract.Telefon;
import Design04AbstractFactoryDesign.Factory.TelefonFactory;

public class Main {
    public static void main(String[] args) {
        Telefon telefon= TelefonFactory.getTelefon("s8","1000mah",12,25);
        System.out.println(telefon);
        Telefon telefon1= TelefonFactory.getTelefon("note8","1000mah",32,10);
        System.out.println(telefon1);
        // burda ise bir fabrika olusturduk burdan nesnelerimizi olsuturduk




        ///burda ise kendi facrikalarında ürettik
        Telefon telefon2= TelefonNote8Factory.getTelefon("s8","1000mah",12,25);
        System.out.println(telefon2);
        Telefon telefon3= TelefonS8Factory.getTelefon("note8","1000mah",32,10);
        System.out.println(telefon3);
        // burda ise bir fabrika olusturduk burdan nesnelerimizi olsuturduk
    }
}
