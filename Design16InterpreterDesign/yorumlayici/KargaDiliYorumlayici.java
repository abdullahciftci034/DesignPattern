package Design16InterpreterDesign.yorumlayici;


import Design16InterpreterDesign.dil.KargaDili;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class KargaDiliYorumlayici implements Yorumlayici {

    @Override
    public String yorumla(String soz) {

        KargaDili kargaDili = new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
