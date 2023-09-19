package Design24VisitorDesign.saglikbakanligi;

public class Hasta {
    private String adi;
    private EnumHastalik enumHastalik;
    private EnumHastalikDurumu enumHastalikDurumu;

    public Hasta(String adi, EnumHastalik enumHastalik, EnumHastalikDurumu enumHastalikDurumu) {
        this.adi = adi;
        this.enumHastalik = enumHastalik;
        this.enumHastalikDurumu = enumHastalikDurumu;
    }

    public Hasta() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumHastalik getEnumHastalik() {
        return enumHastalik;
    }

    public void setEnumHastalik(EnumHastalik enumHastalik) {
        this.enumHastalik = enumHastalik;
    }

    public EnumHastalikDurumu getEnumHastalikDurumu() {
        return enumHastalikDurumu;
    }

    public void setEnumHastalikDurumu(EnumHastalikDurumu enumHastalikDurumu) {
        this.enumHastalikDurumu = enumHastalikDurumu;
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "adi='" + adi + '\'' +
                ", enumHastalik=" + enumHastalik +
                ", enumHastalikDurumu=" + enumHastalikDurumu +
                '}';
    }
}
