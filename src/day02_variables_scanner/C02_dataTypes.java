package day02_variables_scanner;

public class C02_dataTypes {
    public static void main(String[] args) {
        char karakter= 'w';
        char krk2 = '2';
        char krk3 ='%';
        /* char sadece tek karakter kabul ettiği için '1.' gibi şeyleri kabul etmez
        tırnakların içinde birden fazla karakteri kabul etmez/*
         */
        // blooean mantıksal seyler icin kullanılır true false gibi

        byte sayi= 127;
        short sayi1= 32767;
        int sayi2= 2147483647;
        long sayi3= 1520000018;
        /* int sinirlarindan buyuk bir değeri long variabl'a atamak istersek
        yanına l veya L yazmalıyız
         */


        float sayi4= 4.567F;
        /* Java ondalik sayilari otomatik olarak double kabul eder
        ozellikle float kullanmak istiyorsanız deger ataması yaparken yanina f veya F yazmalisiniz
         */
        double sayi5= 4.567;
        //sadece long ve float icin harf yazılıyor digerleri icin yazılmıyor//

    }
}
