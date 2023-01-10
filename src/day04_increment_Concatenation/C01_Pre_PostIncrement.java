package day04_increment_Concatenation;

public class C01_Pre_PostIncrement {
    public static void main(String[] args) {

        int sayi=20;
        //sayiyi 3 artırın

        sayi += 3 ;
        System.out.println(sayi); //23

        //sayinin degerini 2 azaltın

        sayi -=2;
        System.out.println(sayi); //21

        sayi -- ;  // bir azalmanın kısayolu
        System.out.println(sayi); //20

        sayi ++ ;  // bir artırmanın kısayolu
        System.out.println(sayi);  //21

        sayi=10;
        sayi++; // tek işlem var iki işlem yok sıra önemsiz
        ++sayi; // tek işlem var iki işlem yok sıra önemsiz
        System.out.println(sayi); //12

        sayi=50;

        sayi= sayi + 10;
        System.out.println(sayi); //60

        sayi= sayi/2;
        System.out.println(sayi); //30

        sayi = sayi*5;
        System.out.println(sayi); //150

        sayi=sayi-25;
        System.out.println(sayi); //125

        sayi=10;
        System.out.println(sayi++); //10
        /* Java aynı satırda iki işlem olduğu için sıralama yapar önce yazdırır sonra artırır
        ama ekranda artırılmış hali görünmez
         */

        sayi=10;
        System.out.println(++sayi); //11
        /* Java aynı satırda iki işlem olduğu için sıralama yapar önce artırır sonra yazdırır
        ama ekranda artırılmış sayı görünür
         */
        System.out.println(sayi); //11



    }
}
