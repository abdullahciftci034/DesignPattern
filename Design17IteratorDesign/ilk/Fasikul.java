package Design17IteratorDesign.ilk;

import java.util.ArrayList;
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

    public List<Soru> getSoruList() {
        return soruList;
    }

    public void setSoruList(List<Soru> soruList) {
        this.soruList = soruList;
    }
}
