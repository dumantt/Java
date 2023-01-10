package day05_ifStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        /* kullanıcıdan bir sayı alın

        sayi pozitif ise pozitif sayı yazdırın

        100-999 arasında ise "üç basamaklı pozitif sayı" yazdırın


        3 ile bölünebiliyorsa "üçün katı yazdcdırın

        birler basamagı 7 ise "mukemmel yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        if (0<sayi){
            System.out.println("Pozitif Sayı");
        }

        if (sayi<0){
            System.out.println("Negatif sayı");
        }

        if (10<=sayi && sayi<100){
            System.out.println("Iki Basamaklı Pozitif Sayi");
        }

        if (100<= sayi && sayi <1000){
            System.out.println("Uc basamaklı pozitif sayi");
        }

        if (sayi%3==0) {
            System.out.println("Sayı üç'ün katıdır ");
        }

        if (sayi%10==7 || sayi%7==-7 ){
            System.out.println("Mükemmel");
        }

    }
}
