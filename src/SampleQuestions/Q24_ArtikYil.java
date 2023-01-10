package SampleQuestions;

import java.util.Scanner;

public class Q24_ArtikYil {
    public static void main(String[] args) {


        /*
        Soru 21-)
Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
ipucu2:
ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen tarihi arasina slash (/) koyarak Ay Ay Yıl Yıl Yıl Yıl olarak giriniz Ör: 01/2000");
        String tarih = scan.next();
        String tarih1 = tarih.replaceAll("/","");
        String ay0 = tarih1.substring(0,2);
        int ay = Integer.parseInt(ay0);
        String yil0 =tarih1.substring(2,6);
        String yilSonIki = tarih1.substring(4,6);
        int yil = Integer.parseInt(yil0);
        int yilSon2 = Integer.parseInt(yilSonIki);
        boolean sonIki = yilSon2!=00;
        boolean bolu400 = yil%400==0;
        boolean bolu4 = yil%4==0;

        if (yil%400==0) {

            switch (ay) {
                case 1:
                    System.out.println("ocak " + yil + " 31 gündür");
                    break;
                case 2:
                    System.out.println("şubat " + yil + " 29 gündür");
                    break;
                case 3:
                    System.out.println("mart " + yil + " 31 gündür");
                    break;
                case 4:
                    System.out.println("nisan " + yil + " 30 gündür");
                    break;
                case 5:
                    System.out.println("mayıs " + yil + " 31 gündür");
                    break;
                case 6:
                    System.out.println("haziran " + yil + " 30 gündür");
                    break;
                case 7:
                    System.out.println("temmuz " + yil + " 31 gündür");
                    break;
                case 8:
                    System.out.println("ağustos " + yil + " 31 gündür");
                    break;
                case 9:
                    System.out.println("eylül " + yil + " 30 gündür");
                    break;
                case 10:
                    System.out.println("ekim " + yil + " 31 gündür");
                    break;
                case 11:
                    System.out.println("kasım " + yil + " 30 gündür");
                    break;
                case 12:
                    System.out.println("aralık " + yil + " 31 gündür");
                    break;
            }
        } else if (yil%4==0 && yilSon2!=0) {
            switch (ay) {
                case 1:
                    System.out.println("ocak " + yil + " 31 gündür");
                    break;
                case 2:
                    System.out.println("şubat " + yil + " 29 gündür");
                    break;
                case 3:
                    System.out.println("mart " + yil + " 31 gündür");
                    break;
                case 4:
                    System.out.println("nisan " + yil + " 30 gündür");
                    break;
                case 5:
                    System.out.println("mayıs " + yil + " 31 gündür");
                    break;
                case 6:
                    System.out.println("haziran " + yil + " 30 gündür");
                    break;
                case 7:
                    System.out.println("temmuz " + yil + " 31 gündür");
                    break;
                case 8:
                    System.out.println("ağustos " + yil + " 31 gündür");
                    break;
                case 9:
                    System.out.println("eylül " + yil + " 30 gündür");
                    break;
                case 10:
                    System.out.println("ekim " + yil + " 31 gündür");
                    break;
                case 11:
                    System.out.println("kasım " + yil + " 30 gündür");
                    break;
                case 12:
                    System.out.println("aralık " + yil + " 31 gündür");
                    break;
            }
        }        else  {
            switch (ay) {
                case 1:
                    System.out.println("ocak " + yil + " 31 gündür");
                    break;
                case 2:
                    System.out.println("şubat " + yil + " 28 gündür");
                    break;
                case 3:
                    System.out.println("mart " + yil + " 31 gündür");
                    break;
                case 4:
                    System.out.println("nisan " + yil + " 30 gündür");
                    break;
                case 5:
                    System.out.println("mayıs " + yil + " 31 gündür");
                    break;
                case 6:
                    System.out.println("haziran " + yil + " 30 gündür");
                    break;
                case 7:
                    System.out.println("temmuz " + yil + " 31 gündür");
                    break;
                case 8:
                    System.out.println("ağustos " + yil + " 31 gündür");
                    break;
                case 9:
                    System.out.println("eylül " + yil + " 30 gündür");
                    break;
                case 10:
                    System.out.println("ekim " + yil + " 31 gündür");
                    break;
                case 11:
                    System.out.println("kasım " + yil + " 30 gündür");
                    break;
                case 12:
                    System.out.println("aralık " + yil + " 31 gündür");
                    break;
            }
        }
    }
}
