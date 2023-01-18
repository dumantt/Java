package JavaPracticeTeamAbdullahBey;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q19_OgrenciIslemler implements Q19_IIslemler {
    Scanner scan = new Scanner(System.in);
    static int numara=100;

    static ArrayList<Q19_Ogrenci> ogrenciList=new ArrayList<>();
    void ogrenciMenu() {
        System.out.print("=============ÖĞRENCİ İŞLEMLERİ =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim = 0;
        try {
            secim = scan.nextInt();

        } catch (InputMismatchException e) {
            String kontrol = scan.next();
            if (kontrol.equalsIgnoreCase("q")) {
                Q19_AnaMenu anaMenu = new Q19_AnaMenu();
                anaMenu.menu();
            } else {
                System.out.println("HATALI GİRİŞ YAPILDI.");
                ogrenciMenu();
            }
        }
        switch (secim) {
            case 1: {
                ekleme();
            }
            case 2: {
                arama();
            }
            case 3: {
                listeleme();
            }
            case 4: {
                silme();
            }
        }
    }

    @Override
    public void ekleme() {
        System.out.print("ÖĞRENCİNİN ADINI GİRİNİZ: ");
        scan.nextLine();
        String ad=scan.nextLine();
        System.out.print("ÖĞRECİNİN SOYADINI GİRİNİZ: ");
        String sAd=scan.nextLine();
        System.out.print("ÖĞRENCİNİN TC NOSUNU GİRİNİZ: ");
        String tcNo=scan.next();
        System.out.print("ÖĞRECİNİN YASINI GİRİNİZ: ");
        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRENCİNİN SINIFINI GİRİNİZ: ");
        String sinif=scan.next();
        Q19_Ogrenci ogrenci=new Q19_Ogrenci(ad,sAd,tcNo,yas,numara++,sinif);
        ogrenciList.add(ogrenci);
        listeleme();
        ogrenciMenu();

    }

    @Override
    public void arama() {
        System.out.print("ARANACAK KİŞİNİN TC NOSUNU GİRİNİZ: ");
        String tcNo=scan.next();
        int kontrol=0;
        for (Q19_Ogrenci each:ogrenciList) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println("ARANAN KİŞİ: "+ each);
                kontrol=1;
                ogrenciMenu();
            }
        }
        if (kontrol==0){
            System.out.println(tcNo+" TC NOLU KİŞİ YOKTUR");
            ogrenciMenu();
        }

    }

    @Override
    public void listeleme() {
        for (Q19_Ogrenci each:ogrenciList) {
            System.out.println(each);
        }
        ogrenciMenu();
    }

    @Override
    public void silme() {
        System.out.print("SİLİNECEK KİŞİNİN TC NO SUNU GİRİNİZ: ");
        String tcNo=scan.next();
        boolean kontrol=true;

        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTcNo().equals(tcNo)){
                System.out.println("SİLİNECEK KİŞİ: "+ ogrenciList.get(i));
                ogrenciList.remove(i);
                kontrol=false;
                listeleme();

            }
        }
        if (kontrol){
            System.out.println(tcNo+" TC NOLU KİŞİ YOKTUR");
            ogrenciMenu();
        }

    }
}
