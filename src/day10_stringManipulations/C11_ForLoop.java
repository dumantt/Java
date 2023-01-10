package day10_stringManipulations;

import java.util.Scanner;

public class C11_ForLoop {
    public static void main(String[] args) {


        // verilen sayinin faktoryelini hesaplayin
        // 5! = 5*4*3*2*1



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini almak istediginiz sayiyi giriniz");
        int sayi = scan.nextInt();
        int carpim = 1;

        for ( int loop = sayi; loop >=1 ; loop--) {
            carpim *=loop;
        }
        System.out.println("girlen sayinin faktöriyeli = " + carpim);



        /* Hocanin yaptigi

        int input=6;
        int carpim=1;
        for (int i = input; i >=1 ; i--) {
            carpim*=i;
        }
        System.out.println("verilen " + input + " sayisinin faktoryeli : " + carpim);

         */


    }
}
