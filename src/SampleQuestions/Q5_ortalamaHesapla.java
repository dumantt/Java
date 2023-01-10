package SampleQuestions;

import java.util.Scanner;

public class Q5_ortalamaHesapla {
    public static void main(String[] args) {

        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        // bes sayi demis ama bnen ileride de kullanayim diye sinirsiz sayi girisi yaptim 0 olarak giris yapinca sonuc veriyor

        int toplam =0;

        int sayi;
        int bolum = 0;

        Scanner scan = new Scanner(System.in);
        do {
        System.out.println("Lütfen bir sayi giriniz");
        sayi = scan.nextInt();

        toplam += sayi;
        bolum ++;
        }
        while (sayi!=0);

        System.out.println("Girilen sayilarin ortalamasi : " + toplam/(bolum-1));
        // sıfır da bir kez daha islem yaptirdigi icin bolumu bir azaltiyoruz ortalamayi bulurken
    }
}
