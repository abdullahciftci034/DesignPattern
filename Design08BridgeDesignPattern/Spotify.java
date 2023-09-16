package Design08BridgeDesignPattern;

public class Spotify implements  MuzikCalar
{
    public String muzikCal(Muzik muzik){
        System.out.println("Spotifyda "+ muzik + " Calisyor" );
        return muzik.getSes();
    }


}
