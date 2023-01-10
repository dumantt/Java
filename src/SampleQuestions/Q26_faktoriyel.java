package SampleQuestions;

import java.util.Scanner;

public class Q26_faktoriyel {
    public static void main(String[] args) {


        /*
        Soru 23-)
Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
Örnek:
Girdi: 6
Çıktı: 6!=65432*1=720
ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel= 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i ; }


        System.out.println("girdiginiz sayinin faktoriyel degeri = " + faktoriyel);


    }
}
