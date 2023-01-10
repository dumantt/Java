package SampleQuestions;

import java.util.Scanner;

public class Q15_sayiBasamaklariHesaplama {
    public static void main(String[] args) {

        /*
        Soru 12-)
Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

Ipucu:  IF/Else kullanabilirsiniz.
Örnek:
İki tamsayı girin:
25  veya  4567986321453
46   veya 123456
Konsolda Çıktı :
Sayıların toplamı: 71  veya  Fazla Yüklenme
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayinizi giriniz");
        int ilkSayi = scan.nextInt();
        System.out.println("Lütfen ikinci sayinizi giriniz");
        int ikinciSayi = scan.nextInt();

        int toplam = ilkSayi+ikinciSayi;

        if (toplam >= 1000000000) {
            System.out.println("Fazla Yüklenme");
        } else {
            System.out.println(toplam);
        }
        // bunu string.lengthOf la da yapabiliriz
    }
}
