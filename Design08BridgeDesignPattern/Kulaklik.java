package Design08BridgeDesignPattern;

public class Kulaklik implements  SesCihazi{


    @Override
    public void sesCal(String ses) {
        System.out.println("Kulaklıktan ses caliyor -> "+ ses);
    }
}
