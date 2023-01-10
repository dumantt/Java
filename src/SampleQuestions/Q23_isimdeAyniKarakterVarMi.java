package SampleQuestions;

import java.util.Scanner;

public class Q23_isimdeAyniKarakterVarMi {
    public static void main(String[] args) {

        /*
        Soru 20-)
Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a name with maximum 3 characters");
        String name0 = scan.next();

        if (name0.length()>=4) System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        else {
            String name = name0.toLowerCase();
            char a = name.charAt(0);
            char b = name.charAt(1);
            char c = name.charAt(2);

            if ((a == b || a == c || b == c)) {
                System.out.println("Dizede yinelenen karakterler var");
            } else {
                System.out.println("String benzersiz karakterlere sahip");
            }
        }
    }
}
