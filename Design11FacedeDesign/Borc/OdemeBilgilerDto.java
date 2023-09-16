package Design11FacedeDesign.Borc;

public class OdemeBilgilerDto {
    private String kartUzerindekiIsım;
    private String kartNo;
    private long sonKullanmaAy;
    private long sonKullanmaYil;
    private long cvvNo;

    public OdemeBilgilerDto(String kartUzerindekiIsım, String kartNo, long sonKullanmaAy, long sonKullanmaYil, long cvvNo) {
        this.kartUzerindekiIsım = kartUzerindekiIsım;
        this.kartNo = kartNo;
        this.sonKullanmaAy = sonKullanmaAy;
        this.sonKullanmaYil = sonKullanmaYil;
        this.cvvNo = cvvNo;
    }

    public String getKartUzerindekiIsım() {
        return kartUzerindekiIsım;
    }

    public void setKartUzerindekiIsım(String kartUzerindekiIsım) {
        this.kartUzerindekiIsım = kartUzerindekiIsım;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public long getSonKullanmaAy() {
        return sonKullanmaAy;
    }

    public void setSonKullanmaAy(long sonKullanmaAy) {
        this.sonKullanmaAy = sonKullanmaAy;
    }

    public long getSonKullanmaYil() {
        return sonKullanmaYil;
    }

    public void setSonKullanmaYil(long sonKullanmaYil) {
        this.sonKullanmaYil = sonKullanmaYil;
    }

    public long getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(long cvvNo) {
        this.cvvNo = cvvNo;
    }
}
