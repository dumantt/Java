package SampleQuestions;

import java.util.Scanner;

public class Q52_OtobusBileti {
    public static void main(String[] args) {

        /*
        Proje Konusu
#Java ile mesafeye ve durumlara göre otobüs bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaş ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgileri ile mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write the distance in km");
        double km = scan.nextDouble();
        System.out.println("Please Write your age");
        double age = scan.nextDouble();
        System.out.println("Please Write if trip is one way : 1 \nPlease Write if trip is round trip : 2");
        int direction = scan.nextInt();

        BusTicketPriceCalculator(km,age,direction);

    }

    private static void BusTicketPriceCalculator(double km, double age, int direction) {

        double Price = km * 0.10;

        switch (direction) {

            case 1 :
                if (age<12) {
                    Price = Price / 2;
                } else if (12<= age && age <= 24) {
                    Price = Price * 0.9;
                } else if (age > 65) {
                    Price = Price * 0.7;
                }
                System.out.println( "Ticket Price : " + Price + " Euro " );
                break;
            case 2 :
                Price = Price * 0.8;
                if (age<12) {
                    Price = Price / 2;
                } else if (12<= age && age <= 24) {
                    Price = Price * 0.9;
                } else if (age > 65) {
                    Price = Price * 0.7;
                }
                System.out.println( "Ticket Price : " + Price*2 + " Euro " );
                break;
        }

    }
}
