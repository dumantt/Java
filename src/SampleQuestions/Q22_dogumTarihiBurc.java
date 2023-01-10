package SampleQuestions;

import java.util.Scanner;

public class Q22_dogumTarihiBurc {
    public static void main(String[] args) {

        /*
        Soru 19-)
Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
ipucu:
Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dogum tarhinizi arasina slash (/) koyarak giriniz Ör: 01/01/2000");
        String tarih = scan.next();
        String tarih1 = tarih.replaceAll("/","");
        String gun = tarih1.substring(0,2);
        String ay =tarih1.substring(2,4);
        String aygun = ay+gun;
        int burc = Integer.parseInt(aygun);

        if (321 <= burc && burc <= 420) System.out.println("Burcunuz : Koç");
        else if (421 <= burc && burc <= 520) System.out.println("Burcunuz : Boğa");
        else if (521 <= burc && burc <= 621) System.out.println("Burcunuz : İkizler");
        else if (622 <= burc && burc <= 722) System.out.println("Burcunuz : Yengeç");
        else if (723 <= burc && burc <= 823) System.out.println("Burcunuz : Aslan");
        else if (824 <= burc && burc <= 923) System.out.println("Burcunuz : Başak");
        else if (924 <= burc && burc <= 1023) System.out.println("Burcunuz : Terazi");
        else if (1024 <= burc && burc <= 1122) System.out.println("Burcunuz : Akrep");
        else if (1123 <= burc && burc <= 1221) System.out.println("Burcunuz : Yay");
        else if (1222 <= burc && burc <= 1231 || 101<= burc && burc<=120) System.out.println("Burcunuz : Oğlak");
        else if (121 <= burc && burc <= 219) System.out.println("Burcunuz : Kova");
        else if (220 <= burc && burc <= 320) System.out.println("Burcunuz : Balık");
    }
}
