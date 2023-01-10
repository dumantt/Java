package SampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q38_arraydeStringiTersCevir {
    public static void main(String[] args) {

        /*
        Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scan.nextLine();
        int uzunluk = cumle.length();
        String[] harf = cumle.split( "");

        for (int i = uzunluk-1; i >=0 ; i--) {

            System.out.print(harf [i]);
        }
    }
}
