package Design12FlyWeightDesign.İlk;

public class Mermi {
    private MermiBoyutu mermiBoyutu;

    public Mermi(MermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void mermiAtesleme(){
        System.out.println(mermiBoyutu+ " mermi ateşlendi.");
    }

}
