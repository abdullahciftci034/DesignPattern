package Design10DecoratorDesign;

public class CigiliRaporDecorator extends   RaporDecorator{

    public CigiliRaporDecorator(String metin) {
        super(metin);
    }
    @Override
    public String getMetin() {
        return RaporUtil.GetCizgiliMetin(super.getMetin());
    }

}
