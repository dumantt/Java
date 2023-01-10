package JavaPracticeTeam108;

import java.util.Scanner;

public class day02_Q1_RakamPozitifSayi {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        // bu hocanin cozumu

        /*  public static void main(String[] args) {

        Scanner cicek = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = cicek.nextInt();

        System.out.println("****************** IF Cozumu ********************");

        if (sayi>=0) {
            if (sayi<10){
                System.out.println("Girdiginiz sayi bir Rakamdir");
            }else{
                System.out.println("Girdiginiz sayi bir Pozitif Sayidir");
            }
        }else {
            System.out.println("Girdiginiz sayi bir Negatif Sayidir");
        }

        */

        System.out.println("****************** Ternary Cozumu ********************");

        Scanner cicek = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = cicek.nextInt();

        String result = (sayi >= 0) ? ((sayi < 10) ? "Rakam" : "Pozitif Sayi") : ("Negatif Sayi");

        //              ilk şart     ? --------------dogru ise---------------- : ---yanlis ise---;
        //                    içindeki ikinci sart ? dogru ise: yanlis ise

        System.out.println(result);
    }


        /*

        //bu da benim If cozumum

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        if (0<=sayi && sayi<10 ) System.out.println("Girdiginiz sayi bir Rakamdir");
        if (10<=sayi) System.out.println("Girdiginiz sayi bir Pozitif Sayidir");
        if (sayi<0) System.out.println("Girdiginiz sayi bir Negatif Sayidir");

         */





}
