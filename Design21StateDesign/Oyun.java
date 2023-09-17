package Design21StateDesign;

public class Oyun implements Konsol {
   private Konsol  konsol;

    public Oyun() {
        this.konsol = new Hucum();
    }

    @Override
    public void kareBas() {
        konsol.kareBas();
    }

    @Override
    public void ucgenBas() {
        konsol.ucgenBas();
    }

    @Override
    public void yuvarlakBas() {
        konsol.yuvarlakBas();
    }

    @Override
    public void xBas() {
        konsol.xBas();
    }
    public void topuKaptir(){
        System.out.println("Top kaptirildi");
        this.konsol=new Defans();
    }
    public void topuKazan(){
        System.out.println("Top alındi");
        this.konsol=new Hucum();
    }
}
