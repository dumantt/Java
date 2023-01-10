package SampleQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q31_dersSecimi {

    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Verilecek Olan Egitimde Kac Adet Ders Almak istiyorsunuz  ?");


        int n = scan.nextInt();

        ArrayList<String> dersler = new ArrayList<String>();


        System.out.println("Almak istediginiz Dersleri Yaziniz.");

        for (int i = 0; i < n; i++) {
            dersler.add(scan.next());
        }
        System.out.println("Aldıgınız Dersler :");
        for (int i = 0; i < n; i++) {
            System.out.println(dersler.get(i));
        }
        System.out.println();
        System.out.println("Eklediginiz Derslerden Hangisinin Sirasini ogrenmek istiyorsunuz?");

        String ders = scan.next();
        System.out.println();

        if (dersler.contains(ders) == true) {

            System.out.println("Eklediginiz Ders :" + ders);

            System.out.println("Eklediginiz Dersin Egitimini " + (dersler.indexOf(ders) + 1) + ". Sirada Alacaksiniz");

        } else {
            System.out.println("Aradigıniz Ders, Secimlerinizde Gozükmemektedir.");

        }
    }
}
