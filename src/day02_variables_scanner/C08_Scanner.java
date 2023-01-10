package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /* Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip dikdortgenin alanini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uzulugunu girin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        System.out.println("Dikdortgenin alani : " + kenar2*kenar1);
    }
}
