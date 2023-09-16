package Design03FactoryDesign;

public class Main {
    public static void main(String[] args) {
        Telefon telefon=TelefonFactory.getTelefon("s8","1000mah",12,25);
        System.out.println(telefon);
        Telefon telefon1=TelefonFactory.getTelefon("note8","1000mah",32,10);
        System.out.println(telefon1);
        // burda ise bir fabrika olusturduk burdan nesnelerimizi olsuturduk
    }
}
