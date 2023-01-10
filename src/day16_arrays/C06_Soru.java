package day16_arrays;

public class C06_Soru {
    public static void main(String[] args) {

        //bir marketin fiyatlarini tutan bir array var
        //Bu marketteki en yüksek ve en düşük fiyatlari yazdiran bir method olusturun

        double [] fiyatlar = {23,34.5,42.1,5.7,3.4,23.5};
        enYuksekEnDusukFiyatYazdir(fiyatlar); // parantez iciyle aşşagi ayni olmak zorunda degil fiyatlar yerine abc de yazabilirdik

    }
    public static void enYuksekEnDusukFiyatYazdir(double[]fiyatlar){

        double enDusukFiyat = fiyatlar [0];
        double enYuksekFiyat = fiyatlar [0];

        for (int i = 0; i < fiyatlar.length; i++) {

            if (fiyatlar[i]< enDusukFiyat){ //daha küçük çıkarsa yeni küçük sabiti olarak onu yapiyor bir alt satirda
                enDusukFiyat=fiyatlar[i];
            }
            //eşitse işlem yapmiyor if çalışmamış oluyor
            //fiyatlar[0]< enDusukFiyat mesela  burasi ilk durumda eşit // double enDusukFiyat = fiyatlar [0];
            //enYuksekFiyat=fiyatlar[0] burasi da eşit  //  double enYuksekFiyat = fiyatlar [0];

            if (fiyatlar[i]> enYuksekFiyat){ //daha büyük çıkarsa yeni büyük sabiti olarak onu yapiyor bir alt satirda
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("Listedeki en dusuk fiyat : " + enDusukFiyat);
        System.out.println("Listedeki en yuksek fiyat : " + enYuksekFiyat);
    }
}
