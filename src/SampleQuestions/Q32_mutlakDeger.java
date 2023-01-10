package SampleQuestions;

import java.util.Scanner;

public class Q32_mutlakDeger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

            if (sayi < 0) {
            System.out.println("girilen sayinin mutlak degeri = " + sayi*(-1));}
            else {
                System.out.println("girilen sayinin mutlak degeri = " + sayi);
            }
    }
}
