package day11_forLoops;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        // Bu soru da interviewlerde sorulan sorulardanmis

        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
        String str= "Java ogrenmek icin cok calismak lazim";
        String terstenStr="";
        for (int i = str.length()-1; i >= 0; i--) {
            terstenStr += str.substring(i,i+1);
        }
        System.out.println ("Girilen cumlenin tersten yazilisi : " + terstenStr);


        //println ama alt alta degil yanyana yazdirdi dikkat
        // kıvırcık parantez sout un altında olsaydı her basamagı birer ekleyerek yeniden yazacaktı
        // bu şekilde oldugu icin tek bir sefer ve sadece sonuncusunu yazdirmis oldu

    }
}
