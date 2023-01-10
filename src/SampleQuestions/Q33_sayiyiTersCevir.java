package SampleQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q33_sayiyiTersCevir {
    public static void main(String[] args) {

        /*
        Soru-28)
        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        String sayi = scan.next();
        int uzunluk = sayi.length()-1;

        System.out.print("Sayının Tersi: ");

        for (int i = uzunluk; i >= 0 ; i--) {

            char a = sayi.charAt(i);

            System.out.print(a);
        }
    }
}
