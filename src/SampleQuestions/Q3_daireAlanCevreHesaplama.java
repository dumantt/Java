package SampleQuestions;

import java.util.Scanner;

public class Q3_daireAlanCevreHesaplama {
    public static void main(String[] args) {

      /*  Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
* r=7;
* Pi=3.14
* Dairenin Cevresi : 2*Pi*r
* Dairenin Alani : Pi*r*r

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dairenin capini giriniz");
        int cap = scan.nextInt();
        int yariCap = cap/2;
        double pi = 3.14;

        System.out.println("Daire'nin cevresi = " + (2*pi*cap));
        System.out.println("Daire'nin alani = " + (pi*yariCap*yariCap));
    }
}
