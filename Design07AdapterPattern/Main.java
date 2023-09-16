package Design07AdapterPattern;

public class Main {
    public static void main(String[] args) {

        Priz priz = new Priz();

        //burda  normal yapik
        priz.ElektrikVer(new Utu());
        priz.ElektrikVer(new BuzDolabi());


        //burda ise adapter kullanarak yaptik
        TelefonEEAdapter telefonEEAdapter = new TelefonEEAdapter(new SamsungTelefon());
        priz.ElektrikVer(telefonEEAdapter);
        TelefonEEAdapter telefonEEAdapter1 = new TelefonEEAdapter(new Note8());
        priz.ElektrikVer(telefonEEAdapter1);

    }
}
