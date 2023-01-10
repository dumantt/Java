package day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseSttatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf girinizi");
        char  girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter <= 'z' ) {

           System.out.println((char)(girilenKarakter - 32));
           //System.out.println(girilenKarakter - 32));  BU ŞEKİLDE YAZARSAK RAKAMSAL DEGERİNİ VERİR
            // System.out.println(Character.toUpperCase(girilenKarakter)); BU ŞEKİLDE YAZARSAK DA ÇALIŞIYOR
        } else {
            System.out.println(girilenKarakter);
        }





    }
}
