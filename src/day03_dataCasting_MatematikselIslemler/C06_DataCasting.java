package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        /* Soru : kullanıcıdan bir douuble sayı alın ve bir tam sayıya bölün sonucun tam sayı kısmını yazdırın

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalık sayı giriniz");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayiInt = scan.nextInt();
        System.out.println((int)(sayiDbl/sayiInt));

    }
}
