package Design17IteratorDesign.ilk;

public class Main {
    public static void main(String[] args) {
        Kitap kitap =new Kitap();
        Fasikul fasikul =new Fasikul();

        for (Soru s:kitap.getSorus()) {
            System.out.println(s);
        }
        for (Soru s:fasikul.getSoruList()) {
            System.out.println(s);
        }
    }
}
