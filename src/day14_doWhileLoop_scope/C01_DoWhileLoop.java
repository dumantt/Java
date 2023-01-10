package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin
        int girilenSayi=-9; // kodun calismasi icin 0 dan baska her sayiyi yazabiliriz
                            // 0 yazarsak girilenSayi!=0 olacagi icin
                            // dogrudan nen alta gecer ve toplam yazdirir islem yapmadan
        int toplam= 0;
        Scanner scan= new Scanner(System.in);
        while(girilenSayi!=0){
            System.out.println("Lutfen toplanmak icin bir tamsayi giriniz");
            girilenSayi=scan.nextInt();
            toplam += girilenSayi; //toplam = girilenSayi + toplam;
        }
        System.out.println("Girilen sayilarin toplami : " + toplam);
        /*
            While loop'un 2 tane negatif yonu vardir
            1- loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
               yanlis bir deger verirsek, loop bodys'si hic calismayabilir
            2- loop condition'i loop body'sinden bir kez fazla calisir
            bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
            ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
         */
    }
}
