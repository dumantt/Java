package SampleQuestions;

import java.util.Scanner;

public class Q17_harfTekrari {
    public static void main(String[] args) {

        /*
        Soru 14-)
Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır. Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"  değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
Ipucu:
IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen uc harfli bir isim giriniz");
        String isim = scan.next();

        if (isim.length()>3) {
            System.out.println("Uc harfli bir isim girmeniz gerekmektedir lütfen yeniden giris yapiniz");
        } else {
            char harf1 = isim.charAt(0);
            char harf2 = isim.charAt(1);
            char harf3 = isim.charAt(2);

            if (harf1 == harf2 || harf2 == harf3 || harf1 == harf3) {
                System.out.println("Dize yinelenen karakterlere sahip");
            } else {
                System.out.println("Dize benzersiz karakterlere sahip");
            }
        }
    }
}
