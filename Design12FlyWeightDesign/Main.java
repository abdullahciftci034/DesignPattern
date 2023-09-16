package Design12FlyWeightDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AskerYuzbasi askerYuzbasi =new AskerYuzbasi();
        List<AskerEr> askerErList= new ArrayList<AskerEr>();
        for (int i = 0 ; i<50; i++){
            askerErList.add(new AskerEr());
        }
        askerYuzbasi.AtesEt();
        askerErList.forEach(e->e.AtesEt());
        askerErList.forEach(e->e.Tara());
    }
}
