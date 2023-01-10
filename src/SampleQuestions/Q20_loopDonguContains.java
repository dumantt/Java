package SampleQuestions;

import java.util.Scanner;

public class Q20_loopDonguContains {
    public static void main(String[] args) {

        /*
        Soru 17-)
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
Örnek:
char ch1=            'a'
String name =     "Ali bakkala geç gitti."
Beklenen Çıktı=    a sayısı = 3
Ipucu:
Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        int sayac = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if ((cumle.charAt(i) == krk)) {
                sayac++;
            }
        }

        if (sayac != 0) {
            System.out.println(krk + " karakteri : " + sayac + " adet bulunmaktadir");
            } else {
                System.out.println("Girilen harf girilen cumlede bulunmamaktadir.");
            }

    }
}
