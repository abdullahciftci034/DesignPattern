package Design11FacedeDesign.Borc;

import java.util.Date;

public class Borc {
    private long id;
    private BorcTuru borcTuru;
    private Date vadeTarihi;
    private int borcTutari;

    public Borc() {
    }

    public Borc(long id, BorcTuru borcTuru, Date vadeTarihi, int borcTutari) {
        this.id = id;
        this.borcTuru = borcTuru;
        this.vadeTarihi = vadeTarihi;
        this.borcTutari = borcTutari;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BorcTuru getBorcTuru() {
        return borcTuru;
    }

    public void setBorcTuru(BorcTuru borcTuru) {
        this.borcTuru = borcTuru;
    }

    public Date getVadeTarihi() {
        return vadeTarihi;
    }

    public void setVadeTarihi(Date vadeTarihi) {
        this.vadeTarihi = vadeTarihi;
    }

    public int getBorcTutari() {
        return borcTutari;
    }

    public void setBorcTutari(int borcTutari) {
        this.borcTutari = borcTutari;
    }
}
