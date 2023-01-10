package day03_dataCasting_MatematikselIslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl = 23.5;
        int sayi =(int)dbl;
        System.out.println(sayi);

        // double nin ondalık kısmını attı 23.5 yerine 23 olarak sonuc verdi int
        //veri kaybı oldu

        //byte byt = sayi; bu sekilde yazarsak kabul etmeyecek ama
        byte byt = (byte)sayi;
        // bu şekilde kodlarsak kabul edecektir fakat data kayıplarını göze almamız gerekiyor.
        System.out.println(byt);

        sayi=130;
        byt=(byte)sayi;
        System.out.println(byt);
        // yine aynısını yaptık kabul etmeyecegi icin parantez icinde byte yazdık

        //sonuc -126 cıktı neden?
        /* sebebi byte -128 ile +127 arasında tam sayı dogrultusunda islem yapıyor 130 icin
        127 ye gitti sonra -128, -127, -126 ya ulasti
         */
        sayi=255;
        byt=(byte)sayi;
        System.out.println(byt);
        // yine aynı mantıkla sonuc -1 cıktı

        sayi=13000;
        byt=(byte)sayi;
        System.out.println(byt);
        // yine aynı sekilde donguleri tamamladı ve -56 buldu

        /* explicit Narrowing
        genis kapasiteli bir bilgiyi dar kapasiteli bir tdata türüne kastin yaparken java bunu otomatik olarak
        gerceklestirmez ve inisiyatif almanızı ister bu sebeple
        (donustuurmek istedigimiz data turu) seklinde yazarız
        bu sekilde yaptıgımızda data kayıpları mümkündür ve göze aldığımız dan kastımız da budur
         */





    }
}
