package Design22StrategyDesign;

public class EsitAgirlik implements SinavStrategy {


    @Override
    public String getStrategyName() {
        return "Eşit ağırlık";
    }

    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.FEN;
    }
}
