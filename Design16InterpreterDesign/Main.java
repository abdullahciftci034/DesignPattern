package Design16InterpreterDesign;

import Design16InterpreterDesign.yorumlayici.KargaDiliYorumlayici;
import Design16InterpreterDesign.yorumlayici.KusDiliYorumlayici;

public class Main {

    public static void main(String[] args) {

        String kusSozu = getKusSozu();
        String kargaSozu = getKargaSozu();

        yazdir(kusSozu, (Yorumlayici) new KusDiliYorumlayici());
        yazdir(kargaSozu, (Yorumlayici) new KargaDiliYorumlayici());

    }

    private static void yazdir(String kusSozu, Yorumlayici yorumlayici) {
        String turkce = yorumlayici.yorumla(kusSozu);
        System.out.println(turkce);
    }

    private static String getKusSozu() {
        return "Sacadıcık Bacahacadıcır Mecemiciş cacacıcık yecer";
    }

    private static String getKargaSozu() {
        return "Sagadıgık Bagahagadıgır Megemigiş cagacıgık yeger";
    }
}
