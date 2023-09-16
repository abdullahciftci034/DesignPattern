package Design20ObserverDesign;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {
        Termometre  termometre= new Termometre(10,20);
        Observer  ebeveyn=new Ebeveyn("Anne");
        Observer  ebeveyn1=new Ebeveyn("Baba");

        termometre.ekle(ebeveyn1);
        termometre.ekle(ebeveyn);

        //burda ise ekledeğimiz observerlara haber verdik onlar gözlemci oldular
        termometre.setAnlikSicaklik(11);
        for (int i = 0; i < 12; i++) {
            termometre.setAnlikSicaklik(termometre.getAnlikSicaklik()+1);
        }
        for (int i = 0; i < 13 ; i++) {
            termometre.setAnlikSicaklik(termometre.getAnlikSicaklik()-1);
        }
        termometre.setAnlikSicaklik(12);
        termometre.setAnlikSicaklik(12);


    }
}
