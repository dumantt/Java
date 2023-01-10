package SampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q37_arrayiTersGirin {
    public static void main(String[] args) {

        /*
        Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen oluşturmak istediğiniz arrayin uzunlugunu giriniz");
        int sayi = scan.nextInt();

        String [] arr = new String[sayi];

        for (int i = sayi-1; i >=0; i--) {

            Scanner scan1 = new Scanner(System.in);
            System.out.println("lütfen elemanları giriniz");
            arr[i] = scan1.next();
        }
            System.out.println(Arrays.toString(arr));
    }
}

