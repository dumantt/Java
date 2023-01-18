package JavaPracticeTeamAbdullahBey;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Q19_AnaMenu {
    Scanner scan = new Scanner(System.in);
    void menu(){
        System.out.print("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n" +
                "\t SEÇİMİNİZ: ");
        int secim=0;
        try {
            secim=scan.nextInt();
            switch (secim){
                case 1:{
                    Q19_OgrenciIslemler ogrenciMenu=new Q19_OgrenciIslemler();
                    ogrenciMenu.ogrenciMenu();
                }
                case 2:{
                    Q19_OgretmenIslemler ogretmenMenu=new Q19_OgretmenIslemler();
                    ogretmenMenu.ogrtMenu();
                }

            }
        }catch (InputMismatchException e){
            String kontrol = scan.next();
            if (kontrol.equalsIgnoreCase("q")){
                System.out.println("SİSTEMDEN ÇIKIYOR");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                menu();
            }

        }
    }
}
