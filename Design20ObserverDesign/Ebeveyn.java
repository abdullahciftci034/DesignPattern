package Design20ObserverDesign;

public class Ebeveyn implements  Observer{
    private String isim;

    public Ebeveyn(String isim) {
        this.isim = isim;
    }

    @Override
    public void update(Observebla observebla) {
        if(observebla instanceof Termometre){
            Termometre  termometre =  (Termometre) observebla;
            System.out.println(isim+" dedi ki : ooo sicaklik "+ termometre.getAnlikSicaklik() + " olmuş");
        }
    }
}
