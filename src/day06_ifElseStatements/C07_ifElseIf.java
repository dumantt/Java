package day06_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseIf {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();
        double vke = kilo * 10000 / (boy * boy);
        System.out.println("Vucut kitle endeksiniz : " + vke);
        if (vke >= 30) System.out.println("Obezsiniz, gec kalmadan kendine ceki duzen vermelisin");
        else if (vke >= 25) System.out.println("Kilolusunuz, rejime baslamalisiniz");
        else if (vke >= 20) System.out.println("Kilonuz normal, boyle devam edin");
        else System.out.println("zayifsiniz, kilo almalisiniz");

 /* Bu kodu da ben yazdım neden çalışmadı anlamdım sürekli zayıfsınız diyor vücut kitle endeksi doru ama
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden tam sayı olarak giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu cm cinsinden tam sayı olarak girin");
        double boy = scan.nextDouble();

        System.out.println("Vücut kitle endeksiniz " + (kilo*10000)/(boy*boy));

        double vke= (kilo*1000)/(boy*boy);


        if ((vke)>=30) {
            System.out.println("Obezsiniz, Geç kalmadan kendine çeki düzen vermelisin");
        } else if (30>(vke) && (vke) >25) {
            System.out.println("Kilolusunuz, bir an önce diyete başlamalısınız");
        } else if (25>(vke) && (vke)>20) {
            System.out.println("Normal, böyle devam edin");
        } else  if (20>(vke) ) {
            System.out.println("Zayıfsınız, kilo lamalısınız");
        } else {
            System.out.println("Geçersiz");}
         */
    }
}