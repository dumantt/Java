package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini alin
        // ve girileen ismi buyuk harflerle yazdirin
        // kullanicidan deger almak icin 3 islem yapmaniz gerekir
        //1 . adım scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);
        // bu 1. adım hic değismiyor
        // 2. adım kullanciya ne istediginizi soyleyin
        System.out.println("isminizi yazin");
        // 3. adım kullanicinin girecegi degeri kaydedeceginiz bir variable olusturun
        // scan objesi ile ilgili method'u kullanarak kullanicinin girdiggi degeri
        // olusturdugunuz variable'a atayin
        String girilenIsim = scan.nextLine();
        //Artik kullanicinin girdiği
        System.out.println(girilenIsim.toUpperCase());


    }
}
