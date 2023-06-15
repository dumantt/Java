package day02_variables_scanner;

import java.util.Scanner;

public class C10_Sacnner {
    public static void main(String[] args) {
        // kullanicidan bir double bir de int sayi alip bunlarin toplamini ve carpimini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalık sayı giriniz");
        double sayiDbl = scan.nextDouble();
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayiInt = scan.nextInt();
        System.out.println("Sayilarin toplami : " + (sayiInt+sayiDbl));
        System.out.println("Sayilarin carpimi : " + (sayiInt*sayiDbl));

    }
}
