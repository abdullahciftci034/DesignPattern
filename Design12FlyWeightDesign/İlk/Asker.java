package Design12FlyWeightDesign.İlk;

public abstract class Asker {
    private MermiBoyutu mermiBoyutu;

    public Asker(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void AtesEt(){
        Mermi mermi =new Mermi(mermiBoyutu);
        mermi.mermiAtesleme();
    }
    public void Tara(){
        for (int i = 0; i < 5; i++) {
            Mermi mermi = new Mermi(mermiBoyutu);
            mermi.mermiAtesleme();
        }
    }
}
