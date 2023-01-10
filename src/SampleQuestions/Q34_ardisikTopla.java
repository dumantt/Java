package SampleQuestions;

public class Q34_ardisikTopla {
    public static void main(String[] args) {

       /*
       Soru29-)
       1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
       İpucu: Loop kulanabilirsiniz
       */

        int ilk = 1;
        int son = 100;
        int toplam = 0;

        for (int i = ilk; i <=son; i++) {

            toplam += i;

        }
        System.out.println("Sayilarin toplami = " + toplam);

        //  Matematikte sıfırdan sayiya kadar olan sayilarin toplami formulu =====> son sayi * (son sayi +1) / 2

        System.out.println("Sayilarin toplami = " + son * (son+1) / 2);
    }
}
