package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {
        /*
        char türünde tek tırnak içine yazıyoruz degerleri,
        char türünde matemaiksel işlem gerçekleştirmek isterseniz char türü ascii degerini alarak işlemi yapar
        ascii tableden charların aschii degerlerini görebiliriz
         */
        System.out.println('a'+'b'); //97+98=195
        System.out.println('a'-32); //97-32

        //kullanıcıdan bir char al
        //ascii table dan kullanicinin girdiği char'in sonrasındaki 3 karakteri yazdır
        //Örnek  input: a output :bcd

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0); //chartAt(0) 0= ilk demek ilk indeksteki char ı al demek
        // kendimiz yöntem oluşturup yapmaya çalıştığımız için böyle yaptık
        System.out.println(girilenKarakter+1);
        bu şekilde yapınca sonuç rakamsal çıktı
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        System.out.println ((char) (girilenKarakter+1) + ","+
                             (char) (girilenKarakter+2) + ","+
                              (char) (girilenKarakter+3)) ;
        // bu şekilde (char) ekleyerek karakter şeklinde çıktı alabiliriz.
        // klasik scan.int gibi scan.char variablesi olmadığı icin scan.next().charAt(0) yazdık 0 indeksin adı



    }
}
