package Design24VisitorDesign.Islemler;

import Design24VisitorDesign.saglikbakanligi.*;

public class GripHastaSayisiVisitor extends AbstractVisitor {

    @Override
    public boolean hastaSonuc(Hasta hasta){
        if(hasta.getEnumHastalik().equals(EnumHastalik.GRIP))
            return true;
        return false;
    }



}
