package SampleQuestions;

import java.util.Scanner;

public class Q13_vucutKitleEndeksi {
    public static void main(String[] args) {

        /*
        Soru 10-)  Klasik Soru :slightly_smiling_face:
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez

        ÖRNEK :

        Ağırlık : 71
        Yükseklik : 1,72

        ÇIKTI :

        VKİ değeriniz : 23.99945916711736 Kilonuz ideal (edited)

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu cm cinsinden giriniz");

        int boy = scan.nextInt();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");

        int kg = scan.nextInt();

        double vki = (double)(kg)/ (double) (boy*boy) * 10000;

        if (vki<18.5) {
            System.out.println("Vucut kitle endeksiniz :" + vki + " zayifsiniz kilo almalisiniz");
        } else if (18.5<=vki && vki<=25) {
            System.out.println("Vucut kitle endeksiniz :" + vki + " kilonuz ideal Maşallah");
        } else if (25<vki&&vki<30) {
            System.out.println("Vucut kitle endeksiniz :" + vki + " sismansiniz kilo vermelisiniz");
        } else if (30<=vki) {
            System.out.println("Vucut kitle endeksiniz :" + vki + " obezsiniz acil kilo vermelisiniz");
        }
    }
}
