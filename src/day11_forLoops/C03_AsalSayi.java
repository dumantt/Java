package day11_forLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        // input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        // Bunu ben yaptim ve ilk böleni kismini ekledim

        int input=1717;
        String sonuc= "Sayi asal";
        for (int i = 2; i < input ; i++) {
            if (input%i==0){sonuc="Sayi asal degil ve ilk böleni : " +i ;
                break;}
                // birden fazla boleni olunca birden fazla kez "Sayi asal degil" yazmasin diye break yazdi
                // else kullanmamamizin sebebi ilk bolunemeyende asal diyecekti onun icin
        }
        System.out.println(sonuc);



         /* Bunu ben yaptım bütün bölenleri göstereyim dedim ama calismadi neden bulamadim

        int input=1717;
        for (int i = 2; i < input ; i++)
            System.out.println();(input % i == 0 ? "böleni : " + 'i' : "asal sayi");

          */

        /* Bu hocanin yaptigi

        int input=4737;
        String sonuc= "Sayi asal";
        for (int i = 2; i < input ; i++) {
            if (input%i==0){
                sonuc="Sayi asal degil";
                break;
                // Java, bir loop'un icerisinde "break" gorurse
                // o loop'u bitirir
            }
        }
        System.out.println(sonuc);

         */


    }
}
