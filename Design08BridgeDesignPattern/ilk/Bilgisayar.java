package Design08BridgeDesignPattern.ilk;

public class Bilgisayar {
    private Spotify spotify;
    private Hoperlor hoperlor;

    public void MuzikCal(Muzik muzik){
        this.hoperlor.sesCal(spotify.muzikCal(muzik));
    }

    public Bilgisayar() {
        this.spotify = new Spotify();
        this.hoperlor = new Hoperlor();
    }
    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Hoperlor getHoperlor() {
        return hoperlor;
    }

    public void setHoperlor(Hoperlor hoperlor) {
        this.hoperlor = hoperlor;
    }
}
