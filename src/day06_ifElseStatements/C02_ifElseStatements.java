package day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen ikizkenar ise “ikizkenar ucgen” yazdirin, degilse “ikizkenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2 && kenar2!=kenar3)||
                (kenar1==kenar3 && kenar1!=kenar2) ||
                (kenar2 == kenar3 && kenar3 != kenar1))
        {System.out.println("ikizkenar ucgen");
        }
        else
        {
            System.out.println("ikizkenar ucgen değildir");}

        /*   if (kenar1==kenar2 && kenar2!=kenar3||
                kenar1==kenar3 && kenar1!=kenar2 ||
                kenar2 == kenar3 && kenar3 != kenar1)

                BU KOD PARANTEZLER SİLİNEREK BU ŞEKİLDE DE ÇALIŞTIRILABİLİR AMA HATA YAPABİLİRİZ
        {System.out.println("ikizkenar ucgen");
        }
        else
        {
            System.out.println("ikizkenar ucgen değildir");}


         */






    }
}
