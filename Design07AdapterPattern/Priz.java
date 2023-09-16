package Design07AdapterPattern;

public class Priz {
    public  void ElektrikVer(ElektrikliEvAletleri  elektrikliEvAletleri){
        int volt=elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizde "+ volt + " aliniyor.");
    }
}
