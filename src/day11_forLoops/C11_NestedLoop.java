package day11_forLoops;

import java.util.Scanner;

public class C11_NestedLoop {
    public static void main(String[] args) {
         /*
        input degerine kadar her satirda * sayisini bir artirip
        sonra azaltarak asagidaki sekli yazdirin
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
         */

        // Bunu ben yaptim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <= girilenSayi; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = (girilenSayi-1); i>=0 ; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }


        /*
        int input= 5;
        // artis kismi icin nested loop
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // azalis kismi icin nested loop
        for (int i = input-1 ; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

         */

    }
}
