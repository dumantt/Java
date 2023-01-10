package JavaPracticeTeam108;

import java.util.Locale;
import java.util.Scanner;

public class day06_Q1_BirimDonusturucu {

    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
    // ceviren bir method yaziniz.
    // Bu methodu main methodun disinda olusturup main methodun
    // icinden cagiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Donusturmek istediğiniz birimi giriniz : \n => Saat \n => Mil \n => Kilogram ");
        String birim = scan.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Donusturmek istediğiniz birimin miktarını giriniz :");
        double miktar = scan.nextDouble();

        donusturucu(birim,miktar);

    }

    private static void donusturucu(String brm, double mktr) {

        switch (brm) {

            case "saat":
                System.out.println(mktr + " saat " + mktr*60*60 + " saniyedir");
                break;
            case "mil":
                System.out.println(mktr + " mil " + mktr*1.6 + " kilometredir");
                break;
            case "kilogram":
                System.out.println(mktr + " kilogram " + mktr*1000 + " gramdır");
                break;
            default:
                System.out.println("Saat-Mil-Kilogram dışında bir deger girdiniz \n işlemin gerçekleşmesini istiyorsanız yonergelere uyunuz");

        }
    }
}
