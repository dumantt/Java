package SampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q41_arrayinOrtasindakiDeger {
    public static void main(String[] args) {

        /*
        Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın. ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
        */

        //bu soru bitmedi

        Integer[] inputarr = {1, 2, 3, 4, 5, 6, 7,8,9,10};

        ortaDeger(inputarr);

    }

    private static int ortaDeger(Integer[] inputarr) {
        int uzunluk = inputarr.length;
        if (uzunluk % 2 == 0) {
            int deger = (uzunluk + 1) / 2;;
            System.out.println("array'in ortanca degeri = " + inputarr[deger-1] + "," + inputarr[deger]);

        } else {
            int deger = uzunluk / 2;
            System.out.println("array'in ortanca degeri = " + inputarr[deger]);
        }
        return uzunluk;
    }

}
