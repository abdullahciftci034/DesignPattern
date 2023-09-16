package Design14ChainOfResposibility;

public enum EnumIl {
    ISTANBUL("istanbul"),
    ANKARA("ankara"),
    CANKIRI("çankırı"),
    KARS("kars"),
    ANTALYA("antalya");
    private String il;

    EnumIl(String il) {
        this.il = il;
    }

    @Override
    public String toString() {
        return il;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }
}
