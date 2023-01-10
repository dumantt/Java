package SampleQuestions;

import java.util.Scanner;

public class Q11_basamaklariTopla {
    public static void main(String[] args) {

        //Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        //Alttaki olmasi gereken cozüm Bu da benim yaptigim alternatif cozum

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi girin: ");
        int sayi= scan.nextInt();
        int birlerBasamagi = sayi%10;

        int yuzlerBasamagi = sayi/100;

        int onlarBasamagi = ((sayi/10) - (yuzlerBasamagi*10));

        System.out.println(birlerBasamagi+onlarBasamagi+yuzlerBasamagi);

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli sayi giriniz");
        int girilenSayi= scan.nextInt();


        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //sayi: 125
        birlerBasamagi=girilenSayi%10; // 5
        rakamlarToplami= rakamlarToplami+birlerBasamagi; // 0+5==5
        girilenSayi=girilenSayi/10; // 12

        birlerBasamagi=girilenSayi%10; //2
        rakamlarToplami=rakamlarToplami+birlerBasamagi; //7
        girilenSayi=girilenSayi/10; // 1

        birlerBasamagi= girilenSayi%10; // 1
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 7+1==8
        girilenSayi=girilenSayi/10; // 0

        System.out.println("Girilen uc basamakli sayinin rakamlari toplami: "+ rakamlarToplami);
         */

    }
}
