package SampleQuestions;

import java.util.Scanner;

public class Q9_cayBardakSekerGramKgHesabi {
    public static void main(String[] args) {
        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz");

        double bardak = scan.nextDouble();

        System.out.println("Cayinizi kac sekerli iciyorsunuz");

        double seker = scan.nextDouble();
        double sekerGram = seker*1.5;

        System.out.println("Yilda " + bardak*365 + " cay iciyorsunuz");
        System.out.println("Yilda " + (bardak*sekerGram*365/1000) + "kg şeker tüketiyorsunuz");

    }

}
