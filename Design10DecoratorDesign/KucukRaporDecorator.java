package Design10DecoratorDesign;

public class KucukRaporDecorator extends RaporDecorator{
    private  int genislik;
    public KucukRaporDecorator(String metin,int genislik) {
        super(metin);
        this.genislik = genislik;
    }

    @Override
    public String getMetin() {
        return RaporUtil.RaporSigdir(super.getMetin(),genislik);
    }
}
