package Design07AdapterPattern;



public class SamsungTelefon implements Telefon {
    int volt= 15;
    @Override
    public int prizeTakVeCalistir() {
        return volt;
    }

}
