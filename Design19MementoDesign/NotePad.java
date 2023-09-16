package Design19MementoDesign;

public class NotePad {
    private String metin;
    private Hafiza hafiza;

    public NotePad() {
        this.metin = "";
        this.hafiza = new Hafiza();
        this.hafiza.hafizayaEkle(this.metin);
    }

    public void geriAl(){
        this.metin=this.hafiza.hafizadanGeriAl();
    }

    public void metinEkle(String eklenecekMetin){
        this.metin = metin+" "+eklenecekMetin;
        this.hafiza.hafizayaEkle(this.metin);
    }

    public void setMetin(String metin) {
        this.metin = metin;
        this.hafiza.hafizayaEkle(this.metin);
    }


    @Override
    public String toString() {
        System.out.println(metin);
        return metin;
    }
}
