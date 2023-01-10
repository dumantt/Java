package SampleQuestions;

import java.util.Scanner;

public class Q21_hızZamanYol {
    public static void main(String[] args) {

        /*
        Soru 18-)
        Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        İpucu:
        yol=Hız*zaman
        Soru 18-)
Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım. Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
İpucu:
yol=Hız*zaman
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gidilecek mesafenin uzunlugunu km cinsinden giriniz");
        double mesafe = scan.nextDouble();
        System.out.println("lütfen ortalama hızınızı km/saat cinsinden km olarak giriniz");
        double hiz = scan.nextDouble();

        System.out.println("tahmini seyahat süreniz " + mesafe/hiz + " saat");
    }
}
