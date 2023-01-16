package JavaPracticeTeamAbdullahBey;

import java.util.Scanner;
public class Q18_Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-KARE\n" +
                "\t\t 2-DİKDÖRTGEN\n" +
                "\t\t 3-DAİRE\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim= scan.nextInt();
        switch (secim){
            case 1:{
                Q18_Kare kare=new Q18_Kare();
                kare.alan();
                kare.cevre();
            }
            case 2:{
                Q18_Dikdortgen dikdortgen=new Q18_Dikdortgen();
                dikdortgen.alan();
                dikdortgen.cevre();
            }
            case 3:{
                Q18_Daire daire=new Q18_Daire();
                daire.alan();
                daire.cevre();
            }
        }
    }
}
