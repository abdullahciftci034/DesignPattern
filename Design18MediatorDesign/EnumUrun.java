package Design18MediatorDesign;

public enum EnumUrun {
    DOMATES("Domates"),
    PATATES("Patates");
    private String isim;

    EnumUrun(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
