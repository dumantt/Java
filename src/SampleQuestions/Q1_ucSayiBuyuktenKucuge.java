package SampleQuestions;

import java.util.Scanner;

public class Q1_ucSayiBuyuktenKucuge {
    public static void main(String[] args) {

        /*
        Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
ornek:
• Giriş:
İlk sayı: 4
İkinci sayi: 8
Üçüncü sayı: 1

• Çıktı:
En büyük sayı: 8
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk tam sayinizi giriniz");
        int a = scan.nextInt();
        System.out.println("Lütfen ikinci tam sayinizi giriniz");
        int b = scan.nextInt();
        System.out.println("Lütfen ucuncu tam sayinizi giriniz");
        int c = scan.nextInt();

        if (a>b&&a>c) System.out.println("En buyuk sayi = " + a);
        else if (b>a&&b>c) System.out.println("En buyuk sayi = " + b);
        else if (c>a&&c>b) System.out.println("En buyuk sayi = " + c);
        else System.out.println("Yanlis giris yaptiniz lütfen tekrar deneyiniz");
    }
}
