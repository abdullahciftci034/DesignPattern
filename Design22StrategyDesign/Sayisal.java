package Design22StrategyDesign;

public class Sayisal implements SinavStrategy {
    @Override
    public String getStrategyName() {
        return "Sayisal";
    }

    @Override
    public EnumDers getBirinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.FEN;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.SOSYAL;
    }
}
