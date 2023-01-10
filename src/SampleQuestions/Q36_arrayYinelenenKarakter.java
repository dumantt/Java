package SampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q36_arrayYinelenenKarakter {
    public static void main(String[] args) {

      /*
        Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıpkonteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();


        List<Character> harfler = new ArrayList<>();
        List<Character> son = new ArrayList<>();

        for (int i = 0; i < cumle.length(); i++) {
            for (int j = i + 1; j < cumle.length(); j++) {

                if (cumle.charAt(i) == cumle.charAt(j) ) {
                    if (!harfler.contains(cumle.charAt(i)))
                        harfler.add(cumle.charAt(i));
                }
            }
        }
        System.out.println("Yinelenen karakterler : " + harfler);
    }
}

