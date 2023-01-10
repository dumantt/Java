package day09_stringManipulations;

public class C07_IlkTest {
    public static void main(String[] args) {


        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        /* Bu benim Yaptigim

        int sonucSayisiInt = Integer.parseInt() >>>>>>>> BU YAPIYI ILK DEFA BURADA GORDUM HOCA DAHA ONCE BAHSETTIM DEDI
        Value of yontemi de varmis
        -----------

        String input = "1-48 of 87 results for \"nutella\"";

        int OfIndexi = input.indexOf("of");
        int resultsIndexi = input.indexOf("results");

        String Sonuc = input.substring(OfIndexi+3,resultsIndexi-1);

        int sonucSayisiInt= Integer.parseInt(Sonuc);

        if (sonucSayisiInt>50) System.out.println("sonuc 50 den fazla PASSED");
        else System.out.println("sonuc elliden az FAILED");

         */


        String input = "1-48 of 87 results for \"nutella\"";
        int indexOf = input.indexOf("of");
        int indexResults = input.indexOf("results");
        String sonucSayisiString = input.substring(indexOf + 3, indexResults - 1);
        // arama sonuc sayisinin 50'den fazla oldugunu test edin
        int sonucSayisiInt = Integer.parseInt(sonucSayisiString);
        if (sonucSayisiInt > 50) {
            System.out.println("Nutella arama testi PASSED");
        } else {
            System.out.println("istenen kadar sonuc yok, Nutella arama testi FAILED");


        }

    }
}

