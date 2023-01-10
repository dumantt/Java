package day07_TernaryOperatorsSwitchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

         /* kullanicidan bir tamsayi alin
           sayi rakam ise "girilen sayi rakam"
           sayi 2 basamakli ise "girilen sayi 2 basamakli"
           sayi 2 basamaktan buyukse "buyuk sayi" yazdirin
         */
        /*
          Eger if else cumleleri ELSE ile bitmiyorsa
          tum durumlari kapsamaz
          yani bazi degerler icin hic bir if body'si calismayabilir
          Bu tur sorulari cozerken
          sartlarin tamamini dikkatli yazmak gerekir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilenSayi = scan.nextInt();

        if (0<=girilenSayi && girilenSayi<10) System.out.println("girilen sayi bir rakamdır");
        else if (10<girilenSayi && girilenSayi<=99) System.out.println("girilen sayı iki basamaklıdır");
        else if (100<=girilenSayi ) System.out.println("buyuk sayi");

        /* hoca requirements in dışına çıkmıyoruz dediği için negatifleri yazmıyoruz
        ama aşşağıda ki iki farklı kodda negatif istenseydi yazılabilirlerdi ve dogru çalışıyrlar denedim
         */

        //else if (girilenSayi<0) System.out.println("negatif sayi");

        //else System.out.println("negatif sayı");




    }
}
