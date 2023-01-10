package day03_dataCasting_MatematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
        // integer

        String str2= "123";
        String str3= "354";
        int str2Int = Integer.parseInt(str2);
        int str3Int = Integer.parseInt(str3);
        System.out.println(str2Int+str3Int);
        //bu kodları stringin sayılardan oluşması sebebiyle kullandık Integer.parseInt(str2); gibi
        // eger stringin içerisinde herhangi bir harf olsaydı kod patlardı sadece sayılardan oluşanlarda çalışıyor

        System.out.println(Integer.MAX_VALUE); // Integerin max degeri
        System.out.println(Integer.MIN_VALUE); // Integerin max degeri ezbere gerek yok direkt boyle cıkıyor.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        char krk1= '$';
        System.out.println(Character.isDigit(krk1)); //false
        System.out.println(Character.isLetter(krk1)); //false
        System.out.println(Character.isAlphabetic(krk1)); // false
        System.out.println(Character.isBmpCodePoint(krk1)); //true

        short sayi3= 4;
        int sayi5 = sayi3;

        /* Wrapper classlarda casting olmaz

        Short sayi6=45;
        Integer sayi7 = (Integer) sayi6;

         */




    }
}
