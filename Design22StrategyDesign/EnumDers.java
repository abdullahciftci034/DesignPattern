package Design22StrategyDesign;

public enum EnumDers {
    TURKCE("Türkçe")
    ,MATEMATIK("Matematik")
    ,FEN("Fen")
    ,SOSYAL("Sosyal");
    private String ders;

    EnumDers(String ders) {
        this.ders = ders;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }
}
