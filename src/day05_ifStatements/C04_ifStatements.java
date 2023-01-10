package day05_ifStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
        /* kullanıcıdan bir sayı alın
        3 e bolunebiliyorsa
        5 e bolune biliyorsa yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz");
        int sayi = scan.nextInt();

        /* İf cumlelerinde sart parantezinden sonra body kullanmazsak {süs lü parantez içi yani}
        ; e kadar olan kısmı body olarak kabul eder
        yani sadece bir satır kodu body olarak kabul eder
         */

        if (sayi%3==0) System.out.println("Sayi Uçün Tam katıdır");
        if (sayi%5==0) System.out.println("Sayi Uçün Tam katıdır");


        /*

        Bu da önceki öğrendiğimiz hali. Yani birden fazla satırlı olanlarda curly bracet kullanmak zorundayız

        if (sayi%3==0){
            System.out.println("Sayi Uçün Tam katıdır");
        }

        if (sayi%5==0){
            System.out.println("Sayi Uçün Tam katıdır");
        }

         */



    }
}
