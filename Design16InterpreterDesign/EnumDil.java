package Design16InterpreterDesign;

public enum EnumDil {
    Karga("Karga","ga"),
    Kus("Kuş","ca");
    private String isim;
    private String hece;

    EnumDil(String isim, String hece) {
        this.isim = isim;
        this.hece = hece;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getHece() {
        return hece;
    }

    public void setHece(String hece) {
        this.hece = hece;
    }
}
