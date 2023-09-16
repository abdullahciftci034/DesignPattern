package Design07AdapterPattern;

public class Note8 implements  Telefon{
    int volt = 20;
    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }
}
