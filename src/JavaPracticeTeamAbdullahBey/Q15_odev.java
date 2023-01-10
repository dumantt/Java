package JavaPracticeTeamAbdullahBey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q15_odev {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen oluşturmak istediğiniz arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();

        Integer [] arr = new Integer[sayi];

        for (int i = 0; i < sayi; i++) {

            Scanner scan1 = new Scanner(System.in);
            System.out.println("lütfen elemanları giriniz");
            arr[i] = scan1.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int count = 0;
        int flag = -1;

        for (int i = 0; i < arr.length; i++) {
            count +=i;
            flag++;
            if (count==arr.length) break;
       }
        System.out.println(count);
        System.out.println(flag);

        int arr2 [] = new int[flag];
        int toplam = 0, sayac = 0, indexAra = 1;

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j <= sayac ; j++) {
                toplam += arr[indexAra - 1 +j];
            }

            arr2[i] = toplam;
            sayac++;
            toplam = 0;
            indexAra += sayac;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
