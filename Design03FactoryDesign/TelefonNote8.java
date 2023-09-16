package Design03FactoryDesign;

public class TelefonNote8 implements  Telefon{
    private String model;
    private String batarya;
    private int en;
    private int boy;

    public TelefonNote8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getBatarya() {
        return this.batarya;
    }

    @Override
    public int getEn() {
        return this.en;
    }

    @Override
    public int getBoy() {
        return this.boy;
    }

}
