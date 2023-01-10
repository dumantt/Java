package day10_stringManipulations;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {


        // Soru 1 : Kullanicidan bir cumle alin
        // - cumlede ev geciyorsa, "home home sweet home" yazdirin
        // - cumlede is geciyorsa, "calismak guzeldir"
        // - ikisini de iceriyorsa "Hem ev lazim hem is"
        // - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        // hocanin yaptigi
        /*
        String str = "Evden calisiyorum, sirkete gitmeye gerek yok";
        String calisilacakStr = str.toLowerCase();
        if (calisilacakStr.contains("ev") && calisilacakStr.contains(" is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (calisilacakStr.contains(" is")) {
            System.out.println("calismak guzeldir");
        } else if (calisilacakStr.contains("ev")) {
            System.out.println("home home sweet home");
        } else {
            System.out.println("cok calisman lazim");
        }
        */
        // Benim yaptigim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cümle giriniz");
        String input = scan.nextLine();
        if (input.contains("ev") && input.contains ("is")) System.out.println("Hem ev lazim hem is");
        else if (input.contains("ev")) System.out.println("home home sweet home");
        else if (input.contains("is")) System.out.println("calismak guzeldir");
        else System.out.println("cok calisman lazim");



    }
}

