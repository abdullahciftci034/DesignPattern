package Design17IteratorDesign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fasikul {
    private List<Soru> soruList;

    public Fasikul() {
        this.soruList = new ArrayList<>();;
        this.soruList.add(new Soru(1L));
        this.soruList.add(new Soru(2L));
        this.soruList.add(new Soru(3L));
        this.soruList.add(new Soru(4L));
        this.soruList.add(new Soru(5L));
    }

    public Iterator getSoruList() {
        return soruList.listIterator();
    }

    public void setSoruList(List<Soru> soruList) {
        this.soruList = soruList;
    }
}
