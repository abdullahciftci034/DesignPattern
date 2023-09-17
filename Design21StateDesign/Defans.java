package Design21StateDesign;

public class Defans implements Konsol {
    @Override
    public void kareBas() {
        System.out.println("1 den fazla oyuncu takip ediyor");
    }

    @Override
    public void ucgenBas() {
        System.out.println("Serbest bırak");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Ayağına kay");
    }

    @Override
    public void xBas() {
        System.out.println("Press yap");
    }
}
