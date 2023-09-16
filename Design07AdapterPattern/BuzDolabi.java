package Design07AdapterPattern;

public class BuzDolabi  implements  ElektrikliEvAletleri{
    int volt=220;
    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }
}
