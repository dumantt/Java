package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C07_Modulus {
    public static void main(String[] args) {

        // % Modulus : java da bolme işlemi sonucunda kalan sayiyi verir

        System.out.println(15%4); //3
        System.out.println(45%4); //1

        /* kullanicinin girdiği deger çift sayı mı?
        girilenSayi % 2 isleminin sonucu 0 ise çift sayi

        kullanıcının girdigi sayı 7 nin katı mı ?
         girilenSayi % 7 isleminin sonucu 0 ise 7'nin katıdır

          */


        int girilenSayi =3426;
        int birlerBasamagi = girilenSayi%10; //6
        System.out.println("Birler basamağı : " + birlerBasamagi);

        girilenSayi = girilenSayi/10;
        System.out.println(girilenSayi); //342

        /////---/////

        birlerBasamagi = girilenSayi%10; //2
        System.out.println("Birler basamağı : " + birlerBasamagi);

        girilenSayi = girilenSayi/10;
        System.out.println(girilenSayi); // 34

        /////---/////

        birlerBasamagi = girilenSayi%10; //4
        System.out.println("Birler basamağı : " + birlerBasamagi);

        girilenSayi = girilenSayi/10;
        System.out.println(girilenSayi); // 3


        /////---/////

        birlerBasamagi = girilenSayi%10; //3
        System.out.println("Birler basamağı : " + birlerBasamagi);

        girilenSayi = girilenSayi/10;
        System.out.println(girilenSayi); // 0


    }
}
