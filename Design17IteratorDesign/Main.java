package Design17IteratorDesign;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Kitap kitap =new Kitap();
        Fasikul fasikul =new Fasikul();

//        for (Soru s:kitap.getSorus()) {
//            System.out.println(s);
//        }
//        for (Soru s:fasikul.getSoruList()) {
//            System.out.println(s);
//        }

        /**
         * burada ise itaretor ile yaptik
         */
        Iterator kitapItator=kitap.getSorus();
        Iterator fasikuItator=fasikul.getSoruList();
        fasikuItator.forEachRemaining(e-> System.out.println(e));
        kitapItator.forEachRemaining(e-> System.out.println(e));
    }


}
