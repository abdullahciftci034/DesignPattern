package Design22StrategyDesign;

public class SinavDurum {
    private SinavStrategy  sinavStrategy;

    public SinavDurum(SinavStrategy sinavStrategy) {
        this.sinavStrategy = sinavStrategy;
    }

    public   void SirasiIleCoz(){
        System.out.println(sinavStrategy.getStrategyName()+ " öğrencisi cozmeye basladi");
        System.out.println("1. "+this.sinavStrategy.getBirinci()+" cözülüyor");
        System.out.println("2. "+this.sinavStrategy.getIkinci()+" cözülüyor");
        System.out.println("3. "+this.sinavStrategy.getUcuncu()+" cözülüyor");
        System.out.println("4. "+this.sinavStrategy.getDorduncu()+" cözülüyor");
        System.out.println("---------------------------------------------------");
    }
}
