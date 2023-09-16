package Design08BridgeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Bilgisayar bilgisayar =new Bilgisayar();
        MuzikCalar muzikCalar= new Spotify();
        SesCihazi sesCihazi= new Kulaklik();
        bilgisayar.setMuzikCalar(muzikCalar);
        bilgisayar.setSesCihazi(sesCihazi);
        bilgisayar.MuzikCal(new Muzik("Barış Manço ","Gül Pembe"));

    }
}
