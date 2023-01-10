package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /* Kullanicidan iki sayı alıp ikisinin degerlerini degiştirin
        Kullanicinin girdigi degerler
        sayi1=20   sayi2=10 ise

        siz kod ile bunların degerlerni degiştirip sayı1=20    sayi2=10 yapin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi1 giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen sayi2 giriniz");
        int sayi2 = scan.nextInt();

        int temp ;
        /* 3. kova kuralı  birbirleriyle yer değiştirmelri için ücüncü kova lazım ucuncu kova temp
        birinci ve ikinci kova sayi1 ve sayi 2

         */
        temp = sayi2;
        //sayi2 nin degerini temp e atadik
        sayi2=sayi1;
        //sayi1 nin degerini sayi2 ye atadik
        sayi1=temp;
        // temp deki degeri sayi1 e atadik


        System.out.println("sayilarin degerini yer degistirdim"
        + "\nsayi1'in yeni degeri : " + sayi1
        + "\nsayi2'nin yeni degeri : " + sayi2);

    }
}
