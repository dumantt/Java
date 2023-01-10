package day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Kullanicidan adını soyadını ve yaşını alıpp aşağıdaki formatta yazdırınız
        /* Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String girilenIsim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int girilenYas = scan.nextInt();
        System.out.println("Isminiz : "+ girilenIsim +
                            "\nSoyisminiz : " + girilenSoyisim +
                            "\nYasiniz : " + girilenYas +
                            "\nKaydiniz basariyla tamamlanmistir.");
        // \n konsolda cikacak metinin alt sattira cikmasini saglar
    }
}
