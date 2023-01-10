package SampleQuestions;

import java.util.Scanner;

public class Q4_dikdortgeninAlaniCevresi {
    public static void main(String[] args) {

       /* Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
          Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dikdortgenin uzun kenar uzunlugunu giriniz");
        int uzunKenar = scan.nextInt();
        System.out.println("Lütfen dikdortgenin kisa kenar uzunlugunu giriniz");
        int kisaKenar = scan.nextInt();
        System.out.println("Dikdortgenin Cevresinin Uzunlugu = " + 2*(uzunKenar+kisaKenar));
        System.out.println("Dikdortgenin alani = " + uzunKenar*kisaKenar);

    }
}
