package day11_forLoops;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        // verilen input'a gore carpim tablosu olusturun - method yazarak -
        // Java'da ic ice yapilara nested denir
        // burada sadece farkli olan i'nin katsayisi oldugundan onun icin de bir loop olusturalim
        int input = 4 ;
        /*
             1 2  3  4
             2 4  6  8
             3 6  9 12
             4 8 12 16
         */
        // 1 2  3  4
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i + " "); // >>> bu yanyana yazdiriyor anlaşıldıgı üzere
        }
        System.out.println("");          // >>> bu hiçlik bir alt satira atsin diye yapildi
        // 2 4  6  8
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i + " ");
        }
        System.out.println("");
        // 3 6  9 12
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }
        System.out.println("");
        // 4 8 12 16
        for (int i = 1; i <=4 ; i++) {
            System.out.print(4*i + " ");
        }
        System.out.println("");
        System.out.println("==============");

        // Nested loop ile yapalim

        for (int i = 1; i <=4 ; i++) { // OUTER loop denir ve i'nin carpilacagi sayiyi kontrol edecek
            for (int m = 1; m <=4 ; m++) { // INNER loop denir ve onceki ornekteki i degiskenini kontrol eder
                System.out.print(i * m + " ");
            }
                System.out.println("");

        }
        // outer loop'un her bir deger artisi icin
        // inner loop bastan sona calisir

        /* NOT method sanirim bu sekilde calisiyor
        üst 1 basti
        alt 1234 basti
        alt satirda sout i*m carpma islemi yapildi sonuclar  1" "2" "3" "4 seklinde yazdirildi
        parantez disi alt satirda println LN oldugu icin alt satira atip hiclik yazdi
        loop bu sekilde devam etti
         */
    }
}
