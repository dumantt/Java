package SampleQuestions;

import java.util.Scanner;

public class Q25_ebobGCDekokLCM {
    public static void main(String[] args) {


        /*
        Soru 22-)
Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
Giriş :
30 ve 40

Beklenen Çıktı:
30 ve 40 için EBOB= 10
30 ve 40 için EKOK= 120
ipucu:
Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.

         */

        Scanner scan = new Scanner(System.in);
        int ebob = 0;

        System.out.print("Küçük Sayıyı giriniz: ");
        int kucukSayi = scan.nextInt();
        System.out.print("Büyük Sayıyı giriniz: ");
        int buyukSayi = scan.nextInt();

        for(int i = 1; i < kucukSayi; i++)
        {
            if(kucukSayi % i == 0 && buyukSayi % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
        System.out.println("Ekok = " + buyukSayi*kucukSayi/ebob);
    }
}
