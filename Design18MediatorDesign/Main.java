package Design18MediatorDesign;

import Design18MediatorDesign.halci.Halci;
import Design18MediatorDesign.uretici.Uretici;

public class Main {
    public static void main(String[] args) {
        Kapzimal kapzimal=new KabzimalImp();
        Halci ademHalci=new Halci("Adem",EnumUrun.DOMATES,12,kapzimal);
        new Halci("Mehmet",EnumUrun.DOMATES,15,kapzimal);
        new Halci("Ali",EnumUrun.DOMATES,13,kapzimal);
        new Halci("Kazım",EnumUrun.PATATES,21,kapzimal);
        new Halci("Yusuf",EnumUrun.PATATES,20,kapzimal);

        new Uretici("Yunus",EnumUrun.PATATES,8,kapzimal);
      Uretici emreUretici=  new Uretici("Emre",EnumUrun.PATATES,12,kapzimal);
        new Uretici("Mehmet",EnumUrun.PATATES,20,kapzimal);
        new Uretici("Hamza",EnumUrun.DOMATES,12,kapzimal);
        new Uretici("Ömer",EnumUrun.DOMATES,24,kapzimal);
        new Uretici("Hakkı",EnumUrun.DOMATES,23,kapzimal);

        emreUretici.urunSat();
        ademHalci.urunAl();
    }
}
