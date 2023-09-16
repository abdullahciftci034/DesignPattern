package Design13ProxyDesign;

public class GercekYonetici implements  SirketBilgileri{
    private int  ciro = 1000;
    @Override
    public int getCiro() {
        return this.ciro;
    }
}
