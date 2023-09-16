package Design07AdapterPattern;

public class TelefonEEAdapter implements  ElektrikliEvAletleri{

    private  Telefon telefon;
    public TelefonEEAdapter(Telefon telefon){
        this.telefon=telefon;
    }
    @Override
    public int prizeTakVeCalistir() {
        return this.telefon.prizeTakVeCalistir();
    }
}
