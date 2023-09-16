package Design06PrototipDesign;

public class Kategory   implements   Cloneable{
    private long id;
    private String adi;


    public Kategory() {
    }

    public Kategory(long id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kategory{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                '}';
    }
}
