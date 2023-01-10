package SampleQuestions;

import java.util.Scanner;

public class Q19_stringKismiKopyalama {
    public static void main(String[] args) {

        /*
        Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
                   Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
                   Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                   Loopun içerisinde StringM methodlarından  yararlanalım!
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String ilkIsim = scan.next();
        if (ilkIsim.length()>=5) {

            int ilkKelime = ilkIsim.length();
            int kelimeSonUc = (ilkIsim.length())-3;

            String sonUC = ilkIsim.substring(kelimeSonUc,ilkKelime);

            System.out.println(sonUC+sonUC);

        } else {
            System.out.println("Bes harften kisa kelime girilemez lütfen yeniden deneyiniz");
        }
    }
}
