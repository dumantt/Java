package SampleQuestions;

import java.util.Scanner;

public class Q10_doubleToIntFloatToShort {
    public static void main(String[] args) {

        /*
        Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("double sayi giriniz");

        double sayiDouble = scan.nextDouble();

        int sayiInt = (int) sayiDouble;

        System.out.println(sayiInt);

/*
        Scanner scan = new Scanner(System.in);

        System.out.println("float sayi giriniz");

        float sayiFloat = scan.nextFloat();

        short sayiShort =(short)Math.round((double)sayiFloat * 10000);

        System.out.println(sayiShort);

 */


    }
}
