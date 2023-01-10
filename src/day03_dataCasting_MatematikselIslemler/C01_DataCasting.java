package day03_dataCasting_MatematikselIslemler;

public class C01_DataCasting {
    public static void main(String[] args) {
        short sayi2= 45;
        int sayi3= sayi2;
        //int = short degerin kapasitesi variabble in kapasitesinden kucuk oldugu icin sorun yok
        int sayi4= 45;
        double sayi5 = sayi4;
        //double = int degerin kapasitesi variabble in kapasitesinden kucuk oldugu icin sorun yok

        double sayi6 = 5;
        //int sayi7 = sayi6; gibi bir kod yazsaydık
        //int = double double olan degerin kapasitesi int olan variablein kapasitesinden buyuk
        // dolayısıyla java otomatik ceviri yapmaz

        int sayi8 = 99;
        //byte sayi9=sayi8;
        // aynı şekilde 99 sayısı byte tan büyük olacagı için java otomatik ceviri yapmaz

    }
}
