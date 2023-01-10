package JavaPracticeTeam108;

import java.util.Random;
import java.util.Scanner;

public class day07_tasKagitMakas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

        do {
            // Kullanicinin seçimi
            System.out.println("Asağidakilerden birini seçiniz \n " +
                    "1 = Tas\n" +
                    "2 = Kagit \n" +
                    "3 = Makas");
            userChoise = scan.nextInt();

            // Bilgisayarın seçimi
            //Random 0 dan başlayacaği için +1 ekliyoruz
            compChoise = rnd.nextInt(3) + 1;

            switch (compChoise) {
                case 1:
                    System.out.println("Bilgisayar Tasi seçti");
                    break;
                case 2:
                    System.out.println("Bilgisayar Kagidi seçti");
                    break;
                case 3:
                    System.out.println("Bilgisayar Makasi seçti");
                    break;
            }
            switch (userChoise) {
                case 1:
                    System.out.println("Oyuncu Tasi seçti");
                    break;
                case 2:
                    System.out.println("Oyuncu Kagidi seçti");
                    break;
                case 3:
                    System.out.println("Oyuncu Makasi seçti");
                    break;
            }



                if (userChoise == 1 && compChoise == 2) {
                    System.out.println("Kagit Tasi sarar! -- Bilgisayar +1 -- ");
                    comp++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else if (userChoise == 1 && compChoise == 3) {
                    System.out.println("Tas Makasi Kirar! -- Oyuncu +1 -- ");
                    user++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else if (userChoise == 2 && compChoise == 1) {
                    System.out.println("Kagit Tasi sarar! -- Oyuncu +1 -- ");
                    user++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else if (userChoise == 2 && compChoise == 3) {
                    System.out.println("Makas Kağidi Keser! -- Bilgisayar +1 -- ");
                    comp++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else if (userChoise == 3 && compChoise == 1) {
                    System.out.println("Tas Makasi Kirar! -- Bilgisayar +1 -- ");
                    comp++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else if (userChoise == 3 && compChoise == 2) {
                    System.out.println("Makas Kağidi Keser! -- Oyuncu +1 -- ");
                    user++;
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                } else {
                    System.out.println("Berabere");
                    System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
                }

            } while (user != 5 && comp != 5); {

                // Kazanani Gösterelim

                if (user > comp)
                    System.out.println("=================== Sen Kazandin!!!! ====================================");
                else
                    System.out.println("==================== Maalesef Kaybettin !!! ==============================");
            }
            scan.close();
        }
    }

