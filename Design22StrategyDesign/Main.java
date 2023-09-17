package Design22StrategyDesign;

public class Main {
    public static void main(String[] args) {
        SinavDurum sinavDurum =new SinavDurum(new EsitAgirlik());
        sinavDurum.SirasiIleCoz();

        SinavDurum sinavDurum1 =new SinavDurum(new Sayisal());
        sinavDurum1.SirasiIleCoz();
    }
}
