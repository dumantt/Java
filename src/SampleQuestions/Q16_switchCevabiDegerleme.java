package SampleQuestions;

import java.util.Scanner;

public class Q16_switchCevabiDegerleme {
    public static void main(String[] args) {

        /*
        Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
Ipucu:
Switch konusunu hatırlayalım!
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cevabi harf olarak giriniz");
        String cevap = scan.next();
        cevap = (cevap.toLowerCase());
        char yanit = cevap.charAt(0);

        switch (yanit) {
            case 'a' :
                System.out.println("İsteğiniz işleniyor");
                return ;
            case 'b' :
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                return;
            case 'c' :
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                return;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}
