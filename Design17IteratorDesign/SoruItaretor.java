package Design17IteratorDesign;

import java.util.Iterator;

public class SoruItaretor implements Iterator<Soru> {
    private Soru[] sorus;
    private int sira;

    public SoruItaretor(Soru[] sorus) {
        this.sorus = sorus;
        this.sira=-1;

    }

        @Override
    public boolean hasNext() {
        if(sira<sorus.length-1){
            sira++;
            return true;
        }
        return false;
    }

    @Override
    public Soru next() {
        return this.sorus[this.sira];
    }
}
