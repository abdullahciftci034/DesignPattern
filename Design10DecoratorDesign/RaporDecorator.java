package Design10DecoratorDesign;

public abstract class RaporDecorator implements  Rapor{
    private  String metin;
    public RaporDecorator (String metin) {

        this.metin = metin;
    }
    @Override
    public String getMetin() {
        return metin;
    }
}
