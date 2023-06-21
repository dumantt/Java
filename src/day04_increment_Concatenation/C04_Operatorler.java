package day04_increment_Concatenation;

public class C04_Operatorler {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        boolean c;
        System.out.println(c=a*15==b*10); //true

        System.out.println(c); //true
        System.out.println(!true); // false
        System.out.println(!(a<b)); //false


        // == eşittir demek
        // != eşit degildir demek
        // ! ünlem işareti başına geldigi şeyleri olumsuz yapar java da

        /* and işareti iki tane & ve &&  sonuçları aynı tek fark
        && ilk yanlışı gördüğünde direkt sonucu verir
        & yanlışı görse de sonuna kadar gider ve sonucu verir
        işlem yükü ve yapılan hataları görebilme farkı var
         */

        // or işareti || herhangi bir dogru varsa dogru çıkar sonuç

        /*int a=10;
        hem üçe hem beşe bölünebilen sayılar
        a%3==0 && a%5==0 modulus isareti bolumden kalani verir
        0 ile yüz arasında
        0<a && a<100
        java en fazla iki karşılaştırma yapıyor uc veya daha fazla farklı sayı ya bolunme olayı nı
        ayrırarak yapabiliyoruz
         */

        /* 0 dan kucuk veya 100 den buyuk java da boyle yazabiliriz
        0<a || a>100
         */




    }
}
