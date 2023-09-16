package Design10DecoratorDesign;

public class Main {
    public static void main(String[] args) {
        CigiliRaporDecorator cigiliRaporDecorator =new CigiliRaporDecorator(metin);
        System.out.println(cigiliRaporDecorator.getMetin());

        ImzaliRaporDecorator imzaliRaporDecorator = new ImzaliRaporDecorator(metin);
        System.out.println(imzaliRaporDecorator.getMetin());

        KucukRaporDecorator kucukRaporDecorator = new KucukRaporDecorator(metin,30);
        System.out.println(kucukRaporDecorator.getMetin());

    }

    public static String  metin="20 Ağustos 1960 tarihinde Mardin'in Kızıltepe ilçesinde doğdu. Musul'dan göç eden bir Türkmen ailesine mensuptur.[2] 1981'de Kara Harp Okulundan, 1982'de Topçu ve Füze Okulundan mezun oldu. 1985'te Kara Havacılık Okulunu bitirerek kara pilot oldu. 1990'da Kara Harp Akademisinde kurmay subaylık eğitimini tamamladı.[3]\n" +
            "\n" +
            "Kurmay subay olarak 1990-1993 yıllarında 2. Zırhlı Tugay ve 20. Zırhlı Tugay Komutanlıklarında şube müdürlüğü, 1993-1995 yıllarında Mısır'ın başkenti Kahire'de askerî ataşe yardımcılığı, 1995-1998 yılları arasında 9. Kolordu Komutanlığında karargâh subaylığı ve iç güvenlik tabur komutanlığı, 1998-2002 yılları arasında Kara Kuvvetleri Karargâhında şube müdürlüğü, 2002-2004 yılları arasında Millî Savunma Bakanlığı özel kalem müdürlüğü, 2004-2005 yılları arasında 49. İç Güvenlik Piyade Tugayı komutan yardımcılığı ve Muş garnizon komutanlığı, 2005-2006 yılları arasında 1. Ordu genel sekreterliği yaptı.[3]\n" +
            "\n" +
            "2006'da tuğgeneral rütbesine terfi etti ve 2. Zırhlı Tugay Komutanı olarak atandı. 2008'de Genelkurmay İletişim Daire Başkanlığı görevine getirildi.[3] Bu görevini yürütürken Ergenekon, Balyoz ve TSK ile ilgili diğer davalar hakkında TSK adına haftalık bilgilendirme toplantıları yaptı.[4][5][6][7][8][9][10][11]\n" +
            "\n" +
            "2010 yılında tümgeneral rütbesine terfi etti. Bu rütbede 2010-2013 arası Kara Harp Akademisi, 2013-2014 arası Kara Havacılık Okulu ve 2014-2015 arası Kara Havacılık Komutanlığı görevlerinde bulundu. 2015 yılında korgeneral rütbesine terfi etti ve 4. Kolordu komutanlığına atandı.";
}
