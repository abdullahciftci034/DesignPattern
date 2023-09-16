package Design17IteratorDesign.ilk;

public class Kitap {
    private Soru[] sorus;

    public Kitap() {
        this.sorus = new Soru[5];
        this.sorus[0]=new Soru(6L);
        this.sorus[1]=new Soru(7L);
        this.sorus[2]=new Soru(8L);
        this.sorus[3]=new Soru(9L);
        this.sorus[4]=new Soru(10L);
    }

    public Soru[] getSorus() {
        return sorus;
    }

    public void setSorus(Soru[] sorus) {
        this.sorus = sorus;
    }
}
