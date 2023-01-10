package SampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q42_herKarakteriSayiyiBirKereYazdir {
    public static void main(String[] args) {

        /*
        Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
                (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
                On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen oluşturmak istediğiniz arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();
        Integer [] arr = new Integer[sayi];

        for (int i = 0; i < sayi; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("lütfen elemanları giriniz");
            arr[i] = scan1.nextInt();
        }
        System.out.println("ilk array : " +  Arrays.toString(arr));

        ayniOlanlariSil(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void ayniOlanlariSil(Integer [] arr) {
        //public static int[] eliminateDuplicates(int[] list)

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!sayilar.contains(arr[i]))
                        sayilar.add(arr[i]);
            }
        System.out.println("Birbirinden farkli girilen sayilar : " + sayilar);
        }
    }

