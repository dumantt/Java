package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);
        System.out.println(29/3);
        int sayi1 = 25;
        int sayi2 = 6;
        System.out.println(sayi1/sayi2);
        double dbl=6;
        System.out.println(sayi1/dbl);

       /* Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bölmek istediğiniz sayıları giriniz");
        int ilkSayı = scan.nextInt();

        int ikinciSayı = scan.nextInt();
        System.out.println("Bölme Sonucu" + (ilkSayı/ikinciSayı));

        */

        // int olduğu için küsürat yok  sadece tam sayı sonucu çıktı

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bölmek istediğiniz sayıları giriniz");
        int ilkSayı = scan.nextInt();

        int ikinciSayı = scan.nextInt();
        System.out.println("Bölme Sonucu" + ((double)ilkSayı/ikinciSayı));
        /* sadece birini double yapmamız yeterli onun icin sadece ilk sayının önüne double ekledik ve
        küsüratlı sonuc bulduk. ikinci sayının önüne eklersek yine aynı sonuc olur
         */
    }

}