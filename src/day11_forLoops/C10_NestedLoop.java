package day11_forLoops;

public class C10_NestedLoop {
    public static void main(String[] args) {

         /*
            1                   1. satir 1’den 1’e kadar yazdir
            1  2                2. satir 1’den 2’e kadar yazdir
            1  2  3             3. satir 1’den 3’e kadar yazdir
            1  2  3  4.         4. satir 1’den 4’e kadar yazdir
         */
        int input=8;
        for (int i = 1; i <=input ; i++) { // 4 satir oldugu icin outer loop 1-4 arasi olacak //dinamik degisiyor
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }

        /* sistem soyle calisiyor
        ilk satir calisti 1
        ikinci satir calisti 1 e kadar
        alt satirda 1 i yazdirildi
        alt satirda alt satira gecmek icin println hiclik calisti alt satira atti
        loop tekrar calisti ilk satir 2
        ikinci satir calisti 1 2
        alt satir 1 ve 2 yi yazdirdi
        ............. devam ediyor
         */

    }
}
