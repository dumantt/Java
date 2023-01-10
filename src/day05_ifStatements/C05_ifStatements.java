package day05_ifStatements;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {

        /* kullanıcıdan bir harf alın harf ile başlayan ay varsa yazdırın

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz (aynı baş harfle başlayan bir ay adı yazdırmak için) ");
        char harf = scan.next().charAt(0);

        if (harf=='o') System.out.println("Ocak");
        if (harf=='s') System.out.println("Şubat");
        if (harf=='m') System.out.println("Mart veya Mayıs");
        if (harf=='n') System.out.println("Nisan");
        if (harf=='h') System.out.println("Haziran");
        if (harf=='t') System.out.println("Temmuz");
        if (harf=='a') System.out.println("Ağustos veya Aralık");
        if (harf=='e') System.out.println("Eylül veya Ekim");
        if (harf=='k') System.out.println("Kasım");

    }
}
