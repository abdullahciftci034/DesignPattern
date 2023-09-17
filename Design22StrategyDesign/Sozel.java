package Design22StrategyDesign;

public class Sozel implements SinavStrategy {
    @Override
    public String getStrategyName() {
        return "Sözel";
    }

    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.FEN;
    }
}
