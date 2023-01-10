package day05_ifStatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {

        /* ogrenciden notonu sayı olarak alınız
        0-49,999 DD
        50-64,999 CC
        65-84,999 BB
        85-100 AA
         */

        // java üçlü kontrol yapmaz unutma !!
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz");
        double not = scan.nextDouble();

        if (0<= not && not<50){
        System.out.println("Notunuz DD Maalesef Kaldınız");
        }

        if (50<= not && not<65){
        System.out.println("Tebrikler Notunuz CC");
        }

        if (65<= not && not<85){
            System.out.println("Tebrikler Notunuz BB");
        }

        if (85<= not && not<100){
            System.out.println("Tebrikler Notunuz AA");
        }
        // java üçlü kontrol yapmaz unutma !!

    }
}
