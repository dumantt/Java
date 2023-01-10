package SampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q35_arrayiKullaniciyaDoldurt {
    public static void main(String[] args) {

        /*
        Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen oluşturmak istediğiniz arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();

        String [] arr = new String[sayi];

        for (int i = 0; i < sayi; i++) {

            Scanner scan1 = new Scanner(System.in);
            System.out.println("lütfen elemanları giriniz");
            arr[i] = scan1.next();

        }
        System.out.println(Arrays.toString(arr));
    }
}
