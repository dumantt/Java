package day06_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenKarakter = scan.next().charAt(0);

        if (girilenKarakter>= 'A' && girilenKarakter<='Z') {
            System.out.println("girilen harf büyük harftir");
        } else {
            System.out.println("Girilen harf büyük harf degildir");}

    }
}
