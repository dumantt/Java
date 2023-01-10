package JavaPracticeTeamAbdullahBey;

import java.util.Scanner;

public class Q03_harfSayisi {
    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */
            System.out.println("Bir cümle giriniz= ");
            Scanner scan = new Scanner(System.in);
            String cumle = scan.nextLine().toUpperCase();
            int sayac = 0;
            for (int i = 0; i < cumle.length(); i++) {
                if (cumle.charAt(i) == 'A') {
                    sayac++;
                }
                if (cumle.charAt(i) == 'C') {
                    break;
                }


            }
            System.out.println(cumle + " A harfi " + sayac + " tane var");
        }
    }
