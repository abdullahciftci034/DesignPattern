package Design12FlyWeightDesign.İlk;

public enum MermiBoyutu {
    UC(3),
    BES(5),
    YEDI (7);

    private  int boyut;
    MermiBoyutu(int boyut) {
        this.boyut=boyut;
    }
    public int getBoyut() {
        return boyut;
    }

    @Override
    public String toString() {
        return String.valueOf(boyut);
    }
}
