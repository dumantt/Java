package SampleQuestions;

import java.util.Scanner;

public class Q2_sesliSessizHarf {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf isteyin.
        Kullanıcı birden fazla harf girerse ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
        Harf sesli harf ise harf sesli bir harftir, değilse girilen harf sesli harf değildir yazdırın.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        String harf = scan.next().toUpperCase(); // büyük harf stringde çıkıyor çar da çıkmıyor

        char ilkHarf = harf.charAt(0);

        if (ilkHarf=='A' || ilkHarf=='E' || ilkHarf=='O'|| ilkHarf=='U'|| ilkHarf=='I'|| ilkHarf=='İ'|| ilkHarf=='Ü'|| ilkHarf=='Ö') {
            System.out.println("girilen harf sesli harftir");
        } else {
            System.out.println("girilen harf sesli harf degildir");
        }


    }
}
