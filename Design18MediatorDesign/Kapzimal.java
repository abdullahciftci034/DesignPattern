package Design18MediatorDesign;

import Design18MediatorDesign.halci.Halci;
import Design18MediatorDesign.uretici.Uretici;

public interface Kapzimal {
    void halciyeSat(Uretici uretici);
    void ureticidenAl(Halci halci);

    void UreticiEkle(Uretici uretici);
    void HalciEkle(Halci halci);
}
