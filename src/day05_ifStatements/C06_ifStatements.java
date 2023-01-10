package day05_ifStatements;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {

        /* kullanıcıdan üç kenar uzuznlugunu  alın ve kenarlar eşitse eşkenar üçgen yazdırın
                */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){ System.out.println("Eşkenar Ucgen");}
        else {System.out.println("Eşkenar Ucgen Degil");}

        // burada else yapısını ilk deffa kullandık başka bir yolu daha varmış



    }
}
