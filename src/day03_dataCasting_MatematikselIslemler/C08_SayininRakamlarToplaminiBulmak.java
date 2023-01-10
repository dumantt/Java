package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulmak {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan 4 basamaklı bir tamsayı iste
        // sayinin rakamlarinin toplamini bul

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamakli bir tam sayi giriniz");

        int girilenSayi = scan.nextInt(); //2457


        // soru için lazim olacak variableleri hazırlayalım

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        //sirasiyla her bir basamagi bulum rakamlar tplamina ekleyelim

        birlerBasamagi = girilenSayi%10; //7
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //0+7=7
        girilenSayi = girilenSayi/10; //245

        birlerBasamagi = girilenSayi%10; //5
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //7+5=12
        girilenSayi = girilenSayi/10; //24

        birlerBasamagi = girilenSayi%10; //4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //12+4=16
        girilenSayi = girilenSayi/10; //2

        birlerBasamagi = girilenSayi%10; //2
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //16+2=18
        girilenSayi = girilenSayi/10; //0

        System.out.println("Girilen sayini rakamlar toplami : " + rakamlarToplami);

        // daha kolay çözümleri olabilir ogrenmeye calistigimiz icin bu ornek
        // ayrıca sınırlı dort islem de kalıyor sınırsız da yapabiliriz



    }
}
