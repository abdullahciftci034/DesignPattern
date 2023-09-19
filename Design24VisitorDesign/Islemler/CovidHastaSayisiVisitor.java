package Design24VisitorDesign.Islemler;

import Design24VisitorDesign.saglikbakanligi.*;

public class CovidHastaSayisiVisitor extends AbstractVisitor {



    @Override
    public boolean hastaSonuc(Hasta hasta){
        if(hasta.getEnumHastalik().equals(EnumHastalik.COVID))
            return true;
        return false;
    }



}
