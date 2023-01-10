package SampleQuestions;

import java.util.Scanner;

public class Q27_ciftSayiBul {
    public static void main(String[] args) {


        /*
        Soru 24-)
20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
Örnek:
100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
ipucu:
Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i+=2 ){
            System.out.print(i + " ");
        }
        System.out.println("======================");
        for (int i = 0; i <= sayi; i++) {
            if (i%2==0) System.out.print(i+ " ");
        }
    }
}
