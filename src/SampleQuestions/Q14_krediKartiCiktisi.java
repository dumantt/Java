package SampleQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q14_krediKartiCiktisi {
    public static void main(String[] args) {

        /*
        Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String ad = scan.nextLine();
        int uzunlukAd = ad.length();
        String buyukAd = ad.toUpperCase();
        String ilkAd= buyukAd.substring(0,1);
        for (int i = 0; i <uzunlukAd-1 ; i++) {
            ilkAd = ilkAd+ '*';
        }
        System.out.println("Lutfen soyadinizi giriniz");
        String soyAd = scan.next();
        int uzunlukSoyAd = soyAd.length();
        String buyukSoyAd = soyAd.toUpperCase();
        String ilkSoyAd= buyukSoyAd.substring(0,1);
        for (int i = 0; i <uzunlukSoyAd-1 ; i++) {
            ilkSoyAd = ilkSoyAd+ '*';
        }
        System.out.println("Lutfen Kart Numaranizi giriniz");
        String kart = scan.next();
        int uzunlukKart = kart.length();

        if (uzunlukKart != 16) {
            System.out.println("Geçersiz kredi kartı numarası");
        } else {
            System.out.println("İsim : " + ilkAd + " " + ilkSoyAd);
            String kartSon = kart.substring(12, 16);
            System.out.println("CCN : **** **** **** " + kartSon);

        }
    }
}
