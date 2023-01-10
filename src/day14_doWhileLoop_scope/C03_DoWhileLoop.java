package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // verilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri yazdirin

        char baslangic='f';
        char bitis='m';

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ilk harfi giriniz");
        baslangic =scan.next().charAt(0);

        System.out.println("lütfen son harfi giriniz");
        bitis =scan.next().charAt(0);

        do {
            System.out.print(baslangic + " ");
            baslangic= (char)(baslangic+1);
        }while(baslangic<=bitis);
    }
}
