package Design10DecoratorDesign;

public class ImzaliRaporDecorator extends  RaporDecorator{
    public ImzaliRaporDecorator(String metin) {
        super(metin);
    }

    @Override
    public String getMetin() {
        return RaporUtil.imzaEkle(super.getMetin());
    }
}
