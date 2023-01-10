package JavaPracticeTeam108;

import java.util.Scanner;

public class day07_ziplayanTop {
    /*
       top belirli bir yükseklikten atılıyor
       3/4 oranında zıplıyor
       1 metrenin altına düştüğünde duruyor
       zıplama sayısı ve aldığı yolu yazdıran while code blogu create edininiz
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen topun yüksekliğini giriniz");
        double topunYuksekligi = scan.nextDouble();
        double topunToplamYolu = 0;
        int topunYereVurmaSayisi = 0;
        do { topunToplamYolu+= topunYuksekligi;
            topunYereVurmaSayisi++;
            topunYuksekligi *= 0.75 ;
            topunToplamYolu+= topunYuksekligi;

        }while (topunYuksekligi>=1);

        System.out.println("topun toplam aldığı yol : " + topunToplamYolu);
        System.out.println(" topun yere vurma sayısı : " + topunYereVurmaSayisi);






    }
}
