package SampleQuestions;

import java.util.Scanner;

public class Q12_zamaniSaniyeyeCevirme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen saniyeye cevirmek istediginiz saat degerini giriniz");

        int saat = scan.nextInt();

        System.out.println("Lütfen saniyeye cevirmek istediginiz dakika degerini giriniz");

        int dakika = scan.nextInt();

        System.out.println("Lütfen saniyeye cevirmek istediginiz saniye degerini giriniz");

        int saniye = scan.nextInt();

        System.out.println("Girdiginiz sürenin saniye karşılıgı: " + ((saniye) + (dakika*60) + (saat*3600))+ " saniyedir");


    }
}
