package Design01Sigleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            SingletonDesign.getSingletonDesigns();
            //Nesne 1 defa olusturuldu
            //burada Program başlarken oluşan nesneler var ve bu nesneler kullanılabilir duruma gelir. isenilen herde çağrılabilir.
            // bu işleme eagerloading erken yükleme denir
        }
    }
}
