package Design12FlyWeightDesign;

import java.util.LinkedHashMap;
import java.util.Map;

public class MermiFactory {
    private  static Map<MermiBoyutu,Mermi> map =new LinkedHashMap<MermiBoyutu, Mermi>();
    public static Mermi mermiUret(MermiBoyutu mermiBoyutu){
        Mermi mermi = map.get(mermiBoyutu);
        if(mermi==null){
            mermi=new Mermi(mermiBoyutu);
            map.put(mermiBoyutu,mermi);
        }
        return  mermi;
    }
}
