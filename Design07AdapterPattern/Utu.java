package Design07AdapterPattern;

public class Utu implements ElektrikliEvAletleri {
    int volt = 220;

    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }

}
