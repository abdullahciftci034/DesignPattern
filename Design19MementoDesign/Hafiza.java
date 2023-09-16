package Design19MementoDesign;

import java.util.ArrayList;
import java.util.List;

public class Hafiza {
    private List <String> metinler;

    public Hafiza() {
        this.metinler = new ArrayList<>();
    }

    public String hafizadanGeriAl() {
        if(this.metinler.isEmpty())
            throw  new ArrayIndexOutOfBoundsException();
        if(this.metinler.size() <= 1)
            return  "Bos aq";


        int sonEklenenIndex=this.metinler.size()-2;
        String sonEklenenMetin=this.metinler.get(sonEklenenIndex);

        this.metinler.remove(sonEklenenIndex);
        return sonEklenenMetin;
    }

    public void hafizayaEkle(String metin) {
        this.metinler.add(metin);
    }
}
