package Design08BridgeDesignPattern;

public class Bilgisayar {
    private MuzikCalar muzikCalar;
    private  SesCihazi sesCihazi;


    public void MuzikCal(Muzik muzik){
        this.sesCihazi.sesCal(this.muzikCalar.muzikCal(muzik));
    }

    public MuzikCalar getMuzikCalar() {
        return muzikCalar;
    }

    public void setMuzikCalar(MuzikCalar muzikCalar) {
        this.muzikCalar = muzikCalar;
    }

    public SesCihazi getSesCihazi() {
        return sesCihazi;
    }

    public void setSesCihazi(SesCihazi sesCihazi) {
        this.sesCihazi = sesCihazi;
    }
}
