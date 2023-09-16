package Design17IteratorDesign;

public class Soru {
    private Long sira;

    public Soru(Long sira) {
        this.sira = sira;
    }

    public Soru() {
    }

    public Long getSira() {
        return sira;
    }

    public void setSira(Long sira) {
        this.sira = sira;
    }

    @Override
    public String toString() {
        return ""+sira;
    }
}
