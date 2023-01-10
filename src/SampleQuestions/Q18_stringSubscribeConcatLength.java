package SampleQuestions;

import java.util.Scanner;

public class Q18_stringSubscribeConcatLength {
    public static void main(String[] args) {

        /*
        Soru 15-)
Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
-> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
Örn:
	 isim1= masa
         isim2= ali
	 Konsol => maalisa
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen ilk ismi giriniz");
        String ilkIsim = scan.next();
        if (ilkIsim.length()%2==0) {
            System.out.println("lütfen ikinci isimi giriniz");
            String ikinciIsim =scan.next();

            int ilkKelime = ilkIsim.length();
            int kelimeYarisi = (ilkIsim.length())/2;
            int ikinciKelimeUzunluk = (ikinciIsim.length());

            String ilkyari = ilkIsim.substring(0, kelimeYarisi);
            String ikinciYari = ilkIsim.substring(kelimeYarisi,ilkKelime);

            System.out.println(ilkyari+ikinciIsim+ikinciYari);

        } else {
            System.out.println("isim2, isim1'e eklenemez lütfen yeniden deneyiniz");
        }
    }
}
