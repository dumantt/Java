package day06_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseIf {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Urunun liste fiyatını giriniz");
        double listeFiyati = scan.nextDouble();

        System.out.println("Musteri Kartınız var mı? \n E: Evet  H: Hayır");
        char kartVarMi =scan.next().charAt(0);

        if (kartVarMi== 'E' && urunAdedi>10) {
            System.out.println("%20 indirimli toplam fiyat : "+ urunAdedi*listeFiyati*0.8);
        } else if (kartVarMi== 'E' && urunAdedi>0) {
            System.out.println("%20 indirimli toplam fiyat : "+ urunAdedi*listeFiyati*0.85);

        } else if (kartVarMi== 'H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat : "+ urunAdedi*listeFiyati*0.85);
        } else if (kartVarMi== 'H' && urunAdedi>0) {
            System.out.println("%10 indirimli toplam fiyat : "+ urunAdedi*listeFiyati*0.9);
        } else {
            System.out.println("Hatalı bilgi");}
    }
}
