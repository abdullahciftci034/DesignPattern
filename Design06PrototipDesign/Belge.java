package Design06PrototipDesign;

public class Belge  implements   Cloneable{
    private long id;
    private String adi;
    private  BelgeTuru belgeTuru;
    private  Kategory kategory;

    public Belge() {
    }

    public Belge(long id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BelgeTuru getBelgeTuru() {
        return belgeTuru;
    }

    public void setBelgeTuru(BelgeTuru belgeTuru) {
        this.belgeTuru = belgeTuru;
    }

    public Kategory getKategory() {
        return kategory;
    }

    public void setKategory(Kategory kategory) {
        this.kategory = kategory;
    }

    @Override
    public String toString() {
        return "Belge{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", belgeTuru=" + belgeTuru +
                ", kategory=" + kategory +
                '}';
    }

    @Override
    public Belge clone() throws CloneNotSupportedException {
        return (Belge) super.clone();
    }
}
