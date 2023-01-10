package SampleQuestions;

import java.util.Scanner;

public class Q6_kupunuAlipIkiyeBolme {
    public static void main(String[] args) {

// Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
        System.out.println("Girdiginiz sayinin kupunun yarisi : " + sayi*sayi*sayi/2);


    }
}
