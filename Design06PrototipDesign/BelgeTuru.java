package Design06PrototipDesign;

public class BelgeTuru  implements   Cloneable {
    private String adi;
    private long id;

    public BelgeTuru() {
    }

    public BelgeTuru(String adi, long id) {
        this.adi = adi;
        this.id = id;
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
        return "BelgeTuru{" +
                "adi='" + adi + '\'' +
                ", id=" + id +
                '}';
    }


}
