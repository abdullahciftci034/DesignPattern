package Design24VisitorDesign.saglikbakanligi;

public interface Visitor {
    String visitHastahane(Hastahane hastahane);
    String visitIl(Il il);
    String visitUlke(Ulke ulke);
    boolean hastaSonuc(Hasta  hasta);
}
