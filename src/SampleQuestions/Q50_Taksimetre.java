package SampleQuestions;

import java.util.Scanner;

public class Q50_Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please write the distance in km");
        double km = input.nextDouble();

        TaksimetreHesabi(km);
    }

    private static void TaksimetreHesabi(double km) {

        double kmPrice = 2.20;
        double OpeninPrice = 10;
        double TotalPrice ;
        TotalPrice = km * kmPrice +OpeninPrice;

        //if (TotalPrice <= 20) { TotalPrice = 20; }
        TotalPrice = (TotalPrice<20) ? 20 : TotalPrice;

        System.out.println("Taksimeter Price : " + TotalPrice);
    }
}
