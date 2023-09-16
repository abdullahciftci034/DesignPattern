package Design20ObserverDesign;

public class Termometre extends Observebla{
    private int anlikSicaklik;
    private int minSicaklik;
    private int maxSicaklik;


    public Termometre(int minSicaklik, int maxSicaklik) {
        super();
        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;

    }
    public int getAnlikSicaklik() {
        return anlikSicaklik;
    }

    public void setAnlikSicaklik(int anlikSicaklik) {
        System.out.println("Sicalik:" + anlikSicaklik );
        sicaklikKonrolEt();
        this.anlikSicaklik = anlikSicaklik;
    }
    public void sicaklikKonrolEt(){
        if(anlikSicaklik>=maxSicaklik || anlikSicaklik<=minSicaklik)
            update();
    }
}
