package Design19MementoDesign;

public class Main {
    public static void main(String[] args) {
        NotePad notePad=new NotePad();
        notePad.metinEkle("Merhaba");
        notePad.toString();
        notePad.metinEkle("nasilsin");
        notePad.toString();
        notePad.metinEkle("nabiyon");
        notePad.toString();

        notePad.geriAl();
        notePad.toString();
        notePad.geriAl();
        notePad.toString();
        notePad.metinEkle("Vay be kral");
        notePad.toString();
        notePad.geriAl();
        notePad.geriAl();
        notePad.geriAl();
        notePad.toString();
    }
}
